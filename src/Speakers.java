public class Speakers {

    String name;
    int memory;
    double price;

    Speakers() {

    }

    Speakers(String name, int memory, double price) {
        this.name = name;
        this.memory = memory;
        this.price = price;
    }

    void getName() {
        System.out.println(name + ", " + memory + ", " + price);
    }
    void getMemory() {
        System.out.println(memory);
    }
    void getPrice() {
        System.out.println(price);
    }
}
