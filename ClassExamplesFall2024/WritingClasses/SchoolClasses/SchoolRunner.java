package SchoolClasses;

public class SchoolRunner {
    public static void main(String[] args) {
        School school1 = new School();
        School school2 = new School("LD Bell High School", 3, 3200);

        System.out.println("Information for School1: ");
        System.out.println("Name of School1: " + school1.getName());
        System.out.println("Number of Grades in School1: " + school1.getGradeLevels());
        System.out.println("Number of Students in School1: " + school1.getStudentCount());
        System.out.println("Total number of schools currently: " + School.getTotalSchools());

        System.out.println();

        System.out.println();
        System.out.println("Information for School2: ");
        System.out.println("Name of School2: " + school2.getName());
        System.out.println("Number of Grades in School2: " + school2.getGradeLevels());
        System.out.println("Number of Students in School2: " + school2.getStudentCount());
        System.out.println("Total number of schools currently: " + School.getTotalSchools());

        System.out.println();
        System.out.println("Add Freshmen class of 900 to School2:");
        school2.addStudents(900);
        System.out.println("Number of Students in School2: " + school2.getStudentCount());
        System.out.println("Subtract senior class of 286 from School2:");
        school2.removeStudents(286);
        System.out.println("Number of Students in School2: " + school2.getStudentCount());

        System.out.println();
        System.out.println("Display School info using displaySchoolInfo;");
        school1.displaySchoolInfo();
        school2.displaySchoolInfo();

        System.out.println();
        System.out.println("Display School info using toString: ");
        System.out.println(school1.toString());
        System.out.println(school2.toString());
    }

}
