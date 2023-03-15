import java.util.ArrayList;

public class Algorithm {

    public static int linearSearch(ArrayList<Student> listOfStudents, Student studentToBeFound){
        int index = 0;
        long before = System.nanoTime();
        for (Student student : listOfStudents) {
            if (student.equals(studentToBeFound)) {
                final long after = System.nanoTime();
                System.out.println("Searching time = " + (after - before));
                return index;
            } else index++;
        }
        long after = System.nanoTime();
        System.out.println("Searching time = " + (after - before));
        return 0;
    }
}
