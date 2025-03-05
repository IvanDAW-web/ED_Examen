import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro1, libro2, libro3;
    Biblioteca biblioteca;
    @BeforeEach
    void setUp() {
        libro1 = new Libro("El señor de los anillos", "Tolkien", 1975);
        libro2 = new Libro("La metamorfosis", "Kafka", 1962);
        libro3 = new Libro("El Hobbit", "Tolkien", 1954);

        biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
    }

    @Test
    void agregarLibro() {
        boolean resultado = biblioteca.agregarLibro(libro1);
        assertTrue(resultado, "Libro no agregado");
    }

    @Test
    void eliminarLibro() {
        boolean resultado = biblioteca.eliminarLibro(libro1);
        assertTrue(resultado, "Libro no eliminado");
    }

    @Test
    void encuentraLibrosPorAutor() {
        List<Libro> resultado = biblioteca.encuentraLibrosPorAutor("Tolkien");
        assertTrue(resultado.size()>0, "No hay libros de este autor");
    }
    @Test
    void encuentraLibrosPorAutorNoExiste() {
        List<Libro> resultado = biblioteca.encuentraLibrosPorAutor("Herber");
        assertTrue(resultado ==null, "Hay libros de este autor");
    }
}