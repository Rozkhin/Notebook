package MyNoteboo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by JavaCourses on 12.09.2017..
 */
public abstract class Record {
    private static int counter = 0;
    private int id;



    //construktor
    public Record() {
        counter++;
        id = counter;
    }


    //geter
    public int getId() {
        return id;
    }

}