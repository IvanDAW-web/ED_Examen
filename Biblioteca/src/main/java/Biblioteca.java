
import java.util.ArrayList;
import java.util.List;

/**
 * Simula una biblioteca
 * @version 5.3.25
 * @see Libro
 * @author Iván de la Osa Navarro
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Este atributo crea una lista de libros en la Biblioteca.
     */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**
     * Crea un constructor por defecto.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    /**
     * Es el contructor con parámetros
     * @param libros
     */
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.

    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método
    /**
     * Es el getter que te da la lista de libros
     * @return La lista de libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.

    /**
     * Busca libros por título y devuelve el libro por título
     * @param titulo
     * @return el libro
     */
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    /**
     * Este metodo encuentra libros por autor
     * @deprecated - Es un metodo obsoleto
     * Si se quiere buscar por autor usar {@link #encuentraLibrosPorAutor(String)}
     * @param autor
     * @return  Libros por autor
     */
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    // Recuerda: las anotaciones @deprecated y @link a la nueva
    // versión mejorada encuentraLibrosPorAutor(...)
    // En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo

    /**
     * Este metodo encuentra libros por autor
     * @since v2.0
     * @param autor
     * @return Libros por autor
     */
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
