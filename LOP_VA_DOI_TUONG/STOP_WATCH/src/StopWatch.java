public class StopWatch {
    private static long startTime;
    private static long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public static long start(){
       return startTime = System.currentTimeMillis();
    }
    public static long stop(){
        return endTime= System.currentTimeMillis();
    }

    public static long getElapsedTime(){
        long time =stop()- start();
       return  time;
    }

    public static void selectionSort(int [] arr){
        for (int i= 0;i<arr.length-1;i++){
           int min = i;
            for (int j=i + 1; j < arr.length;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
