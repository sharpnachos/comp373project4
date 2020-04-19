package designer;

public class demo {

    public static void main(String[] args) {
        Car sedan = new Sedan();
        Car redSedan = new Red(new Sedan());

        Car redTruck = new Red(new Truck());
        System.out.println("Sedan with no paintjob.");
        sedan.build();
        System.out.println("\nSedan with red paintjob");
        redSedan.build();
        System.out.println("\nTruck with red paintjon");
        redTruck.build();
    }
}