
package uniandes.cupi2.avion.mundo;

public class Pelicula {
    public static final String ACCION = "Accion";

    public static final String COMEDIA = "Comedia";

    public static final String DRAMA = "Drama";

    public static final String INFANTIL = "Infantil";

    public static final String ROMANCE = "Romance";
        
    public String nombre;
    public String genero;
    public int duracion;
    public String director;

    public Pelicula(String nombre, String genero, int duracion, String director) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
    }

    public String darNombre() {
        return nombre;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String darGenero() {
        return genero;
    }

    public void cambiarGenero(String genero) {
        this.genero = genero;
    }

    public int darDuracion() {
        return duracion;
    }

    public void cambiarDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String darDirector() {
        return director;
    }

    public void cambiarDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", director=" + director + '}';
    }

}
