import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorSample {
    public static void main(String[] args) {
        List<String> subject = new ArrayList<>();

        subject.add("Java");
        subject.add("DBMS");
        subject.add("OS");
        subject.add("CN");
        subject.add("Backend");

        Iterator<String> it = subject.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // for (String s : subject) {
        // String val =
        // if (s.equals("Java")) {
        // subject.remove(s); // ❌ ConcurrentModificationException
        // }
        // }

        Iterator<String> iterator = subject.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("Java")) {
                iterator.remove(); // ✅ safe removal
            }
        }

       
        //HashSet

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Rust");

        Iterator<String> iterator2 = set.iterator();
        while(iterator2.hasNext()){
            String value = iterator2.next();
            System.out.println(value);
        }

    }
}
