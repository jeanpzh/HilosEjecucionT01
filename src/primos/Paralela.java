package primos;
import java.util.ArrayList;
import java.util.List;

public class Paralela {
    public List<Integer> obtenerPrimos(int n) throws InterruptedException {

        int hilos = Runtime.getRuntime().availableProcessors(); 
        int bloque = (n + hilos - 1) / hilos; 

        List<Integer> primos = new ArrayList<>();
        List<TareaPrimoParalela> tareas = new ArrayList<>();

        for (int i = 0; i < hilos; i++) { 

            // Establecer rango de búsqueda para cada hilo
            int ini = i * bloque + 1; // 
            int fin = Math.min((i + 1) * bloque, n);
            
            TareaPrimoParalela t = new TareaPrimoParalela(ini, fin, primos);
            tareas.add(t);
            t.start();
        }

        for (TareaPrimoParalela t : tareas) {
            t.join();
        }

        return primos;
    }
}
