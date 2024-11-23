import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie wartości a, b, c od użytkownika
        System.out.print("Podaj wartość a: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj wartość b: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj wartość c: ");
        double c = scanner.nextDouble();

        // Obliczenie delty (Δ)
        double delta = b * b - 4 * a * c;

        // Wyznaczanie pierwiastków na podstawie wartości delty za pomocą switch
        switch ((delta > 0) ? 1 : (delta == 0) ? 0 : -1) {
            case 1: // delta > 0 (dwa różne pierwiastki)
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Równanie ma dwa pierwiastki: x1 = %.2f, x2 = %.2f%n", x1, x2);
                break;
            case 0: // delta == 0 (jeden pierwiastek podwójny)
                double x = -b / (2 * a);
                System.out.printf("Równanie ma jeden podwójny pierwiastek: x = %.2f%n", x);
                break;
            case -1: // delta < 0 (brak pierwiastków rzeczywistych)
                System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
                break;
            default:
                System.out.println("Nieznany błąd.");
                break;
        }

        // Zamknięcie zasobów
        scanner.close();
    }
}