import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaEsc {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        int multiplicand = 0;
        int multiplier = 0;
        do {
            System.out.println("Ingrese un numero");
            multiplicand = Integer.parseInt(bufEntrada.readLine());
            for (multiplier = 1; multiplier <= 12; multiplier += 1) {
                total = multiplicand * multiplier;
                System.out.println(multiplicand + " multiplicado por " + multiplier + " es igual a " + total);
            }
        } while (multiplicand != -1);
    }
}
