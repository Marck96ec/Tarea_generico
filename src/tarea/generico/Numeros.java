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
public class Numeros<T> {
    private T valor1, valor2;
 

    public Numeros(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public String toString() {
        return "Numeros{" + "valor1=" + valor1 + ", valor2=" + valor2 + '}';
    }
   

    public T getValor1() {
        return valor1;
    }

    public void setValor1(T valor1) {
        this.valor1 = valor1;
    }

    public T getValor2() {
        return valor2;
    }

    public void setValor2(T valor2) {
        this.valor2 = valor2;
    }
    
    
}
