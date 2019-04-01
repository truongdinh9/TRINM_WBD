public class Rectangle  extends  Shape implements Resizeable{
    private double width = 1;
    private double lenght = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea(){
        return width * this.lenght;
    }

    public double getPerimeter(){
        return 2 * (width + this.lenght);
    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLenght()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        double total1 = getWidth() *percent/100;
        double total2 = getLenght()* percent/100;
        System.out.println("rong "+total1);
        System.out.println("dai "+total2);
    }
}
