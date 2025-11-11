package Unit3ClassNotes;

public class Job {
    private String title;
    private String company;
    //private int salary;
    //private String location;

    public Job(String newTitle, String newCompany)
    {
        title = newTitle;
        company = newCompany;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }
}
