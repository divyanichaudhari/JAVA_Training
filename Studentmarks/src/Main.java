
public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        studentList.addStudent("Alice", 85.5);
        studentList.addStudent("Bob", 90.0);
        studentList.addStudent("Charlie", 78.0);
        studentList.addStudent("Alice", 92.5); 
        System.out.println("Student List:");
        studentList.displayStudents();

        String searchName = "Alice";
        String searchName1 = "Alice";

        Double percentage = studentList.getPercentageByName(searchName);
        if (percentage != null) {
            System.out.println(searchName + "'s Percentage: " + percentage);
        } else {
            System.out.println(searchName + " not found.");
        }
        
        
    }
}
