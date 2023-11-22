java -jar .\antlr-4.13.1-complete.jar .\Cypher.g4 -visitor -o grammar
javac .\grammar\*.java
.\grun.bat query < input.txt