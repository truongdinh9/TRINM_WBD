public class Square extends Rectangle implements Colorable {
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled,side, side);
    }
    public double getSide() {
        return getWidth();
    }


    public void setSide(double side) {
        setWidth(side);
        setLenght(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString() +  "Dien tich hinh vuong " + getArea();
    }



}
