public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Kumar Yash", 101, "Java", 80, 88.5);
        Student s2 = new Student("Anjali", 102, "Python", 60, 72.3); 

        s1.displayStudentInfo();
        System.out.println(" ");
        s1.checkExamEligibility();

        s2.displayStudentInfo();
        System.out.println(" ");
        s2.checkExamEligibility();

        s2.setAttendance(78); 
        System.out.println("After updating Anjali's attendance:");
        System.out.println(" ");
        s2.checkExamEligibility(); 
    }
}
                                         