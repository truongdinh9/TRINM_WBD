import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        Random r = new Random();

        int [] arr  = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        st.getStartTime();
        st.selectionSort(arr);
        st.getEndTime();


//
        System.out.println(st.getElapsedTime());
    }
}
