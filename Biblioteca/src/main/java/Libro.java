
public class Libro {

    /**
     * Simula un libro
     * @version 5.3.25
     * @autor Iván de la Osa Navarro
     */

    // TODO: Documentar estos atributos
    /**
     * Estos tres atributos nos indican: el título, el autor y el año de publicación
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    /**
     * Es un constructor con los atributos del libro
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Es un getter que nos da el nombre del autor
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Es un getter que nos da el año de Publicación
     * @return Año de Publicación
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
