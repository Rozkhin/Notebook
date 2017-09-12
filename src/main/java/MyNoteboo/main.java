package MyNoteboo;

import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by JavaCourses on 12.09.2017..
 */
public class main {
    public static void main(String[] args) throws IOException{
           NoteBook commands = new NoteBook();
        Shell shell = ShellFactory.createConsoleShell("cmd","notebook",commands);
        shell.commandLoop();
    }
}
