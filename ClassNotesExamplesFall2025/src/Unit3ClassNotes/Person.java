package Unit3ClassNotes;

public class Person {//class
    private String name;//instance variables

    private int age;
    private int height;
    private Job job;

    public Person(String newName, Job newJob)//constructor
    {
        name = newName;
        job = new Job(newJob.getTitle(), newJob.getCompany());
    }
    public String getName() {//access method
        return name;
    }
    public int getAge() {//access method
        return age;
    }

    public int getHeight() {//access method
        return height;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
