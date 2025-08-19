import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[] insertAtEnd(int[] A, int currentLength,int x) {
        A[currentLength] = x;
        currentLength++;
        return A;
    }



    public static void main(String[] args) {
        //array
        //int[]Numbers = new  int [5];

        // int currentLenght=0;


        /*for (int i=0;i< 2; i++){

            Numbers[i]=i+100;
            currentLenght++;

        }
        System.out.println(Arrays.toString(Numbers));
        insertAtEnd(Numbers, currentLenght, 100);
        System.out.println(Arrays.toString(Numbers));
        System.out.println(currentLenght);





        int [] valores ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valorInserido = 100;
        int indexInserir=5;


        System.out.println(Arrays.toString(valores));



*/

        int [] valores ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valorInserido = 100;
        int indexInserir=5;


        System.out.println(Arrays.toString(valores));
        for (int i = valores.length-2;i>=indexInserir;i--){
            System.out.println(i);

            valores[i+1]=valores[i];

        }
        valores[indexInserir] = valorInserido;
        System.out.println(Arrays.toString(valores)); // [1, 2, 3, 4, 5, 100, 6, 7, 8, 9]





    }



}