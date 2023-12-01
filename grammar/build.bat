#IF EXIST .\grammar RMDIR /S /Q .\grammar

java -jar .\antlr-4.13.1-complete.jar .\Cypher.g4 -visitor -package graph.grammar -o ../src/graph/grammar
