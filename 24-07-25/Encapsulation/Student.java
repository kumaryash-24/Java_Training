// StudentManagement Example  Using Encapsulation...


public class Student {
    
    private String name;
    private final int  rollNumber;      
    private String course;
    private int attendance; 
    private double marks;

    
    public Student(String name, int rollNumber, String course, int attendance, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.attendance = attendance;
        this.marks = marks;
    }

    
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    public int getAttendance() {
        return attendance;
    }

    public double getMarks() {
        return marks;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Marks: " + marks);
        
    }

    public void checkExamEligibility() {
        if (attendance >= 75) {
            System.out.println(name + " is eligible for the exam");
        } else {
            System.out.println(name + " is NOT eligible for the exam ");
        }
        System.out.println();
    }
}