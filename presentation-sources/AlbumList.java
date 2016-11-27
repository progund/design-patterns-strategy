public class AlbumList{
  public static void main(String[] args){
    String[] albums = {"Yes","The 5,6,7,8s", "ABBA", "The Beatles","Neil Young","The The","Wasp","The Who","The Them", "Beatless"};
    java.util.Arrays.sort(albums);
    System.out.println("My sorted albums: " + java.util.Arrays.toString(albums));

    java.util.Arrays.sort(albums, new IgnoreTheComparator());
    System.out.println("My sorted albums: " + java.util.Arrays.toString(albums));
    
    int index = java.util.Arrays.binarySearch(albums, "The Who");
    if(index<0){
      System.out.println("Couldn't find them");
    }else{
      System.out.println("They were at index: " +index);
    }
    index = java.util.Arrays.binarySearch(albums, "The Who", new IgnoreTheComparator());
    if(index<0){
      System.out.println("Couldn't find them");
    }else{
      System.out.println("Now it worked! They were at index: " +index);
    }
    /*
    java.util.Arrays.sort(albums, new java.util.Comparator<String>(){
        @Override
          public int compare(String a, String b){
          //String first=a;
          //String second=b;
          if(a.startsWith("The")){
            a=a.substring(4);
          }
          if(b.startsWith("The")){
            b=b.substring(4);
          }
          //return first.compareTo(second);
          return a.compareTo(b);
        }
      });
    System.out.println("Better?: " + java.util.Arrays.toString(albums));
    */
  }
}
