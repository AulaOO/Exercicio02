/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Luis Guilherme
 */
public class Quadrado {
    private int lado;


    public Quadrado(int valor) {
        lado = valor;
    }
    
    public float calcularArea(){
        float area = lado*lado;
        return area;
    }
    
    public float calcularPerimetro(){
        float perimetro = lado*4;
        return perimetro;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
}


