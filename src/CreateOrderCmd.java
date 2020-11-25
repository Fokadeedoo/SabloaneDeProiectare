public class CreateOrderCmd implements Order{
    public void execute(){
        Meniu m1 = new Meniu("Meniul zilei");
        Produs p1 = new Produs(2,"Supa pui",7.5);
        m1.add(p1);
        Produs p2 = new Produs(1,"Friptura de porc la tava",15);
        m1.add(p2);
        Produs p3 = new Produs(1,"Snitel vienez",13);
        m1.add(p3);
        Produs p4 = new Produs(2,"Cartofi Wedges",6);
        m1.add(p4);
        Produs p5 = new Produs(2,"Salata rosii",5);
        m1.add(p5);
        Produs p6 = new Produs(2,"Apa minerala",3);
        m1.add(p6);

        MeniuOrder.getInstance().setMeniu(m1);
    }
}