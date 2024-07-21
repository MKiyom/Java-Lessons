public class classMethods {
    public static void main(String[] args) {

        String name = getName();
        String country = getCountry();
        int age = getAge();
        double weight = getWeight();
        double height = getHeight();
        int passId = getPassId();

        System.out.println("My name: " + name);
        System.out.println("My country: " + country);
        System.out.println("My age: " + age);
        System.out.println("My weight: " + weight);
        System.out.println("My height: " + height);
        System.out.println("My passport id: " + passId);

    }

    private static String getName(){
        return "Kiyom";
    }
    private static String getCountry(){
        return "Tajikistan";
    }
    private static int getAge(){
        return 36;
    }
    private static double getWeight(){
        return 75.5;
    }
    private static double getHeight(){
        return 1.78;
    }
    private static int getPassId(){
        return 123456789;
    }
}