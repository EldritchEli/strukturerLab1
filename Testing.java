import java.util.ArrayList;
import java.util.List;

public class Testing {



    public static void main(String[] args) {
        int [] arr = {1,2,9,2,7,4,5,8,9,2,6,5};
        System.out.println("before");
        for (int i = 0; i < arr.length; i++) {

            List<Integer> list = new ArrayList<>();
            System.out.print(arr[i]);

        }
     Lab1.quickSort(arr);
        System.out.println("\nafter");
        for (int i = 0; i < arr.length; i++) {


            System.out.print(arr[i]);

    }




}}

