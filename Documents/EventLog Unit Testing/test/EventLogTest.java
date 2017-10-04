import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EventLogTest {

        @Before
        public void setUp() throws Exception {
            System.out.println("Setting up");
        }

        @After
        public void tearDown() throws Exception {
            System.out.println("tearing");
        }

        @Test
        public void addEvent() throws Exception {

            Event event1 = new Event();
            EventLog eventLog = new EventLog();

            event1.setName("coco");
            event1.setAction("Face2Face");
            boolean addEventTest = eventLog.addEvent(event1);

            assertEquals("should return true", addEventTest, true);
            assertEquals("added 1 event", eventLog.getNumEvents(), 1);

            Event event2 = new Event();
            event2.setName("coco");
            event2.setAction("PhoneCall");

            addEventTest = eventLog.addEvent(event2);

            assertEquals("should return true", addEventTest, true);
            assertEquals("added 2 event", eventLog.getNumEvents(), 2);

            Event event3 = new Event();
            event3.setName("coco");
            event3.setAction("TextMessaging");

            addEventTest = eventLog.addEvent(event3);

            assertEquals("should return true", addEventTest, true);
            assertEquals("added 3 event", eventLog.getNumEvents(), 3);

            Event event4 = new Event();
            event4.setName("coco");
            event4.setAction("Unknown");

            addEventTest = eventLog.addEvent(event4);

            assertEquals("should return true", addEventTest, true);
            assertEquals("added 4 event", eventLog.getNumEvents(), 4);

            System.out.println(event1.name);
            System.out.println(event1.action);
            System.out.println(event2.name);
            System.out.println(event2.action);
            System.out.println(event3.name);
            System.out.println(event3.action);
            System.out.println(event4.name);
            System.out.println(event4.action);
            System.out.println(eventLog.getNumEvents());
        }
         @Rule
        public ExpectedException expected = ExpectedException.none();

         @Test
         public void illegalArgumentExceptionTest(){
         expected.expect(IllegalArgumentException.class);
            Event emptyEvent = new Event();
            EventLog noEventAdded = new EventLog();

             noEventAdded.addEvent(emptyEvent);
         }


}