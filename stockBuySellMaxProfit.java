// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        MaxProfit(arr);
    }
    public static void MaxProfit(int[] arr){
        int min = arr[0];
        int maxprofit = 0;
        for(int i = 1; i<arr.length;i++){
         if(arr[i] < min){
             min = arr[i];
         }else{
           int currentProfit = arr[i] - min;
           if(currentProfit > maxprofit){
               maxprofit = currentProfit;
           }
        }
        }
      System.out.println(maxprofit);
    }
}
