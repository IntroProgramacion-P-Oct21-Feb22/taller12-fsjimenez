/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                resultado[i][j] = obtenerFactorial(datos[i][j]);
                System.out.printf("Factorial de %s es: %s\n",
                        datos[i][j],
                        resultado[i][j]);
            }
        }

    }

    public static double obtenerFactorial(double n) {
        if (n == 0) {
            return 1.0;
        } else {
            return n * obtenerFactorial(n - 1);

        }

    }

}
