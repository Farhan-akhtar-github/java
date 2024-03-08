public class e {
  public static void main(String[] args) {
    int[] hash = new int[10];
        for (int i = 0; i < 10; i++) {
            hash[i]++;
        }
        for (int j : hash) {
           System.out.println(hash[j]); 
        }
        
  }
}
