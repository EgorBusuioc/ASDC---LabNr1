import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        File file = new File(".\\src\\MOCK_DATA.csv");
        ArrayList<Student> studentList = Student.input(file);

        Student studentToBeFoundStart;
        studentToBeFoundStart = Student.createStudentFromString("76354109,Michail,Grint,Sales,1981,2021");
        Student studentToBeFoundMiddle;
        studentToBeFoundMiddle = Student.createStudentFromString("59148018,Rosmunda,Nana,Product Management,2005,2003");
        Student studentToBeFoundEnd;
        studentToBeFoundEnd = Student.createStudentFromString("55910952,Earlie,Armor,Accounting,1980,2009");
        int positionOfElement;


        System.out.println("Linear search ----> ");
        System.out.println("");
        positionOfElement = Algorithm.linearSearch(studentList, studentToBeFoundStart);
        System.out.println("Position of the element = " + positionOfElement);
        System.out.println("");
    }
}