import java.util.Arrays;

public class Task1 {


    public static void main(String[] args) {
        int arr[]= {1,1,1,0,0,1,1,0,1};
        System.out.println(Arrays.toString(arr));    // превращение массива в строку и вывод в консоль

        for(int count=0; count < arr.length; count++ ){ //цикл перебора ячеек в массиве




            if (arr[count]==1)                   //замена цифр
            {
                arr[count]=0;
            }

            else

                {
                arr[count]=1;
            }




        }
        System.out.println(Arrays.toString(arr));



    }



}
