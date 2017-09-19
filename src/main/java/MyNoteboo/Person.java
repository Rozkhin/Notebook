package MyNoteboo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by JavaCourses on 19.09.2017..
 */
public class Person extends Record{

    private String name;
    private String lastName;
    private List<String> phones = new ArrayList<>();
    private String Email;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getPhones() {
        return phones;
    }



    public String getEmail() {
        return Email;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addPhones(String... phones){
        Collections.addAll(this.phones,phones);
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    //formatirovanie stroki vivoda
    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phones='" + phones + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
