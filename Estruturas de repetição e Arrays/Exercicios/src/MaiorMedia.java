import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

     do {
        System.out.println("Digite um numero: ");
        numero =  scan.nextInt();

        if (numero > maior) maior = numero;

        soma = soma + numero;
        count = count + 1;
        
    } while(count < 5);
    
    soma = soma / count;
    System.out.println("Maior :"+ maior);
    System.out.println("Média: "+ soma);

    }
    
}
