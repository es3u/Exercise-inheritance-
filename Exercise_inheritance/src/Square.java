public class Square extends Rectangle{

    public Square() {
    }

    public Square( double side){
        super(side, side);

    }

    public Square(double side , String color, boolean filled ) {
        super( color, filled ,  side, side);

    }


    public double getSide() {
        return super.getWidh();
    }

    public void setSide(double side) {
        super.setWidh(side);
        super.setLength(side);
    }

    @Override
    public void position() {
        System.out.println("*Square*");
    }

    @Override
    public String toString() {
        return "Square{side = "+getSide()+" } " + super.toString();
    }
}
