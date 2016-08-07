package ua.edu.dataBase.data;



import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Oxana Nastasyuk
 * Date: 4/14/12
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class Person extends Audit{
    public String firstName;
    public String lastName;
    public Date birthDate;
    public String access;

    public String login;
    public String password;

    public Person(String firstName, String lastName, Date birthDate) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;


    }

    public Person(String firstName, String lastName, Date birthDate, String role) {

        this(firstName,lastName, birthDate);
        this.access = role;
    }

    public Person(String firstName, String lastName, Date birthDate, String role, String login, String password) {
        this(firstName,lastName, birthDate,role);
        register(login,password);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", access='" + access + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", created='"+created + '\'' +
                ", changed='"+changed + '\''+
                '}';
    }

    /*setLogin$password*/
    public void register(String login, String password){
       this.setLogin(login);
       this.setPassword(password);
    }
    /*getters&setters */
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person that = (Person) o;

        if (access != null ? !access.equals(that.access) : that.access != null) return false;
        if (!birthDate.equals(that.birthDate)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + birthDate.hashCode();
        result = 31 * result + (access != null ? access.hashCode() : 0);
        return result;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
