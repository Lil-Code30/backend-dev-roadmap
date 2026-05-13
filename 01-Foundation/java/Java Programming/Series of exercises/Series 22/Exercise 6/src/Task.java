import java.io.PrintStream;
import java.io.StringWriter;
import java.util.function.IntConsumer;

public class Task {
    static void writeItSeveralTimes(int howMany, int v, Object o) {
        while (howMany-- > 0) {
            if (o instanceof PrintStream) {
                ((PrintStream) o).write(v);
            }
            else if (o instanceof StringWriter) {
                ((StringWriter) o).write(v);
            }
        }
    }

    static void callItSeveralTimes(int howMany, int v, /* Complete the implementation of the method */
    }

    public static void main(String[] args) {
        PrintStream ps = System.out;
        StringWriter pw = new StringWriter();
        writeItSeveralTimes(10, 65, ps);
        writeItSeveralTimes(10, 65, pw);
        System.out.println();
        System.out.println(pw);

        pw = new StringWriter();
        /* Modify the call to callItSeveralTimes() */
        System.out.println();
        System.out.println(pw);
    }
}