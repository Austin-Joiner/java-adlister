import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album albumOne = new Album(1, "Michael Jackson", "Thriller", 1982, 51.2, "pop");
        Album albumTwo = new Album(2, "AC/DC", "Back in Black", 1980, 30.1, "Hard Rock");
        Album albumThree = new Album(3,"Whitney Houston", "The Bodyguard", 1992, 28.7,"pop");
        Album albumFour = new Album(4,"Pink Floyd", "The Dark Side of The Moon", 1973, 24.8,"progressive rock");
        Album albumFive = new Album(5,"Eagles", "Their Greatest Hits(1971-1975)", 1976, 41.2,"Country");
        Album albumSix = new Album(6,"Meat Loaf", "Bat Out of Hell", 1977, 22,"Hard Rock");
        ArrayList<Album> albumList = new ArrayList<>();
        albumList.add(albumOne);
        albumList.add(albumTwo);
        albumList.add(albumThree);
        albumList.add(albumFour);
        albumList.add(albumFive);
        albumList.add(albumSix);
        for ( Album album : albumList){
            System.out.println(album.toString());
        }
        System.out.println();

        Author authorOne = new Author(1,"Mark", "Twain");
        Author authorTwo = new Author(2, "Douglas", "Adams");
        Author authorThree= new Author(3, "Kurt", "Vonnegut");
        ArrayList<Author> authorList = new ArrayList<>();
        authorList.add(authorOne);
        authorList.add(authorTwo);
        authorList.add(authorThree);
        for (Author author : authorList){
            System.out.println(author.toString());
        }
        System.out.println();

        Quotes quoteOne = new Quotes(1, authorOne,"Clothes make the man. Naked people have little or no influence on society.");
        Quotes quoteTwo = new Quotes(2, authorTwo,"I love deadlines. I love the whooshing noise they make as they go by.");
        Quotes quoteThree = new Quotes(3, authorThree,"The universe is a big place, perhaps the biggest.");
        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(quoteOne);
        quotes.add(quoteTwo);
        quotes.add(quoteThree);
        for (Quotes quote : quotes){
            System.out.println(quote.toString());
        }
    }
}
