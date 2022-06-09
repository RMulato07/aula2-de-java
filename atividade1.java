import java.util.Scanner;

public class atividade1{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = entrada.nextLine();
        
        
        System.out.println(nome + ", Ecreva o primeiro numero  ");
        Double valor2 = entrada.nextDouble();
        System.out.println(nome + ", Ecreva o segundo numero  ");
        Double valor1 = entrada.nextDouble();
        Double total = valor1+valor2;
        System.out.println("sua nota foi " +total );
    }
};
