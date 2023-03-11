import entidades.Pelicula;
import servicio.ServicioPelicula;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ServicioPelicula svp = new ServicioPelicula();

        //CREACION DE LA LISTA DE PELICULA

        ArrayList<Pelicula> listaPeliculas = svp.listaPelis();

        // películas con una duración mayor a 1 hora.

        System.out.println("");
        System.out.println("PELICULAS MAYOR A UNA HORA");
        svp.pelisDuracion(listaPeliculas);

        System.out.println("");
        System.out.println("PELICULAS ORDEN ASCEDENTE DURACION");
        svp.pelisrMenorMayor(listaPeliculas);
        System.out.println("");
        System.out.println("PELICULAS ORDEN DESCEDENTE DURACION");
        svp.pelisDuracionDescendente(listaPeliculas);
        System.out.println("");
        System.out.println("PELICULAS ORDEN ALFABETICO POR TITULO");
        svp.pelisTituloAlfabetico(listaPeliculas);
        System.out.println("");
        System.out.println("PELICULAS ORDEN ALFABETICO POR DIRECTOR");
        svp.pelisDirectorAlfabetico(listaPeliculas);











    }
}