import java.util.HashSet;

public class set {

    public static void main(String[] args) {
    int arr[]={1, 3, 4, 5, 6, 12, 13, 17, 19, 22, 23, 25, 27, 28, 28, 35, 36, 37, 39, 43, 46, 48, 54, 59, 62, 63, 65, 68, 68, 70, 70, 72, 79, 82, 83, 92, 92, 93, 95, 96, 96, 100};
      HashSet < Integer > set = new HashSet < > ();
      for (int e : arr) {
        set.add(e);
      }
      int k= set.size();
        int j=0;
      for (int s : set) {
        arr[j++]=s;
        
      }
    System.out.println(j);
    for (Integer r : arr) {
        System.out.println(r);
    }
    }
}