import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(Apple.MACBOOK_PRO);
        apples.add(Apple.IPHONE_15);
        apples.add(Apple.APPLE_WATCH);
        apples.add(Apple.HEADPHONE);
        // 1st WAY
        apples.forEach(System.out::println);
        // 2nd WAY
        for (Apple apple : apples) {
            System.out.println("Product: " + apple);
        }
        System.out.println("++++++++++++========++++++++++++");

        ArrayList<Appliances> appliances = new ArrayList<>();
        appliances.add(Appliances.FRIGE);
        appliances.add(Appliances.MICROWAVE);
        appliances.add(Appliances.WASHER);
        appliances.add(Appliances.DRIER);

        // 1st WAY
        appliances.forEach(System.out::println);

        //2nd WAY
        for (Appliances appliances1 : appliances){
            System.out.println("Products: " + appliances1);
        }
    }
}