In this folder, there are a few helpful tools. The main ones to `build.bat` and `run.bat`
You can modify the `Cypher.g4` grammar file as needed.

### build.bat
This file will build the grammar and generate the parser and lexer files. It will also copy the generated files to the `src/simpledb/graph/grammar` folder.

### run.bat
This file is used to test the grammar file given an input in `input.txt`. It compiles the Cypher grammar into Java files (Thanks to Antlr4 compiler) and runs the Cypher with `input.txt` as the input

You run both these files by simply opening them.