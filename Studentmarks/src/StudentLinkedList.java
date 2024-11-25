class StudentLinkedList {
    private Student head;

    public StudentLinkedList() {
        this.head = null;
    }

    public void addStudent(String name, double percentage) {
        Student newStudent = new Student(name, percentage);
        if (head == null) {
            head = newStudent;
        } else {
            Student current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newStudent;
        }
    }

    public Double getPercentageByName(String name) {
        Student current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current.percentage;
            }
            current = current.next;
        }
        return null; 
    }

    public void displayStudents() {
        Student current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Percentage: " + current.percentage);
            current = current.next;
        }
    }
}
