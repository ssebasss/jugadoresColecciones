package utility;

import entidades.Pelicula;

import java.util.Comparator;

public class Comparatos {

    public static Comparator<Pelicula> ordenTitulo= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
        }
    };


}
