package project6.Banka;
public class Customer {

    // FIELDS
    // TODO Filedslari olusuturun
    /*
    TÜM FIELD LAR PRIVATE OLMALIDIR. FINAL OLMAYACAK.
     customerId Integer,
     firstName, lastName, city String OLACAK
     */

    private int customerId;
    private String firstName;
    private String lastName;
    private String city;


    ///////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORS
    // TODO BOŞ CONSTRUCTOR OLUŞTURUN
    // PARAMTRELERİ int customerId, String firstName, String lastName, String city OLAN CONSTRUCTOR OLUŞTURUN

    public Customer() {
    }

    public Customer(int customerId, String firstName, String lastName, String city) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    ////////////////////////////////////////////////////////////////////////////////////

    // GETTER SETTER METHODS
    // TODO  GETTER VE SETTER METODLARI OLUŞTURUN

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    ////////////////////////////////////////////////////////////////////////////////

    //  TODO TO STRING METODU OLUŞTURUN

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    /////////////////////////////////////////////////////////////////////////////////
}
