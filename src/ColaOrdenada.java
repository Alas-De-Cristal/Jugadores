import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ColaOrdenada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> cola = new LinkedList<>();

        System.out.println("Ingresa 10 valores:");
        for (int i = 0; i < 10; i++) {
            cola.add(scanner.nextInt());
        }

        ArrayList<Integer> lista = new ArrayList<>(cola);
        Collections.sort(lista);

        System.out.println("Cola ordenada: " + lista);
    }
}