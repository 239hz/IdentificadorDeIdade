import java.util.Scanner;

class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a;
        System.out.println("Digite sua idade:");
        a = ler.nextInt();

        if (a < 18) {
            System.out.println(("Você é menor de idade"));
        } else if (a < 63) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }

    }
}