import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite um número inteiro: ");
            int param1 = scanner.nextInt();
            
            System.out.println("Digite um número inteiro: ");
            int param2 = scanner.nextInt();

            contar(param1, param2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        } finally {
            System.out.println("Developed by Rodrigo Torres");
        }

    }static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 >= param2) 
            throw new ParametrosInvalidosException();
        else {
            int contador = param2 - param1;
            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
