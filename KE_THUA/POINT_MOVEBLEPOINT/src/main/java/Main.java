public class Main {
    public static void main(String[] args) {
        MoveablePoint  moveablePoint = new MoveablePoint(0.5f, 0.7f, 1.2f, 1.3f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
