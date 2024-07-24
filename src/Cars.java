public class Cars {
    String make;
    String model;
    int year;
    String type;
    double odometer;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "Make = '" + make + '\'' +
                ", Model = '" + model + '\'' +
                ", Year = " + year +
                ", Type = '" + type + '\'' +
                ", Odometer = " + odometer +
                '}';
    }
}
