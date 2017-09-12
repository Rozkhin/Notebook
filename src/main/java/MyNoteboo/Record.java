package MyNoteboo;

/**
 * Created by JavaCourses on 12.09.2017..
 */
public class Record {
    private static int counter = 0;
    private int id;
    private String name;
    private String lastName;
    private String phone;



    //construktor
    public Record() {
        counter ++;
        id = counter;
    }


    //geter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

//setter
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //formatirovanie stroki vivoda
    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}