import java.util.List;
import java.util.Scanner;

import primos.Paralela;
import primos.Secuencial;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número N: ");
        int n = sc.nextInt();
        sc.close();

        // Secuencial
        Secuencial secuencial = new Secuencial();
        long t1 = System.currentTimeMillis();
        List<Integer> primosSec = secuencial.obtenerPrimos(n);
        long t2 = System.currentTimeMillis();
        System.out.println("\n[Secuencial] Primos: " + primosSec);
        System.out.println("[Secuencial] Tiempo: " + (t2 - t1) + " ms");

        // Paralelo
        Paralela paralela = new Paralela();
        long t3 = System.currentTimeMillis();
        List<Integer> primosPar = paralela.obtenerPrimos(n);
        long t4 = System.currentTimeMillis();
        System.out.println("\n[Paralelo] Primos: " + primosPar);
        System.out.println("[Secuencial] Tiempo: " + (t2 - t1) + " ms");
        System.out.println("[Paralelo] Tiempo: " + (t4 - t3) + " ms");
        System.out.println("N: " + n);
        System.out.println(
                "Diferencia: " + Math.abs(t4 - t3 - (t2 - t1)) + " ms" + " a favor del " + ((t4 - t3) > (t2 - t1) ? " Secuencial"
                        : "Paralelo"));
    }
}
