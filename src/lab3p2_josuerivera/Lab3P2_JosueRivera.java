/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_josuerivera;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Lab3P2_JosueRivera {
static Scanner sc = new Scanner(System.in);// Scanner de integer
static Scanner cs = new Scanner (System.in);// Scanner de String

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pokemon> lista = new ArrayList<>();
        ArrayList <Pokeball> pokeballs = new ArrayList<>();
        Pokeball p = new Pokeball();
        int respuesta = 0;
        while(respuesta != 7){
            System.out.println("////Menu////");
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Lista Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir");
            System.out.println("Ingrese su respuesta:");
            respuesta = sc.nextInt();
            while(respuesta < 1 || respuesta > 7){
                System.out.println("Error");
                System.out.println("////Menu////");
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Lista Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Salir");
            System.out.println("Ingrese su respuesta:");
            respuesta = sc.nextInt();
            }
            switch (respuesta){
                case 1:
                    System.out.println("Ingrese el nombre:");
                    String nombre = cs.nextLine();
                    System.out.println("Ingrese un numero de entrada en la pokedex:");
                    int pokedex = sc.nextInt();
                    System.out.println("Ingrese su Naturaleza:");
                    String naturaleza = cs.nextLine();
                    while(naturaleza .equals("Timido")
                            && naturaleza.equals("timido")== false 
                            && naturaleza.equals("Energetico")== false 
                            && naturaleza.equals("energetico") == false 
                            && naturaleza.equals("Misterioso")== false 
                            && naturaleza .equals("misterioso") == false){
                        
                        System.out.println("Ingrese su Naturaleza:");
                        naturaleza = cs.nextLine();
                        
                    }
                    System.out.println("////Menu////");
                    System.out.println("1. Fire type");
                    System.out.println("2. Water type");
                    System.out.println("3. Grass type");
                    int res = sc.nextInt();
                    while(res < 1 || res > 3){
                        System.out.println("////Menu////");
                        System.out.println("1. Fire type");
                        System.out.println("2. Water type");
                        System.out.println("3. Grass type");
                        res = sc.nextInt();
                    }
                    switch (res){
                        case 1:
                            System.out.println("El numero de la potencia de sus llamas:");
                            int llamas = sc.nextInt();
                            lista.add(new Fire_Type(llamas,nombre,pokedex,
                                    naturaleza,false));
                            break;
                            
                        case 2: 
                            System.out.println("El numero de rapidez al nadar");
                            int rapidez = sc.nextInt();
                            System.out.println("el pokemon puede sobrevivir en agua");
                            System.out.println("1. True");
                            System.out.println("2. False");
                            int agua = sc.nextInt();
                            while(agua < 1 || agua > 2){
                                System.out.println("el pokemon puede sobrevivir en agua");
                                System.out.println("1. True");
                                System.out.println("2. False");
                            }
                            switch (agua){
                                case 1:
                                    lista.add(new Water_Type(true,
                                            rapidez,nombre,pokedex,naturaleza
                                            ,false));
                                    break;
                                    
                                case 2:
                                    lista.add(new Water_Type(false,
                                            rapidez,nombre,pokedex,naturaleza
                                            ,false ));
                                    break;
                            }// fin del switch (agua)
                            break;
                            
                        case 3:
                            System.out.println("Ingrese el habitad");
                            String Habitad = cs.nextLine();
                            System.out.println("Ingrese en numero su dominio sobre las plantas:");
                            int planta = sc.nextInt();
                            while(planta < 0 || planta > 100){
                                System.out.println("Introduzca el numero del 1 - 100");
                                System.out.println("Ingrese en numero su dominio sobre las plantas:");
                                planta = sc.nextInt();
                            }
                            lista.add(new Grass_Type(Habitad,planta,nombre,pokedex,
                                    naturaleza,false));
                            break;
                    }// Fin del switch (res)
                    break;
                    
                case 2:
                    System.out.println("Ingrese su color");
                    String Color = cs.nextLine();
                    System.out.println("Ingrese el numero de serie de la Pokebola");
                    int pokeball = sc.nextInt();
                    while(p.repetido(pokeballs, pokeball)){
                        System.out.println("Ingrese el numero de serie de la Pokebola");
                        pokeball = sc.nextInt();
                    }
                    System.out.println("Introduzca la eficiencia de la pokebola(1-3)");
                    int eficiencia = sc.nextInt();
                    while(eficiencia < 1 || eficiencia > 3){
                        System.out.println("Introduzca la eficiencia de la pokebola(1-3)");
                        eficiencia = sc.nextInt();
                    }
                    pokeballs.add(new Pokeball(Color,pokeball,eficiencia));
                    break;
                case 3:
                    if (lista.isEmpty()){
                        System.out.println("La lista de pokemones esta vacia");
                        break;
                    }
                    else{
                        for (Pokemon i : lista) {
                            if (i instanceof Fire_Type){
                                System.out.println(i);
                            }
                        }
                        for (Pokemon i : lista) {
                            if (i instanceof Water_Type){
                                System.out.println(i);
                            }
                        }
                        for (Pokemon i : lista) {
                            if (i instanceof Grass_Type){
                                System.out.println(i);
                            }
                        }
                        break;
                    }
                    
                case 4:
                    System.out.println("////Menu////");
                    System.out.println("1. Fire type");
                    System.out.println("2. Water type");
                    System.out.println("3. Grass type");
                    int opcion = sc.nextInt();
                    while(opcion < 1 || opcion > 3){
                        System.out.println("////Menu////");
                        System.out.println("1. Fire type");
                        System.out.println("2. Water type");
                        System.out.println("3. Grass type");
                        opcion = sc.nextInt();
                    }
                    switch (opcion){
                        
                    }// fin del switch (opcion)
            }// fin del switch
        }// fin del while (Respuesta)
    }// Fin del main
    
}// Fin de la clase
