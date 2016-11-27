import java.util.Comparator;
public class IgnoreTheComparator implements Comparator<String>{

  @Override
  public int compare(String a, String b){
    String first=a;
    String second=b;
    if(a.startsWith("The")){
      first=a.substring(4);
    }
    if(b.startsWith("The")){
      second=b.substring(4);
    }
    return first.compareTo(second);
  }
}

