import java.util.Arrays;

public class Task2 {


    public static void main(String[] args) {

    int arr [] = new int [100];    //  массив целых "arr" = новый целый массив длинной 100


        for (int count = 0; count < arr.length; count ++){

            arr[count] = count +1;


        }



        System.out.println(Arrays.toString(arr));



    }



}
