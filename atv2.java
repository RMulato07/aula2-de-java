import java.util.Scanner;

public class atv2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println(nome + ", Ecreva quantos metros   ");
        Double metro = entrada.nextDouble();
        Double cm = metro*100;
        System.out.println( " seu valor em centimetros: " + cm);
      
    }
};

