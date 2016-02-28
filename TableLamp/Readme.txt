
make

javac -cp "bin/:bin/junit-4.8.1.jar" -d bin/ src/tablelamp/Testbuttons.java

java -cp "bin/:bin/junit-4.8.1.jar" org.junit.runner.JUnitCore  tablelamp.Testbuttons

java -cp bin/ tablelamp.Main

codecover/codecover.sh instrument --root-directory ../SimpleJavaApp/src                     --destination ../SimpleJavaApp/instrumentedSrc                      --container ../SimpleJavaApp/test-session-container.xml                     --language java                      --charset UTF-8

codecover/codecover.sh analyze --container ../SimpleJavaApp/test-session-container.xml                   --coverage-log ../SimpleJavaApp/instrumentedSrc/coverage_log.clf                   --name TestSession1                   --comment "The first test session"


buttons LOc: 44
cyc: 2

lightbulb: 11
cylcomatic : 1

tabl LOC: 119
cycl: 1

tab (no test code) LOC: 13
cycl 1

