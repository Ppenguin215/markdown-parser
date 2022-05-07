<<<<<<< HEAD
MardownParse.class: MardownParse.java
	javac MardownParse.java
MardownParseTest.class: MardownParseTest.java MardownParse.class
	javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
Run: MarkdownParseTest.class
	java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
=======
MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp .:lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar MarkdownParseTest.java
>>>>>>> 6b7c006658698c7afb0c27d6dbaccfe53e6d97da
