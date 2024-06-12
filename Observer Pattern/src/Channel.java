import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subsLst= new ArrayList<>();
    private String title;
    public void subscribe(Subscriber sb){
        subsLst.add(sb);
    }
    public void unsubscribe(Subscriber sb){
        subsLst.remove(sb);
    }
    public void notifySubs(){
        for(Subscriber sb:subsLst){
            sb.update(sb);
        }
    }
    public void upload(String title){
        this.title=title;
        notifySubs();
    }
}
