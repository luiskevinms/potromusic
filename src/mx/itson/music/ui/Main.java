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
        System.out.println("Ingrese el año de lanzamiento del Album: ");
        a.setLanzamiento(scanner.nextInt());
        
        //Solicitar Género
        System.out.println("Ingrese el género del álbum (Pop, Rock, Dance, Salsa, Otro): ");
        String generoIngresado = scanner.nextLine().toUpperCase(); //.toUpperCase porque los enums están en Mayusculas
        Género genero;

        try {
            genero = Género.valueOf(generoIngresado);
        } catch (IllegalArgumentException e) {
            genero = Género.OTRO; // Si el usuario escribe algo incorrecto, se asigna "OTRO" por defecto
        }

        a.setGénero(genero);

        
        List<Canción> canciones = new ArrayList<>();
        
        Canción canción1 = new Canción();
         canción1.setNombre("DTMF");
         canción1.setOrden(1);
         canción1.setDuración(237);
         
         Canción canción2 = new Canción();
         canción2.setNombre("Mudanza");
         canción2.setOrden(2);
         canción2.setDuración(213);
         
         
        canciones.add(canción1);
        canciones.add(canción2);
        
        a.setCanciones(canciones);
       
        
    }
}
