import java.util.ArrayList;

public class Products {

    private ArrayList<Apple> apples;

    private ArrayList<Appliances> appliances;

    public ArrayList<Apple> getApples() {
        return apples;
    }

    public void setApples(ArrayList<Apple> apples) {
        this.apples = apples;
    }

    public ArrayList<Appliances> getAppliances() {
        return appliances;
    }

    public void setAppliances(ArrayList<Appliances> appliances) {
        this.appliances = appliances;
    }

    @Override
    public String toString() {
        return " Products - " +
                " Apples - " + apples +
                " Appliances - " + appliances;
    }
}
