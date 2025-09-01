public class Bike {
    private int wheels;
    private String manufacturer;
    private int year;
    
    // no-arg constructor per spec
    public Bike() {
        this.wheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    // 3-arg constructor
    public Bike(int wheels, String manufacturer, int year) {
        this.wheels = wheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // getters
    public int getWheels() {
        return wheels;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getYear() { 
    return year; 
    }

    // setters
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bike{wheels=" + wheels + ", manufacturer='" + manufacturer + "', year=" + year + "}";
    }
}