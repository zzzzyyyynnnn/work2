import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {
    private String id;
    private String phoneNumber;

    public String getId(){return id;}

    public void setId(String id){
        this.id = id;
    }
    public String getPhoneNumber(){return phoneNumber;}

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("给客户手机号："+phoneNumber+"发短信："+((Good) o).getName()+"降价了，目前价格为:"+((Good) o).getPrice());
    }
}
