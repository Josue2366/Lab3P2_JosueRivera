/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josuerivera;

/**
 *
 * @author josue
 */
public class Grass_Type extends Pokemon{
   private String Habitad;
   private int dominio;

    public Grass_Type(String Habitad, int dominio, String nombre, int entrada, String naturaleza, boolean capturado) {
        super(nombre, entrada, naturaleza, capturado);
        this.Habitad = Habitad;
        this.dominio = dominio;
    }

    public String getHabitad() {
        return Habitad;
    }

    public void setHabitad(String Habitad) {
        this.Habitad = Habitad;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    @Override
    public String toString() {
        return super.toString()+"Grass_Type{" + "Habitad=" + Habitad + ", dominio=" + dominio + '}';
    }
   
}
