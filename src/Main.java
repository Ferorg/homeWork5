import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 1");
        int [] massTask1 = new int[10];
        System.out.print("Исходный массив: ");
        for (int i=0;i<massTask1.length;i++) {
            massTask1[i]=(int) (Math.random()*100);
            System.out.print(massTask1[i]+" ");
        }
        System.out.print("\nИзмененный массив: ");
        for(int j=0;j<massTask1.length;j++){
            if(j%2!=0){
                massTask1[j]=0;
            }
            System.out.print(massTask1[j]+" ");

        }
//_____________________________________________________________________________________________-
        System.out.println("\n_______________________________");
        System.out.println("Задание 2");
        int[] massTask2 = {2,12413,12,2415,222,125167,1678,1,0,-10,4324,8,19,144};
        int max = massTask2[0];
        int indexMax=0;
        int min =massTask2[0];
        int indexMin=0;

        for (int i=0;i< massTask2.length;i++){
            if(massTask2[i]>=max){
                max=massTask2[i];
                indexMax = i;
            }
            if(massTask2[i]<=min){
                min=massTask2[i];
                indexMin = i;
            }
        }
        System.out.println("Максимальное значение "+max+" и его индекс "+indexMax);
        System.out.println("Минимальное значение "+min+" и его индекс "+indexMin);
        System.out.print("Введите число которое заменит максимальное число: ");
        massTask2[indexMax]=in.nextInt();
        System.out.print("Введите число которое заменит минимальное число: ");
        massTask2[indexMin]=in.nextInt();
        System.out.print("\nИзмененный массив: ");
        for(int j=0;j<massTask2.length;j++){
            System.out.print(massTask2[j]+" ");
        }

//-----------------------------------------------------------------------------------
        System.out.println("\n___________________________________-");
        System.out.println("Задание 3");
        int[] massTask3 = {2,12413,12,2415,222,125167,1678,1,0,-10,4324,8,19,144};
        for(int i=0;i<massTask3.length;i++){
            for(int j=0;j<massTask3.length-1;j++){
                if(massTask3[j]>massTask3[j+1]){
                    int temp = massTask3[j];
                    massTask3[j]=massTask3[j+1];
                    massTask3[j+1]=temp;
                }
            }
        }
        System.out.print("Отсортированный массив в порядке возрастания: ");
        for (int k=0;k< massTask3.length;k++ ) {
            System.out.print(massTask3[k] + " ");
        }

//_______________________________________________________________________-
        System.out.println("\n_____________________________");
        System.out.println("Задание 4");
        double[] massTask4 = {7,-525,6000,-255326.7,10500,-25,0,-105000,-255326.6,-7,255326,-6000,525,25,-10500};
        int i=0;

        int k=0;

        while (i<massTask4.length){
            int j=0;
            while(j<massTask4.length-1){
                if(massTask4[j]>massTask4[j+1]){
                    double tempe=massTask4[j];
                    massTask4[j]=massTask4[j+1];
                    massTask4[j+1]=tempe;
                }
                j++;
            }
            i++;
        }
        System.out.print("Отсартированный массив: ");
        while (k< massTask4.length){
            System.out.print(massTask4[k]+" ");
            k++;
        }

    }
}