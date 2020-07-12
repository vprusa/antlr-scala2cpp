package org.example;

public enum CPP14TokensEnum3 {
    
    /*
               =1
               =2
               =3
               =4
               =5
               =6
               // TODO automate .. perl script ...
               'alignas'=9
               'alignof'=10
               'asm'=11
               'auto'=12
               'bool'=13
     */

    T__0(1, "!"),
    T__1(2, "not"),
    T__2(3, "&&"),
    T__3(4, "and"),
    T__4(5, "||"),
    T__5(6, "or"),
    MultiLineMacro(7),
    Directive(8),
    Alignas(9),
    Alignof(10),
    Asm(11),
    Auto(12),
    Bool(13),
    Break(14),
    Case(15),
    Catch(16),
    Char(17),
    Char16(18),
    Char32(19),
    Class(20),
    Const(21),
    Constexpr(22),
    Const_cast(23),
    Continue(24),
    Decltype(25),
    Default(26),
    Delete(27),
    Do(28),
    Double(29),
    Dynamic_cast(30),
    Else(31),
    Enum(32),
    Explicit(33),
    Export(34),
    Extern(35),
    False(36),
    Final(37),
    Float(38),
    For(39),
    Friend(40),
    Goto(41),
    If(42),
    Inline(43),
    Int(44),
    Long(45),
    Mutable(46),
    Namespace(47),
    New(48),
    Noexcept(49),
    Nullptr(50),
    Operator(51),
    Override(52),
    Private(53),
    Protected(54),
    Public(55),
    Register(56),
    Reinterpret_cast(57),
    Return(58),
    Short(59),
    Signed(60),
    Sizeof(61),
    Static(62),
    Static_assert(63),
    Static_cast(64),
    Struct(65),
    Switch(66),
    Template(67),
    This(68),
    Thread_local(69),
    Throw(70),
    True(71),
    Try(72),
    Typedef(73),
    Typeid_(74),
    Typename_(75),
    Union(76),
    Unsigned(77),
    Using(78),
    Virtual(79),
    Void(80),
    Volatile(81),
    Wchar(82),
    While(83),
    LeftParen(84),
    RightParen(85),
    LeftBracket(86),
    RightBracket(87),
    LeftBrace(88),
    RightBrace(89),
    Plus(90),
    Minus(91),
    Star(92),
    Div(93),
    Mod(94),
    Caret(95),
    And(96),
    Or(97),
    Tilde(98),
    Not(99),
    Assign(100),
    Less(101),
    Greater(102),
    PlusAssign(103),
    MinusAssign(104),
    StarAssign(105),
    DivAssign(106),
    ModAssign(107),
    XorAssign(108),
    AndAssign(109),
    OrAssign(110),
    LeftShift(111),
    RightShift(112),
    LeftShiftAssign(113),
    RightShiftAssign(114),
    Equal(115),
    NotEqual(116),
    LessEqual(117),
    GreaterEqual(118),
    AndAnd(119),
    OrOr(120),
    PlusPlus(121),
    MinusMinus(122),
    Comma(123),
    ArrowStar(124),
    Arrow(125),
    Question(126),
    Colon(127),
    Doublecolon(128),
    Semi(129),
    Dot(130),
    DotStar(131),
    Ellipsis(132),
    Identifier(133),
    Integerliteral(134),
    Decimalliteral(135),
    Octalliteral(136),
    Hexadecimalliteral(137),
    Binaryliteral(138),
    Integersuffix(139),
    Characterliteral(140),
    Floatingliteral(141),
    Stringliteral(142),
    Userdefinedintegerliteral(143),
    Userdefinedfloatingliteral(144),
    Userdefinedstringliteral(145),
    Userdefinedcharacterliteral(146),
    Whitespace(147),
    Newline(148),
    BlockComment(149);

    private int num;
    private String val;

    CPP14TokensEnum3(int i) {
        this.num = i;
    }

    CPP14TokensEnum3(int i, String val) {
        this.num = i;
        this.val = val;
    }

    /*

                '!'=1
               'not'=2
               '&&'=3
               'and'=4
               '||'=5
               'or'=6
               'alignas'=9
               'alignof'=10
               'asm'=11
               'auto'=12
               'bool'=13
               'break'=14
               'case'=15
               'catch'=16
               'char'=17
               'char16_t'=18
               'char32_t'=19
               'class'=20
               'const'=21
               'constexpr'=22
               'const_cast'=23
               'continue'=24
               'decltype'=25
               'default'=26
               'delete'=27
               'do'=28
               'double'=29
               'dynamic_cast'=30
               'else'=31
               'enum'=32
               'explicit'=33
               'export'=34
               'extern'=35
               'false'=36
               'final'=37
               'float'=38
               'for'=39
               'friend'=40
               'goto'=41
               'if'=42
               'inline'=43
               'int'=44
               'long'=45
               'mutable'=46
               'namespace'=47
               'new'=48
               'noexcept'=49
               'nullptr'=50
               'operator'=51
               'override'=52
               'private'=53
               'protected'=54
               'public'=55
               'register'=56
               'reinterpret_cast'=57
               'return'=58
               'short'=59
               'signed'=60
               'sizeof'=61
               'static'=62
               'static_assert'=63
               'static_cast'=64
               'struct'=65
               'switch'=66
               'template'=67
               'this'=68
               'thread_local'=69
               'throw'=70
               'true'=71
               'try'=72
               'typedef'=73
               'typeid'=74
               'typename'=75
               'union'=76
               'unsigned'=77
               'using'=78
               'virtual'=79
               'void'=80
               'volatile'=81
               'wchar_t'=82
               'while'=83
               '('=84
               ')'=85
               '['=86
               ']'=87
               '{'=88
               '}'=89
               '+'=90
               '-'=91
               '*'=92
               '/'=93
               '%'=94
               '^'=95
               '&'=96
               '|'=97
               '~'=98
               '='=100
               '<'=101
               '>'=102
               '+='=103
               '-='=104
               '*='=105
               '/='=106
               '%='=107
               '^='=108
               '&='=109
               '|='=110
               '<<'=111
               '>>'=112
               '<<='=113
               '>>='=114
               '=='=115
               '!='=116
               '<='=117
               '>='=118
               '++'=121
               '--'=122
               ','=123
               '->*'=124
               '->'=125
               '?'=126
               ':'=127
               '::'=128
               ';'=129
               '.'=130
               '.*'=131
               '...'=132

     */


}
