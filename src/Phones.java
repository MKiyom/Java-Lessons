public class Phones {

    String iphoneName;
    int iphoneMemory;
    int iphonePrice;

    Phones(String nameOfIp, int memoryOfiph, int priceOfiph) {
        this.iphoneName = nameOfIp;
        this.iphoneMemory = memoryOfiph;
        this.iphonePrice = priceOfiph;
    }

    void getIphoneName() {
        System.out.println(iphoneName);
    }
    void getIphoneMemory() {
        System.out.println(iphoneMemory);
    }
    void getIphonePrice() {
        System.out.println(iphonePrice);
    }
}
