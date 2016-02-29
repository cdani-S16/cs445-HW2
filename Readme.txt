Instructions:

Tested and working in Linux (Ubuntu 14.04 LTS) with JDK 1.7

To get a copy of the project:
open terminal (make sure git is installed)
run this command: git clone https://github.com/cdani-S16/cs445-HW2.git
a local copy will be created

To compile:
Make sure openjdk is installed
change terminal directory to that of the folder TableLamp in the home directory where the clone is (use: cd ) 
run command: make
The make file will be executed and the compiled class files will be created in the bin folder.

To execute:
To run main program, run this command: java -cp bin/ tablelamp.Main

Note: 
The main class is in the package tablelamp
I have included both the buttons in the main function for the purpose of clarity. 

To run the test suite: 
java -cp "bin/:bin/junit-4.8.1.jar" org.junit.runner.JUnitCore  tablelamp.Testsuite



