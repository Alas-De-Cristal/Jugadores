
import java.util.Scanner;
import java.util.Stack;

public class NumeroEnLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.println("Ingresa 10 números entre 0 y 10:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num >= 0 && num <= 10) {
                pila.push(num);
            } else {
                System.out.println("Número fuera de rango. Intenta de nuevo.");
                i--; // to ensure 10 valid numbers are entered
            }
        }

        while (!pila.isEmpty()) {
            System.out.println(convertirANumero(pila.pop()));
        }
    }

    private static String convertirANumero(int num) {
        switch (num) {
            case 0: return "Cero";
            case 1: return "Uno";
            case 2: return "Dos";
            case 3: return "Tres";
            case 4: return "Cuatro";
            case 5: return "Cinco";
            case 6: return "Seis";
            case 7: return "Siete";
            case 8: return "Ocho";
            case 9: return "Nueve";
            case 10: return "Diez";
            default: return "Número fuera de rango";
        }
    }
}