import java.util.Arrays;

public class Task5 {


    public static void main(String[] args) {
        int acr [] = qwert(5,10);
        System.out.println(Arrays.toString(acr));


    }

    public static int[] qwert(int len,int IntialValue){

        int arr[]=new int[len];
        Arrays.fill(arr, IntialValue);
        return arr;




    }
}
