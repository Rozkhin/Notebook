package MyNoteboo;

import asg.cliche .Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JavaCourses on 12.09.2017..
 */
public class NoteBook {
    private List<Record> records = new ArrayList<>();

    @Command
    public void CreatePerson(String name, String lastName, String Email, String... phones) {
        Person r = new Person();
        r.setName(name);
        r.setLastName(lastName);
        r.addPhones(phones);
        r.setEmail(Email);
        records.add(r);

    }

    @Command
    public void remove(int id) {
        for (int i = 0; i < records.size(); i++) {
            Record r = records.get(i);
            if (r.getId() == id) {
                records.remove(i);
                break;
            }
        }
    }

    @Command
    public List<Record> list() {
        return records;
    }

    @Command
    public void CreateNote(String note) {
        Note r = new Note();
        r.setNote(note);
        records.add(r);
    }

    @Command
    public void CreateReminder(String note, String time) {
        Reminder r = new Reminder();
        r.setTime(time);
        r.setNote(note);
        records.add(r);


    }
}