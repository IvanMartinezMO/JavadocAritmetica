
package javadoca;

/**
 * Esta clase representa operaciones aritméticas básicas.
 * 
 * @author claramolinosaraiz
 */
public class Aritmetica {

    /**
     * Realiza la suma de dos números enteros.
     * 
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números enteros.
     * 
     * @param a El primer número entero (minuendo).
     * @param b El segundo número entero (sustraendo).
     * @return La resta del primer número menos el segundo.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números enteros.
     * 
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El producto de los dos números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números enteros.
     * 
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división como un número de punto flotante (double).
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

