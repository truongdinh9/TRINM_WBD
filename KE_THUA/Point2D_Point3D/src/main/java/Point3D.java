import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.z = z;
        super.getX();
        super.getY();
    }

    public float [] getXYZ(){
        float [] arr = new float[3];
        arr[0] = z;
        arr[1] = super.getX();
        arr[2] = super.getY();
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
