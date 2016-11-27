public class Album{
  public enum Genre{
    POP("Pop"),
    ROCK("Rock"),
    CLASSICAL("Classical"),
    OTHER("Other");
    private String genre;
    Genre(String genre){this.genre=genre;}
    public String toString(){return genre;}
  }
  private Genre genre;
  private String title;
  private String artist;
  public Album(String title, String artist, Genre genre){
    this.title = title;
    this.artist= artist;
    this.genre = genre;
  }
  public String artist(){return artist;}
  public String title(){return title;}
  public String genre(){return genre.toString();}
  public String toString(){
    return new StringBuilder(title)
      .append(" by ")
      .append(artist)
      .append(" (").append(genre.toString()).append(")")
      .toString();
  }
}
