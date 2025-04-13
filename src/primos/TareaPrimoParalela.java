package primos;
import java.util.List;

public class TareaPrimoParalela extends Thread {
    private int inicio, fin;
    private List<Integer> resultado;

    public TareaPrimoParalela(int inicio, int fin, List<Integer> resultado) {
        this.inicio = inicio;
        this.fin = fin;
        this.resultado = resultado;
    }

    @Override
    public void run() {
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                synchronized (resultado) {
                    resultado.add(i);
                }
            }
        }
    }

    private boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
