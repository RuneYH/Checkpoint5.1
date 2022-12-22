public class Main {
    public static void main(String[] args) {
        Book sciFi = new Book();
        sciFi.setTitle("The Hitchhiker's Guide to the Galaxy");
        sciFi.setAuthor("Douglas Adams");
        sciFi.setPrice(500);
        sciFi.printBookDetails();

        Movie ghostBusters = new Movie();
        ghostBusters.setTitle("Ghostbusters");
        ghostBusters.setGenre(MovieGenre.COMEDY);
        ghostBusters.setPrice(300);
        ghostBusters.printMovieDetails();

    }
}