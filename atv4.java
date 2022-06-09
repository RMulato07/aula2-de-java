import java.util.Scanner;

public class atv4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println(nome + ", Escreva a sua velocidade ");
        Double velocidade = entrada.nextDouble();
        if(velocidade > 80){
            Double acima = velocidade - 80;
            Double multa = acima *5;
            System.out.println("voce ultrapassou a velocidade permitida, sua multa é de "+multa+" reais");
        }else{
            System.out.println("voce esta no limite");
        }
        
    }
}
