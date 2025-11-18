package Unit3ClassNotes;

public class PersonRunner {
    public static void main(String[] args) {
        Job job1 = new Job("Teacher", "Bell High School");
        Person person1 = new Person("Coach Dunn", job1);
        System.out.println(person1.getJob().getTitle());

        

    }
}
