package primos;
import java.util.ArrayList;
import java.util.List;

public class Secuencial {
    public List<Integer> obtenerPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }

    private boolean esPrimo(int num) {
        
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
