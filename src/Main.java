import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        File file = new File(".\\src\\MOCK_DATA.csv");
        ArrayList<Student> studentList = Student.input(file);

/*        TreeSet<Student> treeSet = new TreeSet<>(studentList);
        for(Student student : treeSet){
            System.out.println(student);
        }*/

        Student studentToBeFoundStart;
        studentToBeFoundStart = Student.createStudentFromString("76354109,Michail,Grint,Sales,1981,2021");
        Student studentToBeFoundMiddle;
        studentToBeFoundMiddle = Student.createStudentFromString("59148018,Rosmunda,Nana,Product Management,2005,2003");
        Student studentToBeFoundEnd;
        studentToBeFoundEnd = Student.createStudentFromString("55910952,Earlie,Armor,Accounting,1980,2009");
        int positionOfElement;


       MyTree tree = new MyTree();
        for (Student student : studentList){
            tree.add(student);
        }

        System.out.println("Tree ----> ");

        long before = System.nanoTime();
        System.out.println("Contains first element==> " + tree.contains(studentToBeFoundStart));
        long after =System.nanoTime();
        System.out.println("Time of search => " + (after-before));

        System.out.println("Linear search ----> ");

        System.out.println();
        positionOfElement = Algorithm.linearSearch(studentList, studentToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.linearSearch(studentList, studentToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.linearSearch(studentList, studentToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();


        Collections.sort(studentList);
        System.out.println("Binary search ----> ");

        System.out.println();
        positionOfElement = Algorithm.binarySearch(studentList, studentToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.binarySearch(studentList, studentToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.binarySearch(studentList, studentToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();


        System.out.println("Interpolation search ----> ");

        System.out.println();
        positionOfElement = Algorithm.interpolationSearch(studentList, studentToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.interpolationSearch(studentList, studentToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.interpolationSearch(studentList, studentToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();


        System.out.println("Fibonacci search ----> ");

        System.out.println();
        positionOfElement = Algorithm.fibonacciSearch(studentList, studentToBeFoundStart);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.fibonacciSearch(studentList, studentToBeFoundMiddle);
        System.out.println("Position of the element in the middle of the list = " + positionOfElement);
        System.out.println();

        System.out.println();
        positionOfElement = Algorithm.fibonacciSearch(studentList, studentToBeFoundEnd);
        System.out.println("Position of the element in the start of the list = " + positionOfElement);
        System.out.println();
    }
}