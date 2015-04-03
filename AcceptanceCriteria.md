#### [counting code lines](http://codekata.com/kata/kata13-counting-code-lines/)

_note_: The assumption made here is that the input file is a *valid* Java source file.

### Scenarios

###### Empty lines
- A line contains only whitespace **_should not be_** counted as a Java line of code.
- An empty line **_should not be_** counted as a Java line of code.

###### Single line comments (i.e. //)
- A line that starts with a single line comment start sequence should **_not be counted_** as a Java line of code.
- A _Java line of code_ that contains a single line comment start sequence anywhere but the start of the line **_should be_** counted as a Java line of code.

###### Multiple-line comments (i.e. a /* */)
- A line that starts with a multiple-line comment start sequence **_should not be_** counted as a Java line of code.
- A line that's preceded by a multiple-line comment start sequence **_should not be_** counted as a Java line of code.
- A line that starts with a multiple-line end sequence followed by whitespace **_should not be_** counted as a Java line of code.
- A line that starts with a multiple-line end sequence followed by Java statement(s) **_should be_** counted as a Java line of code. 

###### Java source code
- A line that contains Java statement(s) outside comments should be counted as a Java line of code. _Happy path_


###### Legend
- _single line commen start sequence_ --> //
- _multiple-line comment start sequence_ --> /*
- _multiple-line comment end sequence_ --> */
- _whitespace_ --> space, tab, carriage return, line feed, vertical tabs. [Read more](http://en.wikipedia.org/wiki/Whitespace_%28programming_language%29)
