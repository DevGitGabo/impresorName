import java.util.Scanner;

public class Visual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.println("La edad del estudiante es: " + edad);
    }
}
