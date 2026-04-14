import java.util.Scanner;

public class CarregadorBetoneira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double pesoAlvo = 500.0;
        double pesoAtual = 0.0;
        int ciclo = 0;

        System.out.println("Simulador de peso ");
        System.out.println("Meta " + pesoAlvo + " kg de brita 1");
        do{
            System.out.println("Digite o peso da brita adicionada (kg): ");
            pesoAtual += scanner.nextDouble();
            ciclo++;
            
            System.out.println("Peso atual: " + pesoAtual + " kg");

        }while(pesoAtual <= pesoAlvo);
        
        System.out.println("Meta atingida em " + ciclo + " ciclos ");
        
        if (pesoAtual > pesoAlvo*1.05) {
            System.out.println("Cuidado! Você ultrapassou o limite em mais de 5%");
            System.out.println("Pode estar com problemas de estabilidade");
        } else{
            System.out.println("Peso dentro do aceitavel");
        }
        scanner.close();
    }
}