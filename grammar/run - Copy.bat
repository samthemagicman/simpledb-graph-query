java -jar .\antlr-4.13.1-complete.jar .\Cypher.g4 -visitor
javac *.java
.\grun.bat %1 < input.txt