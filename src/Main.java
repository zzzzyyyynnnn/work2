import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Good good = new Good();
        good.setName("iPhone13");

        Phone phone = new Phone();
        phone.setId("001");
        phone.setPhoneNumber("111111111111");

        Email email = new Email();
        email.setId("001");
        email.setEmailAddress("xxxxxx@qq.com");
        //添加观察者
        good.addObserver(email);
        good.addObserver(phone);
        //升价，所以不通知
        good.setPrice(11111f);
        //降价，所以通知
        good.setPrice(9999f);


    }
}