public class Tester{
    String jeck;
    int numbr;
    double weight;

    public String getJeck() {
        return jeck;
    }

    public void setJeck(String jeck) {
        this.jeck = jeck;
    }

    public int getNumbr() {
        return numbr;
    }

    public void setNumbr(int numbr) {
        this.numbr = numbr;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tester - " +
                "Name - " + jeck + '\'' +
                " Number - " + numbr +
                " Weight - " + weight;
    }
}
