set CLASSPATH=.\antlr-4.13.1-complete.jar;%CLASSPATH%
java -jar .\antlr-4.13.1-complete.jar .\Cypher.g4 -visitor -o grammar
javac .\grammar\*.java
.\grun.bat multiQuery < input.txt