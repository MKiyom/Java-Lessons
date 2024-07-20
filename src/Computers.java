public class Computers {

    String compName;
    int compMemory;
    int compRam;

    Computers(String nameOfComp, int memoryOfComp, int ramOfComp ) {
        this.compName = nameOfComp;
        this.compMemory = memoryOfComp;
        this.compRam = ramOfComp;
    }

    void getCompName() {
        System.out.println(compName);
    }
    void getCompMemory() {
        System.out.println(compMemory);
    }
    void getCompRam() {
        System.out.println(compRam);
    }
 }
