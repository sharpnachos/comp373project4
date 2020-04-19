package designer;

public class Truck implements Car {

    @Override
    public void build() {
        System.out.println("Car: Truck");
    }
}