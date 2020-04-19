package designer;

public class Green extends PaintJob {

    public Green(Car paintedCar){
        super(paintedCar);
    }

    @Override
    public void build() {
        paintedCar.build();
        paintGreen(paintedCar);
    }

    private void paintGreen(Car paintedCar){
        System.out.println("Paint Job: Green");
    }
}