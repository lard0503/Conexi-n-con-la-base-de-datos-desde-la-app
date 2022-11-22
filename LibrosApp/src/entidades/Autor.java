package entidades;

/**
 * @author ale05
 * @version 1.0
 * @created 18-Nov-2022 9:44:33 PM
 */
public class Autor {

    private int authorID;
    private String firstName;
    private String lastName;

    public Autor() {

    }

    public Autor(int authorID, String firstName, String lastName) {
        this.authorID = authorID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    

    public void finalize() throws Throwable {

    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
}//end Autor
