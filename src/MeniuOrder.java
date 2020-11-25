public class MeniuOrder {
    public static MeniuOrder instance;
    private static Meniu meniu;

    private MeniuOrder(){}

    public static MeniuOrder getInstance(){
        if(instance==null)
        {
            instance=new MeniuOrder();
        }
        return instance;
    }

    public static Meniu getMeniu(){
        return meniu;
    }

    public void setMeniu(Meniu m){
        meniu=m;
    }
}