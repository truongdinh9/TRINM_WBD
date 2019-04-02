public class TestColorable {
    public static void main(String[] args) {
            // add tat ca vao trong shapes
            Shape[] shapes = new Shape[2];
            shapes[0] = new Rectangle() ;
            shapes[1] = new Square(2);



            // sau do duyet mang
            for (Shape shape : shapes){
                // instance of tim kiem so sanh trong co Square khong
                if (shape instanceof  Square){
                    Colorable colorable = (Square)shape; // neu co thi ep kieu ve colorable
                    colorable.howToColor(); // goi method howToColor
                    System.out.println(colorable.toString());
                }else{
                    System.out.println(shape); // hien thi hinh con lai trong mang
                }
            }
    }
}
