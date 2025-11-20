package Unit3ClassNotes;

public class AlbumRunner {
    public static void main(String[] args) {
        Album album1 = new Album("Get Rich", 2005);
        Album album2 = new Album("Chocolate Factory", 2024);
        System.out.println("Total Albums: " + Album.getNumAlbums());
    }
}
