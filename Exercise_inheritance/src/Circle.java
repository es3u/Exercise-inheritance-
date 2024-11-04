public class Circle extends Shap{

    private double radiuse = 1.0;

    public Circle() {
    }

    public Circle(double radiuse) {
        this.radiuse = radiuse;
    }

    public Circle(String color, boolean filled, double radiuse) {
        super(color, filled);
        this.radiuse = radiuse;
    }


    public double getRadiuse() {
        return radiuse;
    }

    public void setRadiuse(double radiuse) {//مساحة الدايره
        this.radiuse = radiuse;
    }

    public double getArea(){
        double A ;
        if(radiuse>0){
        A = (3.14 *3.14) * radiuse ;
        return A ;}
        else{ System.out.println("enter correct number ");
            return Double.NaN;}
    }

    public double getPerimeter(){//////////محيط الدايره
        double P ;
        if(radiuse>0) {
            return P = 2 * 3.14 * radiuse;
        }else { System.out.println("enter correct number ");
            return Double.NaN;}
    }

    @Override
    public void position() {
        System.out.println("Circle");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radiuse=" + radiuse +
                "Area :" +getArea()+
                "Perimeter :" + getPerimeter()+
                "} " + super.toString();
    }

}
