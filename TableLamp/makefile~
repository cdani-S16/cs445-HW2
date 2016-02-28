JCC = javac

default: ILightbulb.class Lightbulb.class Button.class PushdownButton.class Testbuttons.class Testlightbulb.class Testpushdownbuttons.class Testsuite.class Main.class

#classpath
JCLASS = -cp

JCLASSPATH = bin/

JCLASSPATHJUNIT = bin/junit-4.8.1.jar

#dest class path
JPATH = -d

JDESTPATH = bin/

SRCPATH = src

ILightbulb.class: $(SRCPATH)/lightbulbs/ILightbulb.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/lightbulbs/ILightbulb.java

Lightbulb.class: $(SRCPATH)/lightbulbs/Lightbulb.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/lightbulbs/Lightbulb.java

Button.class: $(SRCPATH)/buttons/Button.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/buttons/Button.java

PushdownButton.class: $(SRCPATH)/buttons/PushdownButton.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/buttons/PushdownButton.java

Main.class: $(SRCPATH)/tablelamp/Main.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/tablelamp/Main.java

Testbuttons.class: $(SRCPATH)/tablelamp/Testbuttons.java
	$(JCC) $(JCLASS) "$(JCLASSPATH):$(JCLASSPATHJUNIT)" $(JPATH) $(JDESTPATH) $(SRCPATH)/tablelamp/Testbuttons.java

Testlightbulb.class: $(SRCPATH)/tablelamp/Testlightbulb.java
	$(JCC) $(JCLASS) "$(JCLASSPATH):$(JCLASSPATHJUNIT)" $(JPATH) $(JDESTPATH) $(SRCPATH)/tablelamp/Testlightbulb.java

Testpushdownbuttons.class: $(SRCPATH)/tablelamp/Testpushdownbuttons.java
	$(JCC) $(JCLASS) "$(JCLASSPATH):$(JCLASSPATHJUNIT)" $(JPATH) $(JDESTPATH) $(SRCPATH)/tablelamp/Testpushdownbuttons.java

Testsuite.class: $(SRCPATH)/tablelamp/Testsuite.java
	$(JCC) $(JCLASS) "$(JCLASSPATH):$(JCLASSPATHJUNIT)" $(JPATH) $(JDESTPATH) $(SRCPATH)/tablelamp/Testsuite.java

clean: 
	$(RM) *.class

