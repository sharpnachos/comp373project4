package designer;

public class Red extends PaintJob {

    public Red(Car paintedCar){
        super(paintedCar);
    }

    @Override
    public void build() {
        paintedCar.build();
        paintRed(paintedCar);
    }

    private void paintRed(Car paintedCar){
        System.out.println("Paint Job: Red");
    }
}