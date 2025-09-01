
import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {

        // bike1
        Bike bike1 = new Bike();
        System.out.println(bike1);

        // bike2 and setters
        Bike bike2 = new Bike();
        bike2.setWheels(2);
        bike2.setManufacturer("Trek");
        bike2.setYear(2025);
        System.out.println(bike2);

        // list of bikes
        ArrayList<Bike> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);

        // SOP bikeList (prints toString for each bike)
        System.out.println(bikeList);

        // counts total wheels using a simple for loop
        int totalWheels = 0;
        for (int i = 0; i < bikeList.size(); i++) {
            totalWheels += bikeList.get(i).getWheels();
        }
        System.out.println("Total wheels: " + totalWheels);

        // find oldest year using a simple for loop
        int oldestYear = bikeList.get(0).getYear();
        for (int i = 0; i < bikeList.size(); i++) {
            if (bikeList.get(i).getYear() < oldestYear) {
                oldestYear = bikeList.get(i).getYear();
            }
        }
        System.out.println("Oldest bike year: " + oldestYear);
    }
}