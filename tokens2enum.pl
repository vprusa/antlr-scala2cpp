#!/usr/bin/env perl
# -*-mode:cperl -*-
=pod
Description:
Generates tokens as Java's enumeration.
Usage:
Date created: 2020-07
Author: Vojtech Prusa
=cut
use strict;
use warnings;

use Data::Dumper qw(Dumper);
use Getopt::Long qw(GetOptions);
use Scalar::Util qw(looks_like_number);

my $filename = './src/main/java/org/example/CPP14.tokens';

open(FH, '<', $filename) or die $!;

my %map;

while (<FH>) {
    # print $_;
    if ($_ =~ /^'/) {
        # print $_;
        my @vals = split('=', $_);
        if (looks_like_number($vals[1])) {
            $map{int($vals[1])}{'str'} = $vals[0] =~ s/\'//gr;
        }
    }
    elsif ($_ !~ /^(\n|\s)/) {
        # print $_;
        my @vals = split('=', $_);
        if (looks_like_number($vals[1])) {
            $map{int($vals[1])}{'enu'} = $vals[0];
        }
    }
}
# print Dumper(\%map);

=pod
while(my($k, $v) = each %map) {
    print $k . " ";
    # my %vmap = $v;
    print $v->{'str'} . "\n";
}
=cut

my $className = "CPP14TokensEnum";
my $outFile = "./src/main/java/org/example/$className.java";

open(FH, '>', $outFile) or die $!;

my $prefix = "package org.example;

public enum $className {

";
my $postfix = "
    private int i;
    private String val;

    $className(int i) {
        this.i = i;
    }

    $className(int i, String val) {
        this.i = i;
        this.val = val;
    }

}";
print FH $prefix;

my $linePrefix = "    ";

my ($i) = 0;

my $mapLen = keys %map;
foreach my $k (sort {$a <=> $b} keys %map) {
    my $v = $map{$k};

    print FH $linePrefix . $v->{'enu'};
    if (defined $v->{'str'}) {
        print FH "(" . $k . ", \"" . $v->{'str'} . "\")";
    }
    else {
        print FH "(" . $k . ")";
    }

    $i++;
    if ($i < $mapLen) {
        print FH ",\n";
    }
    else {
        print FH ";\n";
    }

}
print FH $postfix;

close(FH);