public class Rectangle extends Shap{
    private double widh =1.0 , length =1.0 ;


    public Rectangle() {
    }

    public Rectangle(double length, double widh) {
        this.length = length;
        this.widh = widh;
    }

    public Rectangle(String color, boolean filled, double length, double widh) {
        super(color, filled);
        this.length = length;
        this.widh = widh;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidh() {
        return widh;
    }

    public void setWidh(double widh) {
        this.widh = widh;
    }
    public double getPerimeter(){
       double P ;
        if(widh>0 && length >0){
            P = 2 * (widh + length);
            return P ;
        }else{
            System.out.println("Enter correct number ");
            return Double.NaN;
        }

    }

    public double getArea(){
        double A ;
        if(widh>0 && length >0){
            A =  (widh * length);
            return A ;
        }else{
            System.out.println("Enter correct number ");
            return Double.NaN;
        }

    }

    @Override
    public void position() {
        System.out.println("*Rectangle*");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                "} " + super.toString();
    }
}
