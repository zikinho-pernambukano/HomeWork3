import java.util.Arrays;

public class Task3 {


    public static void main(String[] args) {

        int arr []= {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int count = 0; count < arr.length; count++){
            if (arr[count]<6){
                arr [count] = arr [count] *2;

            }



        }
        System.out.println(Arrays.toString(arr));










    }
}
