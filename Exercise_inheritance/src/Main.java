public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        Shap s = new Shap("black" , true);
        s.position();
        System.out.println(s.isFilled());
        System.out.println(s.getColor());
        System.out.println(s.toString());



        Circle c = new Circle(2.0);

        c.position();
        c.setColor("white");
        c.setFilled(false);
        c.setRadiuse(10);
        System.out.println(c.getRadiuse());
        Circle c2 = new Circle("red" , false , 15);
        System.out.println(c2);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println(c.toString());


        Rectangle r = new Rectangle(3.0, 4.0);
        r.position();
        r.setWidh(10);
        r.setColor("blue");
        r.setFilled(true);
        r.setLength(20);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println(r.toString());

        Square s1 = new Square(2);
        s1.position();
        s1.setColor("selver");
        s1.setFilled(false);
        Square s2 = new Square();
        s2.setSide(1);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}