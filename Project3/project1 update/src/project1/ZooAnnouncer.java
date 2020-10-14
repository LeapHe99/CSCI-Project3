package project1;

public class ZooAnnouncer implements Observer {

    private String announcerName;
    private String message;
    
    public ZooAnnouncer(String name) {
        this.announcerName = name;
    }
    
    @Override
    public void update(String message) {
        this.message = message;
        read();
    }
    
    public void read() {
        System.out.println(announcerName + " see the zoo keeper £º " + message);
    }

}
