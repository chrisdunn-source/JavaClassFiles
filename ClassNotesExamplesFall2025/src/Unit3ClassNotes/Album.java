package Unit3ClassNotes;

public class Album {// Class
    //Class variables
    private static int numAlbums = 0;
    //instance variables
    private String title;
    private int year;

    //constructor
    public Album(String title, int year)
    {
        this.title = title;
        this.year = year;
        numAlbums++;
    }
    //access methods
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    //setter methods
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //class methods
    public static int getNumAlbums()
    {
        return numAlbums;
    }

}
