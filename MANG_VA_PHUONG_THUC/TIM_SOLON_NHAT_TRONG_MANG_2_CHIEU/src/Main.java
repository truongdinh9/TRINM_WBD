public class Main {
    public static void main(String[] args) {
        int[][]  arr = {{3,2},{6,4},{12,7}};
         for (int dong = 0; dong < arr.length; dong ++){
             for (int cot = 0; cot < arr[dong].length;cot ++){

                 System.out.print(" " + arr[dong][cot]);
             }
             System.out.println("");
         }
        System.out.println("");

         int max = arr[0][0];
         for (int dong = 0; dong < arr.length;dong++){
             for (int cot =0; cot< arr[dong].length;cot++){
                 if (arr[dong][cot] > max){
                     max = arr[dong][cot];
                 }
             }
         }
        System.out.println("Phan tu lon nhat: " + max);
    }
}
