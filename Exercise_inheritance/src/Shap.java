public class Shap {

   private String color ;
   private boolean filled ;

    public Shap() {
    }

    public Shap(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void position(){
        System.out.println("*Shape*");
    }




    @Override
    public String toString() {
        return "Shap{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
