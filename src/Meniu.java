import java.util.ArrayList;

public class Meniu implements Elemente{
    String nume;
    public ArrayList<Produs> continut = new ArrayList<>();

    public Meniu(String nume)
    {
        this.nume = nume;
    }
    public void add(Produs e)
    {
        continut.add(e);
    }
    public void print()
    {
        System.out.println("Book:" + nume);
        for(Produs e: continut)
        {
            e.print();
        }
    }
}