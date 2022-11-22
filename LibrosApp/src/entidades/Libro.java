package entidades;

/**
 * @author ale05
 * @version 1.0
 * @created 18-Nov-2022 9:44:31 PM
 */
public class Libro {

    private String isbn;
    private String title;
    private int editionNumber;
    private String copyright;
    public Autor m_Autor;

    public Libro() {

    }

    public Libro(String isbn, String title, int editionNumber, String copyright, Autor m_Autor) {
        this.isbn = isbn;
        this.title = title;
        this.editionNumber = editionNumber;
        this.copyright = copyright;
        this.m_Autor = m_Autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Autor getM_Autor() {
        return m_Autor;
    }

    public void setM_Autor(Autor m_Autor) {
        this.m_Autor = m_Autor;
    }
    

    public void finalize() throws Throwable {

    }
}//end Libro
