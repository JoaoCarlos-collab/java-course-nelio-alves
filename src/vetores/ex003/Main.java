package vetores.ex003;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas: ");
        int n = sc.nextInt();

        Pessoa [] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Cadastrando %d° pessoa%n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            float altura = sc.nextFloat();

            vect[i] = new Pessoa(nome,idade,altura);
        }
        float somAlt = 0;
        float menor16 = 0;


        for (int i = 0; i < vect.length; i++){
            somAlt += vect[i].getAltura();

            if(vect[i].getIdade() < 16){
                menor16 += 1;
            }
        }
        float medAlt = somAlt/n;
        float porcen = (menor16/n)*100;
        System.out.printf("Altura média: %.2f%n",medAlt);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n",porcen);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();
    }
}
