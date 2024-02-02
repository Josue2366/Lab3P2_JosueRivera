/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josuerivera;

/**
 *
 * @author josue
 */
public class Pokemon {
    protected String nombre;
    protected int entrada;
    protected String naturaleza;
    protected boolean capturado;
    protected Pokeball ball;

    public Pokemon(String nombre, int entrada, String naturaleza, boolean capturado) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.naturaleza = naturaleza;
        this.capturado = capturado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public Pokeball getBall() {
        return ball;
    }

    public void setBall(Pokeball ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", entrada=" + entrada + ", naturaleza=" + naturaleza + ", capturado=" + capturado + ", ball=" + ball + '}';
    }
    
}
