import java.util.Observable;

public class Good extends Observable {
    private String name;
    private float price = 10000f;
    public Good(String name){
        this.name = name;
    }
    public Good(){}

    public String getName(){return name;}
    public void setName(String name){
        this.name = name;
    }

    public float getPrice(){return price;}
    public void setPrice(float newprice){
        //判断是否降价，如果降价了才会触发notifyObservers
        if(price>newprice){
            price = newprice;
            super.setChanged();
        }
        super.notifyObservers();
    }

}
