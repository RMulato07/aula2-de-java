import java.util.Scanner;

public class atv3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = entrada.nextLine();
        
        
        System.out.println(nome + ", Ecreva um numero   ");
        Double numero = entrada.nextDouble();
        if(numero %2==0){
            System.out.println("seu nuemro é par");
        }else{
            System.out.println("seu numero é impar");
        }
      
    }
}
