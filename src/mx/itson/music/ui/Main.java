/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.music.entidades.Album;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Canción;
import mx.itson.music.enums.Género;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitud de datos del Artista
        Artista artista = new Artista();
        System.out.println("Ingrese el nombre del Artista: ");
        artista.setNombre(scanner.nextLine());
        System.out.println("Ingrese el Sitio Web del Artista: ");
        artista.setSitioWeb(scanner.nextLine());
        
        
        //Solicitud de datos del Album
        Album a = new Album();
        System.out.println("Ingrese el nombre del Album: ");
        a.setNombre(scanner.nextLine());
        
         // Solicitar el año de lanzamiento con manejo de excepciones
        int añoLanzamiento = 0;
        boolean añoValido = false;

        while (!añoValido) {
            try {
                System.out.println("Ingrese el año de lanzamiento del Album: ");
                añoLanzamiento = scanner.nextInt();
                a.setLanzamiento(añoLanzamiento);
                scanner.nextLine();  // Se agrega un salto de linea después de un nextInt 
                añoValido = true;  // Año válido, salir del bucle
            } catch (Exception e) {
                System.err.println("El año de lanzamiento debe ser un número entero.");
                scanner.nextLine();  // Limpiar el buffer
            }
        }

        //Solicitar canciones
        List<Canción> canciones = new ArrayList<>();
        
        String otraCancion;
        int orden = 1;
        
        do{
            Canción canción = new Canción();
            System.out.println("Ingrese el nombre de la canción ");
            canción.setNombre(scanner.nextLine());
            
            System.out.println("Ingrese la duración de la canción en segundos ");
            canción.setDuración(scanner.nextInt());
            scanner.nextLine(); //Se agregó otra vez salto de linea después de usar un nextInt 
            
            canción.setOrden(orden++);
            canciones.add(canción);
            
            System.out.println("Si desea agregar otra canción presione 's', si desea dejar de agregar presione 'n':  ");
            otraCancion = scanner.nextLine();
            
        }while (otraCancion.equals("s"));
        
        a.setCanciones(canciones);
       
        //Mostrar datos del artista, del album y la lista de las canciones
        System.out.println("    Datos del Artista");
        System.out.println("Nombre del Artista: " + artista.getNombre());
        System.out.println("Sitio Web del Artista: " + artista.getSitioWeb());

        System.out.println("    Datos del Álbum");
        System.out.println("Nombre del Álbum: " + a.getNombre());
        System.out.println("Año de Lanzamiento: " + a.getLanzamiento());

        System.out.println("    Lista de Canciones");
        for (Canción cancion : a.getCanciones()) {
            System.out.println("Orden: " + cancion.getOrden() + " - Nombre: " + cancion.getNombre() + " - Duración: " + cancion.getDuración() + " segundos");
        
    }
}
}
