public class Main {
    public void main(string args[])
    {
        // CreateOrderCmd va crea comanda cu continutul de mai sus
        Order order = new CreateOrderCmd();

        // Va afisa comanda precum mai sus
        new DisplayOrderCmd(order);
    }
}
