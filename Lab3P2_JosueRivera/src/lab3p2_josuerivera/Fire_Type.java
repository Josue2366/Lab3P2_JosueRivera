/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josuerivera;

/**
 *
 * @author josue
 */
public class Fire_Type extends Pokemon {
    private int llamas;

    public Fire_Type(int llamas, String nombre, int entrada, String naturaleza, boolean capturado) {
        super(nombre, entrada, naturaleza, capturado);
        this.llamas = llamas;
    }

    public int getLlamas() {
        return llamas;
    }

    public void setLlamas(int llamas) {
        this.llamas = llamas;
    }

    @Override
    public String toString() {
        return super.toString()+"Fire_Type{" + "llamas=" + llamas + '}';
    }

    
    
    
}
