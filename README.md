# Eventlog
Import JUnit

From IntelliJ's main menu, go to File -> Project Structure.
Under the Project Settings heading on the left, select Libraries.
Add a new library with the + button and then click From Maven.
In the search field, junit:junit:4.12. Maven should look for the files - it might take a minute to find them.
Click OK on all the dialogs until your back to the main IntelliJ window.
You are to write an EventLog class that other Java code in your company can use to record events. You've decided to start with something small first to "get it out there."

Write an Event JavaBean with

String name
String action
Write the EventLog class with the following method variables and methods:

private List<Event> eventList
public boolean addEvent(Event event)
public int getNumEvents () which returns the size of the list
public EventLog () which initializes the list
The addEvent method should

Throw an IllegalArgumentException if the event parameter is null or if either if the two variables of event are null.
If both parameters are set then print the event to the console and add it to the list.
The return value from the addEvent method should be true.
Write JUnit test cases to test the method first then write the method. You should test that a proper event can be added, and that an improper event throws an exception correctly.

Next Steps  
The requirements have changed. action can only be one of the following values:

"Face2Face"
"PhoneCall"
"TextMessaging"
"Unknown"
The action variable in Event has to stay a String for backwards compatibility.

Add a new test method for this requirement. Again, you will need to test that an exception is thrown properly and that a "good" event can still be added. Then, add a check in the addEvent method to validate the String value. If not valid throw an IllegalArgumentException.
