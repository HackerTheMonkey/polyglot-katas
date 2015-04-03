#### [counting code lines](http://codekata.com/kata/kata13-counting-code-lines/)

### Scenarios

#### Empty lines
- A line contains only whitespace _should not be_ counted as a Java line of code.
- An empty line _should not be_ counted as a Java line of code.

#### Single line comments (i.e. //)
- A line that starts with a single line comment start sequence should _not be counted_ as a Java line of code.
- A line that contains a single line comment start sequence anywhere but the start of the line _should be_ counted as a Java line of code.

#### Multiple-line comments
- A line that starts with a multiple-line comment (i.e. a /*) should not be counted as a Java line of code.
- A line that's preceded by a multiple-line comment should not be counted as a Java line of code.

#### Java source code
- A line that contains Java keywords outside comments should be counted as a Java line of code. _Happy path_
