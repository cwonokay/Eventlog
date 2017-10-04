import java.util.ArrayList;
import java.util.List;

public class EventLog {

    private List<Event> eventList;

    public EventLog() {
        eventList = new ArrayList<>();
    }


    public boolean addEvent(Event event){
        if (event == null || event.name == null || event.action == null){
            try {
                throw new IllegalArgumentException("event is null");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        } else if (!event.getAction().equals("Face2Face") && !event.getAction().equals("PhoneCall") && !event.getAction().equals("TextMessaging") && !event.getAction().equals("Unknown"))
         {
             try {
                 throw new IllegalArgumentException("event action is incorrect");
             } catch (IllegalArgumentException e) {
                 e.printStackTrace();
             }
         }
        System.out.println(event);
        eventList.add(event);
        return true;
    }

    public int getNumEvents(){
        return eventList.size();
    }

}