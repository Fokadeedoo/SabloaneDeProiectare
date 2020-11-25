public class Produs implements Elemente{
    int cantitate;
    String nume;
    double pret;
    public Produs(int cantitate,String nume,double pret){
        this.cantitate= cantitate;
        this.nume=nume;
        this.pret=pret;
    }
    public void print()
    {
        System.out.println(nume + " " + cantitate + " " + pret);
    }
}