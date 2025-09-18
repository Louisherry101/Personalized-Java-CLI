# Personalized-Java-CLI
this is a repository to showcase my ability to create a personalized java CLI

## how to run this code
For Windows users: 
  - to compile, you use the command line   javac -cp ".;picocli-4.7.7.jar" CompanyPrinter.java
  - to execute:
     1. you use the command line   java -cp ".;picocli-4.7.7.jar" CompanyPrinter --print-company  to get the name of the company
     2. you use the command line   java -cp ".;picocli-4.7.7.jar" CompanyPrinter --help    to get the help list of this code 
     3. you did not call the correct argument. e.g java -cp ".;picocli-4.7.7.jar" CompanyPrinter --haha   the code will still call out a help list to guide users


## versions

Java: 17.0.1
picocli: 4.7.7
