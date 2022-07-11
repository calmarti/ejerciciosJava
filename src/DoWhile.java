import java.util.InputMismatchException;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        boolean done = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un par de enteros:");
            try {
                int entero1 = scanner.nextInt();
                int entero2 = scanner.nextInt();
                int suma = entero1 + entero2;
                System.out.println("La suma de los números introducidos es: " + suma);
                done = true;

            } catch (InputMismatchException e) {
                System.out.println("Los datos deben ser números enteros!");
                System.out.println(e.getMessage());
            }
        }while(!done);
    }
}
