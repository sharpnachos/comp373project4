package designer;

public class Green extends PaintJob {

    public Green(Car paintedCar){
        super(paintedCar);
    }

    @Override
    public void build() {
        paintedCar.build();
        paintRed(paintedCar);
    }

    private void paintRed(Car paintedCar){
        System.out.println("Paint Job: Green");
    }
}