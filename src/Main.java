import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro>libros = new ArrayList<>();

     libros.add(new Libro("Cien años de soledad", "Gabriel García", 458));
     libros.add (new Libro("El principito", "Antoine de Saint-Exupéry", 176));
     libros.add(new Libro("Harry Potter and the Chamber of Secrets", "J.K. Rowling",267));


     for (Libro libro : libros) {
         System.out.println("el título del libro es " + libro.getTitulo());
         System.out.println();
         System.out.println("el autor del libro es " + libro.getAutor());
         System.out.println();
         System.out.println("las páginas del libro son: " + libro.getPaginas());
         System.out.println();
     }
    }
}