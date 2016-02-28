JCC = javac

default: Lightbulb.class ILightBulb.class Button.class PushdownButton.class Main.class

#classpath
JCLASS = -cp

JCLASSPATH = bin/

#dest class path
JPATH = -d

JDESTPATH = bin/

SRCPATH = src


Lightbulb.class: $(SRCPATH)/lightbulbs/Lightbulb.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/lightbulbs/Lightbulb.java

ILightBulb.class: $(SRCPATH)/buttons/ILightBulb.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/buttons/ILightBulb.java

Button.class: $(SRCPATH)/buttons/Button.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/buttons/Button.java

PushdownButton.class: $(SRCPATH)/buttons/PushdownButton.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/buttons/PushdownButton.java

Main.class: $(SRCPATH)/tablelamp/Main.java
	$(JCC) $(JCLASS) $(JCLASSPATH) $(JPATH) $(JDESTPATH) $(SRCPATH)/tablelamp/Main.java

clean: 
	$(RM) *.class

