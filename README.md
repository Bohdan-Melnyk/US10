Application description:

This Java program contains a Main class with a main method and a utility method named isValidLength. 
The main method tests isValidLength by calling it with various string inputs and maximum lengths, printing the results to the console. 
The isValidLength method takes a string and a maximum length as parameters and returns a boolean value indicating whether the string meets certain criteria, such as containing at least one lowercase letter, one uppercase letter, one digit, and one special character, all while not exceeding the specified maximum length. 
The validation is done using a dynamically generated regular expression pattern. This program is useful for validating password strings based on custom length and character requirements.


Regex implementation description:


The isValidLength method uses a regular expression (regex) to validate the input string against multiple criteria. The regex is dynamically generated based on the provided maximum length (maxLength). It checks for the presence of at least one lowercase letter (?=.*[a-z]), one uppercase letter (?=.*[A-Z]), one digit (?=.*\\d), and one special character (?=.*[!"#$%&'()*+,-./:;<=>?@[\\]^_{|}~]). 
Additionally, the regex ensures that the string does not contain any spaces (\S) and that its length falls between 1 and the given maximum length. The method uses Java's PatternandMatcherclasses from the java.util.regexpackage to compile the regex into aPatternobject and then match it against the input string. 
If the input string fulfills all these conditions, the method returns true; otherwise, it returns false.


How to run the application locally:
To run the developed Java application locally, you will need to have the Java Development Kit (JDK) installed on your computer. If you don't have it, you can download and install it from the official Oracle website or use an OpenJDK distribution. Here are the steps to run the program:

Save the Code: Copy the Java code into a text editor and save it with the .java extension. Make sure to name the file Main.java.

Open Terminal or Command Prompt: Navigate to the directory where you saved Main.java.

Compile the Code: Run the following command to compile the Java file: javac Main.java
This will create a Main.class file in the same directory.

Run the Program: After compiling, execute the following command to run the program:java Main
This will execute the main method in the Main class, and you should see the output in the terminal.

After running the program, you should see output indicating whether various test strings meet the specified criteria. This will validate the functionality of the isValidLength method.
