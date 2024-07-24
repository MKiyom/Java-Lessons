//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Human person1 = new Human();

       person1.setName("Kiyom");
       person1.setAge(36);
       person1.setSex("Male");
       person1.setStatus("married");

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
    }
}