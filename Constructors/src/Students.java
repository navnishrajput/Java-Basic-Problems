class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println("----------------------------");
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPGInfo() {
        System.out.println("Postgraduate Student:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Research: " + researchTopic);
        System.out.println("----------------------------");
    }

    public void updateName(String newName) {
        name = newName;
    }



    public static void main(String[] args) {
        Student student1 = new Student(101, "John Doe", 8.5);
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Jane Smith", 9.2, "AI Research");

        System.out.println("=== Student Info ===");
        student1.displayInfo();

        System.out.println("=== PG Student Info ===");
        pgStudent.displayPGInfo();

        System.out.println("=== Modifying CGPA ===");
        System.out.println("Current CGPA: " + pgStudent.getCGPA());
        pgStudent.setCGPA(9.5);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());

        System.out.println("=== Protected Access Demo ===");
        System.out.println("Original Name: " + pgStudent.name);
        pgStudent.updateName("Jane Johnson");
        System.out.println("Updated Name: " + pgStudent.name);

        System.out.println("=== Final PG Info ===");
        pgStudent.displayPGInfo();
    }
}