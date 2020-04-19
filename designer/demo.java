package designer;

public class demo {

    public static void main(String[] args) {
        Car sedan = new Sedan();
        Car greenSedan = new Green(new Sedan());

        Car greenTruck = new Green(new Truck());
        System.out.println("Sedan with no paintjob.");
        sedan.build();
        System.out.println("\nSedan with green paintjob");
        greenSedan.build();
        System.out.println("\nTruck with green paintjon");
        greenTruck.build();
    }
}