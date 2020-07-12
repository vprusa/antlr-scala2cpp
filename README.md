# ANTLRv4 scala to cpp sketch for brianstorm

### Notes:

[Official site](https://www.antlr.org/)
[Tutorial](https://engineering.mongodb.com/post/transpiling-between-any-programming-languages-part-1)

This is just a sketch to have something to brainstorm about.

### Prepare

[Steps](https://dzone.com/articles/creating-dsl-with-antlr4-and-scala)

```
wget https://raw.githubusercontent.com/antlr/grammars-v4/master/cpp/CPP14.g4
wget https://raw.githubusercontent.com/antlr/grammars-v4/master/scala/Scala.g4

antlr4 -visitor -Dlanguage=Java Scala.g4
antlr4 -visitor -Dlanguage=Java CPP14.g4

alias antlr4='java -jar /home/vprusa/workspace/p/notes/work/projects/arduino/gag/gag-web/transcendent/antlr/src/main/resources/antlr-4.7-complete.jar'
alias grun='java -cp ".:/home/vprusa/workspace/p/notes/work/projects/arduino/gag/gag-web/transcendent/antlr/src/main/resources/antlr-4.7-complete.jar" org.antlr.v4.gui.TestRig'
```

### TODO:
- Like literally everything,
- parse tree as tree no list,

### Blockers & Brianstorm:
- Grammar to grammar conversion.
- Different structures.
- Syntactics support for:
  1. Building code based on partial/sub grammars on the fly? 
  2. Mapping partial/sub grammars from one language to another?
  (or did I just miss it in ANTLR's documentation and code?)


