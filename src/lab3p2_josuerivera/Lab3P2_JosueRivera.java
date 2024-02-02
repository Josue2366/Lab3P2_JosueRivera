/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_josuerivera;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author josue
 */
public class Lab3P2_JosueRivera {
static Scanner sc = new Scanner(System.in);// Scanner de integer
static Scanner cs = new Scanner (System.in);// Scanner de String
static Random rand = new Random();
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
                    int cont = 0;
                    if (lista.isEmpty()){
                        System.out.println("La lista de pokemones esta vacia");
                        break;
                    }
                    else{
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
                            case 1:
                                for (Pokemon i : lista) {
                                    if (i instanceof Fire_Type){
                                        System.out.println(lista.indexOf(i)+". "+ i);
                                        cont ++;
                                    }
                                }
                                if (cont == 0){
                                    System.out.println("No se encuentran de ese tipo existente en la lista");
                                    cont =0;
                                    break;
                                }
                                cont = 0;
                                System.out.println("Introduzca una opcion valida:");
                                int eliminar = sc.nextInt();
                                while (lista.get(eliminar) instanceof Fire_Type == false){
                                    System.out.println("Introduzca una opcion valida:");
                                    eliminar = sc.nextInt();
                                }
                                lista.remove(eliminar);
                                break;
                                
                            case 2:
                                for (Pokemon i : lista) {
                                    if (i instanceof Water_Type){
                                        System.out.println(lista.indexOf(i)+". "+ i);
                                        cont ++;
                                    }
                                }
                                if (cont == 0){
                                    System.out.println("No se encuentran de ese tipo existente en la lista");
                                    cont =0;
                                    break;
                                }
                                cont = 0;
                                System.out.println("Introduzca una opcion valida:");
                                eliminar = sc.nextInt();
                                while (lista.get(eliminar) instanceof Water_Type == false){
                                    System.out.println("Introduzca una opcion valida:");
                                    eliminar = sc.nextInt();
                                }
                                lista.remove(eliminar);
                                break;
                                
                            case 3:
                                for (Pokemon i : lista) {
                                    if (i instanceof Grass_Type){
                                        System.out.println(lista.indexOf(i)+". "+ i);
                                        cont++;
                                    }
                                }
                                if (cont == 0){
                                    System.out.println("No se encuentran de ese tipo existente en la lista");
                                    cont =0;
                                    break;
                                }
                                cont = 0;
                                System.out.println("Introduzca una opcion valida:");
                                eliminar = sc.nextInt();
                                while (lista.get(eliminar) instanceof Grass_Type == false){
                                    System.out.println("Introduzca una opcion valida:");
                                    eliminar = sc.nextInt();
                                }
                                lista.remove(eliminar);
                                break;
                        }// fin del switch (opcion)
                        break;
                    }
                    
                case 5:
                    if (lista.isEmpty() || pokeballs.isEmpty()){
                        System.out.println("una de las listas esta vacia");
                        break;
                    }
                    else{
                        for (Pokeball i : pokeballs) {
                            System.out.println(i);
                        }
                        int bola = sc.nextInt();
                        while(bola < 0 || bola > pokeballs.size()){
                            for (Pokeball i : pokeballs) {
                            System.out.println(i);
                            }
                            bola = sc.nextInt();
                        }
                        int poke = rand.nextInt(lista.size());
                        while(lista.get(poke).isCapturado()){
                            poke = rand.nextInt(lista.size());
                        }
                        System.out.println("EL POKEMON " + lista.get(poke).getNombre()+" HA APARECIDO");
                        System.out.println("////Menu////");
                        System.out.println("1. capturar pokemon");
                        System.out.println("2. huir");
                        System.out.println("Introduzca su opcion");
                        int cap_huir = sc.nextInt();
                        while(cap_huir < 1 || cap_huir > 2){
                            System.out.println("////Menu////");
                            System.out.println("1. capturar pokemon");
                            System.out.println("2. huir");
                            System.out.println("Introduzca su opcion");
                            cap_huir = sc.nextInt();
                        }
                        switch(cap_huir){
                            case 1:
                                
                                break;
                                
                            case 2:
                                break;
                        }// Fin de switch (cap_huir)
                        break;
                    }
                    
                    
            }// fin del switch
        }// fin del while (Respuesta)
    }// Fin del main
    
}// Fin de la clase
