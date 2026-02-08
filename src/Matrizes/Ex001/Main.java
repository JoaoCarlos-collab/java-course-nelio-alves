package Matrizes.Ex001;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o número de linhas da matriz: ");
        int lin = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual o número de colunas da matriz: ");
        int col = sc.nextInt();

        int[][] matr = new int[lin][col];
        System.out.println("Digite os elementos da matriz");

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf("M(%d,%d): ", i, j);
                matr[i][j] = sc.nextInt();
                sc.nextLine();
            }

        }for (int i = 0; i < matr.length; i++) {
            System.out.printf("M(%d,n): ", i);
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();

        }if (lin == col) {
            System.out.print("Diagonal principal da matriz quadrática: ");
            for (int i = 0; i < matr.length; i++) {
                System.out.print(matr[i][i] + " ");
            }
            System.out.println();

        } else {
            System.out.println("Matriz não possui Diagonal principal");

        }System.out.print("Digite a linha da matriz: ");
        int l = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a coluna da matriz: ");
        int c = sc.nextInt();
        sc.nextLine();

        if (l > 0){
            System.out.println("Número emcima: "+matr[l - 1][c]);

        }else{
            System.out.println("Não existe número emcima desse elemento");

        }if (l < matr.length - 1){
            System.out.println("Número embaixo: "+matr[l + 1][c]);

        }else{
            System.out.println("Não existe número embaixo desse elemento");

        }if (c > 0){
            System.out.println("Número a esquerda: "+matr[l][c - 1]);

        }else{
            System.out.println("Não existe número a esquerda desse elemento");

        }if (c < matr[l].length - 1){
            System.out.println("Número a direita: "+matr[l][c + 1]);

        }else {
            System.out.println("Não existe número a direita desse elemento");
        }

        sc.close();
    }
}
