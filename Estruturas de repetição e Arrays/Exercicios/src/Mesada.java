import java.util.Scanner;

public class Mesada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mesada = 50;

        System.out.println("Qantidade de meses: ");
            int meses = scan.nextInt();
        mesada = mesada * meses;
        System.out.println("Voce terá " + mesada +" em " + meses + " meses ");
    }
    
}
