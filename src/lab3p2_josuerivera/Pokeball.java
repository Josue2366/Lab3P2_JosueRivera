/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josuerivera;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Pokeball {
    private String color;
    private int numero_serie;
    private int eficiencia;

    public Pokeball(String color, int numero_serie, int eficiencia) {
        this.color = color;
        this.numero_serie = numero_serie;
        this.eficiencia = eficiencia;
    }

    public Pokeball() {
    }

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "color=" + color + ", numero_serie=" + numero_serie + ", eficiencia=" + eficiencia + '}';
    }
    
    public boolean repetido(ArrayList<Pokeball> lista, int x){
        if (lista.isEmpty()){
            return true;
        }else{
            for (Pokeball p : lista) {
                if (p.getNumero_serie() == x){
                    return false;
                }
            }
            return true;
        }
    }
    
}
