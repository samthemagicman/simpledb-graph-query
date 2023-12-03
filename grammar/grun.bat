cd grammar
@ECHO OFF
set CLASSPATH=..\antlr-4.13.1-complete.jar;%CLASSPATH%
@ECHO ON

java org.antlr.v4.gui.TestRig Cypher %1 -gui %2