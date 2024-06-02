import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class UnirYOrdenarColas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();

        System.out.println("Ingresa 10 valores para la primera cola:");
        for (int i = 0; i < 10; i++) {
            cola1.add(scanner.nextInt());
        }

        System.out.println("Ingresa 10 valores para la segunda cola:");
        for (int i = 0; i < 10; i++) {
            cola2.add(scanner.nextInt());
        }

        ArrayList<Integer> lista = new ArrayList<>(cola1);
        lista.addAll(cola2);
        Collections.sort(lista);

        Queue<Integer> colaUnida = new LinkedList<>(lista);
        System.out.println("Cola unida y ordenada: " + colaUnida);
    }
}
