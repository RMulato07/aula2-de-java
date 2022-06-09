import java.util.Scanner;

public class Revisao {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println(" Ola, "+ nome + " seja bem-vindo(a) ao meu programa!");

        System.out.println
        ("====================================================================");

        System.out.println(nome + ", Escreva a sua nota de Html: ");
        Double nota1 = entrada.nextDouble();
        Double total = nota1*0.5;
        System.out.println("sua nota foi " + total);
    }
}