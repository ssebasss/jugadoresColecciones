package servicio;

import entidades.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ServicioPelicula {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");


//CREACION DE LA PELICULA

    public Pelicula crearPelicula() {
        Pelicula p1 = new Pelicula();
        System.out.println("titulo de la pelicula");
        System.out.println("");
        p1.setTitulo(sc.next());
        System.out.println("director de la pelicula");
        System.out.println("");
        p1.setDirector(sc.next());
        System.out.println("duracion de la pelicula??  ");
        System.out.println("");
        p1.setDuracion(sc.nextDouble());
        return p1;
    }


//CREACION DE LA LISTA DE PELICULA

    public ArrayList<Pelicula> listaPelis() {
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        do {
            System.out.println("vamos a ingresar nueva peli");
            System.out.println("");
            listaPeliculas.add(crearPelicula());
            System.out.println("queres ingresar otra???.. ");
        } while (sc.next().equalsIgnoreCase("si") ? true : false);
        if (listaPeliculas.isEmpty()) {
            System.out.println("no hay peliculas en al lista");
        }
        mostrarPelis(listaPeliculas);
        return listaPeliculas;
    }

    private void mostrarPelis(ArrayList<Pelicula> listaPelis) {
        for (Pelicula x : listaPelis
        ) {
            System.out.println(x.toString());
        }
    }


    //  películas con una duración mayor a 1 hora.

    public void pelisDuracion(ArrayList<Pelicula> listaPelis) {
        ArrayList<Pelicula> pelisTiempo = new ArrayList<>();
        for (Pelicula pelicula : listaPelis) {
            if (pelicula.getDuracion() > 1) {
                pelisTiempo.add(pelicula);
            }
            if (pelisTiempo.size() == 0) {
                System.out.println("todas las pelis duran menos de una hora");
            }
        }
        mostrarPelis(pelisTiempo);
    }

    //  películas orden ascendente.

    public void pelisrMenorMayor(ArrayList<Pelicula> listaPelis) {
        ArrayList<Pelicula> pelisOrdenAscendente = new ArrayList<>();

        Collections.sort(listaPelis, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return Double.compare(o1.getDuracion(), o2.getDuracion());
            }
        });
        mostrarPelis(listaPelis);
    }

    //  películas orden descendente.


    public void pelisDuracionDescendente(ArrayList<Pelicula> listaPelis){
        ArrayList<Pelicula> pelisOrdenDescendente = new ArrayList<>();
        Collections.sort(listaPelis, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return Double.compare(o2.getDuracion(), o1.getDuracion());
            }
        });
        mostrarPelis(listaPelis);
    }


    /*public void pelisTituloAlfabetico(ArrayList<Pelicula> listaPelis){
        ArrayList<Pelicula> pelisAlfabeticamente = new ArrayList<>();
        Collections.sort(listaPelis, Comparator.comparing(Pelicula::getTitulo));
        mostrarPelis(listaPelis);
    }*/



    public void pelisDirectorAlfabetico(ArrayList<Pelicula> listaPelis){
        ArrayList<Pelicula> pelisDirectorAlfabeticamente = new ArrayList<>();
        Collections.sort(listaPelis, Comparator.comparing(Pelicula::getDirector));

        mostrarPelis(listaPelis);
    }




}



