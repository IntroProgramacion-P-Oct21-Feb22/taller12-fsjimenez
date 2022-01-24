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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        for (int i = 0; i < bases.length; i++) {
            resultado[i] = potencia(bases[i], potencias[i]);
            System.out.println("Potencia: " + resultado[i]);
        }
        System.out.println("Suma de todas las potencias: " + suma(resultado, resultado.length - 1));
    }
    
    public static double potencia(double base, double potence){
        if (potence == 0) {
            return 1;
        }else{
            if (potence == 1) {
                return base;
            }else{
                return base * potencia(base, potence - 1);            
            }       
        }   
    }
    
    public static double suma(double[] datos, double pos){
        int tam = (int) pos;
        int rta;
        if (tam == 0) {
            return datos[tam];
        }else{        
            rta = (int) (datos[tam] + suma(datos, tam - 1));
        }
        return rta;
    }
    
    
}
