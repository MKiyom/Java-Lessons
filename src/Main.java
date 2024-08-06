import java.awt.image.AreaAveragingScaleFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {

       Human person1 = new Human();

       person1.setName("Kiyom");
       person1.setAge(36);
       person1.setSex("Male");
       person1.setStatus("married");

       person1.run();

       System.out.println(person1.toString());


       Cars vehicle1 = new Cars();
       vehicle1.setMake("Toyota");
       vehicle1.setModel("Camry");
       vehicle1.setType("Electric");
       vehicle1.setYear(2024);
       vehicle1.setOdometer(0.0);

       System.out.println(vehicle1.toString());


       Cars vehicle2 = new Cars();
       vehicle2.setMake("Link n Co");
       vehicle2.setModel("Zeekr");
       vehicle2.setType("Electric");
       vehicle2.setYear(2023);
       vehicle2.setOdometer(100.0);

       System.out.println(vehicle2.toString());

       String namee = String.format("This is %s is good!", "what");
       System.out.println(namee);


       Tester keks = new Tester();
       keks.setJeck("Jeck");
       keks.setNumbr(200);
       keks.setWeight(75.6);

       System.out.println(keks.toString());

       // ======================

       String[] array = {"WINTER", "SUMMER", "AUTUMN", "SPRING"};

       FileWriter fileWriter = new FileWriter("Testak.txt");

       for (String string : array) {
          fileWriter.write(string.concat("\n"));
       }

       fileWriter.close();


       FileReader fileReader = new FileReader("Testak.txt");
       Scanner scanner = new Scanner(fileReader);

       while (scanner.hasNext()) {
          System.out.println(scanner.nextLine());
       }

       // ENUM
       AppleProduct macBook = new AppleProduct();
       macBook.setProduct(Product.MACBOOK);

       AppleProduct iphone = new AppleProduct();
       iphone.setProduct(Product.IPHONE);

       AppleProduct watch = new AppleProduct();
       watch.setProduct(Product.WATCH);

       AppleProduct headPhones = new AppleProduct();
       headPhones.setProduct(Product.HEADPHONES);


       ArrayList<AppleProduct> appleProducts = new ArrayList<>();
       appleProducts.add(macBook);
       appleProducts.add(iphone);
       appleProducts.add(watch);
       appleProducts.add(headPhones);

       // 1st way bring to console
       for (AppleProduct allProds : appleProducts) {
       System.out.println(allProds);
       }

       // 2st way bring to console
       appleProducts.forEach(System.out::println);

       // if you want to get only one product from the list, you do as follow:
       System.out.println(appleProducts.get(3));

    }
   }