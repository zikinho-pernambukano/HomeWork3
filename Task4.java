
public class Task4 {


    public static void main(String[] args) {

        int arr [][]= new int[8][8];      // создание двумерного массива

        for (int count1=0;count1<arr.length;count1++){




            for (int count2=0; count2<8;count2++){

                if ( count1 == count2 )
                {
                    arr[count1][count2]=1;
                }



                if (count1+count2==7)  /**вторая диагональ, сумма координат находящихся на ней                                        *
                                        * равна длине массива-1(итого 7), потому что отсчет с нуля
                                        */
                 {
                    arr[count1][count2]=1;

                }
                System.out.print(arr[count1][count2]+" ");


            }

            System.out.println();













































        }




    }
}
