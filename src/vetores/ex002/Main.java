package vetores.ex002;

import javax.naming.InsufficientResourcesException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos números você deseja digitar: ");
        n = sc.nextInt();


        float[] vect = new float[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextFloat();

        }System.out.print("Valores: ");

        float sum = 0;

        for (int a = 0; a < vect.length; a++){
            System.out.print(vect[a]+", ");
            sum += vect[a];

        }System.out.printf("%nA soma de todos os valores é de : %.2f%n",sum);

        float media = sum/n;

        System.out.printf("A média é de : %.2f%n", media);

        sc.close();
    }
}
