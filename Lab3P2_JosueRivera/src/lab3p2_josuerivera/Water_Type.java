/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josuerivera;

/**
 *
 * @author josue
 */
public class Water_Type extends Pokemon{
    private boolean sobrevive_agua;
    private int rapidez;

    public Water_Type(boolean sobrevive_agua, int rapidez, String nombre, int entrada, String naturaleza, boolean capturado) {
        super(nombre, entrada, naturaleza, capturado);
        this.sobrevive_agua = sobrevive_agua;
        this.rapidez = rapidez;
    }

    public boolean isSobrevive_agua() {
        return sobrevive_agua;
    }

    public void setSobrevive_agua(boolean sobrevive_agua) {
        this.sobrevive_agua = sobrevive_agua;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    

    @Override
    public String toString() {
        return super.toString()+"Water_Type{" + "sobrevive_agua=" + sobrevive_agua + ", rapidez=" + rapidez + '}';
    }
    
}
