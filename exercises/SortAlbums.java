import java.util.function.Predicate;
import java.util.Arrays;
public class SortAlbums {
  public static void main(String[] args) {
    Album[] albums = fetchAlbums();
    System.out.println("Pop albums:");
    printSomeAlbums(albums, a -> a.genre().equals(Album.Genre.POP.toString()));
    System.out.println("Non-Pop albums:");
    printSomeAlbums(albums, a -> !a.genre().equals(Album.Genre.POP.toString()));
  }
  private static Album[] fetchAlbums() {
    Album[] albums = {
      new Album("Hotel California", "Eagles", Album.Genre.ROCK),
      new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
      new Album("Arrival", "ABBA", Album.Genre.POP),
      new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
      new Album("White album", "Beatles", Album.Genre.POP),
      new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
      new Album("Thank you for the music", "ABBA", Album.Genre.POP)
    };
    return albums;
  }

  private static void printSomeAlbums(Album[] albums, Predicate<Album> filter) {
    Arrays.asList(albums).stream().filter(filter).forEach(System.out::println);
  }
}
