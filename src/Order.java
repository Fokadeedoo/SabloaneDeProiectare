import java.util.ArrayList;

public class Order {
    public String product;
    public ArrayList<String> Produse =new ArrayList<>();
    public Order(String product){
        this.product = product;
    }

    public void CreateOrderCmd(String f){
        Produse.add(f);
    }

    public void DisplayOrderCmd(){
        for(String e:Produse)
        {
            System.out.println(e);
        }
    }

    public void
}
