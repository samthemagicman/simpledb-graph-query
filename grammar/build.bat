#IF EXIST ../src/graph/grammar RMDIR /S /Q ../src/graph/grammar

java -jar .\antlr-4.13.1-complete.jar .\Cypher.g4 -visitor -package graph.grammar -o ../src/graph/grammar
