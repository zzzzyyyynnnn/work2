import java.util.Observable;
import java.util.Observer;

public class Email implements Observer {
    private String id;
    private String emailAddress;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("给客户邮箱："+emailAddress+"发邮件："+((Good) o).getName()+"降价了，目前价格为:"+ ((Good) o).getPrice());

        }

    }

