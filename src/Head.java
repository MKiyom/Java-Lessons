public class Head {
    public static void main(String[] args) {

        Computers apple = new Computers("Macbook", 512, 16);

        apple.getCompName();
        apple.getCompMemory();
        apple.getCompRam();

        //============================

        Phones iphone = new Phones("Iphone 15", 512, 1000);

        iphone.getIphoneName();
        iphone.getIphoneMemory();
        iphone.getIphonePrice();

        //==============================

        Speakers appSpeaker = new Speakers("Apple Speaker", 1000, 450.50);

        appSpeaker.getName();
        appSpeaker.getMemory();
        appSpeaker.getPrice();

    }
}
