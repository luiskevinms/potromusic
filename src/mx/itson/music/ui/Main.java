/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
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
        
        Artista artista = new Artista();
        artista.setNombre("Bad Bunny");
        artista.setSitioWeb("www.badbunny.com");
        
        Album a = new Album();
        a.setNombre("Debí tirar más fotos");
        a.setLanzamiento(2025);
        a.setArtista(artista);
        a.setGénero(Género.OTRO);
        
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
