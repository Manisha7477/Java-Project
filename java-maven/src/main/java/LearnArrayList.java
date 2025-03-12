
import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<String> student = new ArrayList<>();
        student.add("Manisha");
        student.add("Manisha2");
        student.add("Manisha3");
        student.add(2,"Manan");
        student.remove("mmmmm");
        ArrayList<String> student2 = new ArrayList<>();
        student2.add("m");
        student2.add("ll");
        student.addAll(student2);
        System.out.println(student);
    }
}
