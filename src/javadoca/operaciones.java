package javadoca;

/**
 * Esta clase representa operaciones matemáticas avanzadas.
 * 
 * @author claramolinosaraiz
 */
public class Operaciones {

    /**
     * Calcula el módulo de dos números enteros.
     * 
     * @param a El dividendo.
     * @param b El divisor.
     * @return El residuo de la división entera (módulo).
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

    /**
     * Calcula el cuadrado de un número entero.
     * 
     * @param a El número entero.
     * @return El cuadrado del número.
     */
    public int calcularCuadrado(int a) {
        return a * a;
    }

    /**
     * Calcula la raíz cuadrada de un número de punto flotante.
     * 
     * @param a El número de punto flotante.
     * @return La raíz cuadrada del número.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

