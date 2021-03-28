public class Task6 {


    public static void main(String[] args) {

        int arr[]= {5,10,15,2,500,20,25,30};

        int min=arr[0];
        int max=arr[0];


         for (int count =0;count< arr.length;count++){  // запуск цикла


             if (arr[count]>max){      // Если (число в массиве под номером "count" ,больше текущего максимального),{ то
                  max=arr[count];     // оно станет новым максимальным}
              }
             else if (arr[count]<min){  // иначе, если (чсило в массиве под номером "count" меньше минимального),{то
                 min=arr[count];       // оно станет минимальным }
              }

         }

        System.out.println(min+"  "+ max);

    }
}
