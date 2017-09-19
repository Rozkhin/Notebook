package MyNoteboo;

/**
 * Created by JavaCourses on 19.09.2017..
 */
public class Reminder extends Note{

String Time;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "Time='" + Time + '\'' +
                "Note='" + getNote()+
                '}';
    }
}
