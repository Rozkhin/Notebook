package MyNoteboo;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JavaCourses on 12.09.2017..
 */
public class NoteBook {
    private List<Record> records = new ArrayList<>();
@Command
    public void create(String name,String lastName,String phone) {
        Record r = new Record();
        r.setName(name);
        r.setLastName(lastName);
        r.setPhone(phone);
        records.add(r);

    }
@Command
    public List<Record> list(){
    return records;
}

}
