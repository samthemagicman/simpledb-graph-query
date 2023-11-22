#IF EXIST .\grammar RMDIR /S /Q .\grammar

java -jar .\antlr-4.13.1-complete.jar .\Cypher.g4 -visitor -package simpledb.graph.grammar -o ../src/simpledb/graph/grammar
