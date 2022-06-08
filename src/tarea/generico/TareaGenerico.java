/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.generico;

/**
 *
 * @author clavi
 */
public class TareaGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numeros<Integer> numero = new Numeros<Integer>(6 , 5);
        
        
        System.out.println(numero);
        System.out.println("Sumar " + (numero.getValor1()+numero.getValor2()) );
        System.out.println("Restar " + (numero.getValor1()-numero.getValor2()) );
        System.out.println("Multiplicar " + (numero.getValor1()*numero.getValor2()) );
        System.out.println("Dividir " + (numero.getValor1()/numero.getValor2()) );
    }
    
}
