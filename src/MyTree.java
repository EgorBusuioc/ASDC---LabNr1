public class MyTree {

    Node root;
    private Node addRecursive(Node current, Student student){
        if (current == null){
            return new Node(student);
        }
        if(student.getNumberInTable() < current.student.getNumberInTable()){
            current.left = addRecursive(current.left,student);
        } else if (student.getNumberInTable() < current.student.getNumberInTable()) {
            current.right = addRecursive(current.right,student);
        } else {
            return current;
        }
        return current;
    }
    public void add(Student competitor){
        root = addRecursive(root,competitor);
    }

    private boolean containsRecursive(Node current,Student student){
        if(current==null) return false;
        if(student.equals(current.student)) return true;
        return student.getNumberInTable() < current.student.getNumberInTable()
                ?containsRecursive(current.left,student)
                :containsRecursive(current.right,student);
    }
    public boolean contains(Student student){
        return containsRecursive(root,student);
    }
}
