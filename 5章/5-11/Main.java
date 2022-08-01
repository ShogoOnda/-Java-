public class Main{
  // 一つ目のメソッド
  public static int add(int x, int y){
    return x + y;
  }
  // 二つ目のメソッド
  public static int add(int x, int y, int z){
    return x + y + z;
  }
  public static void main(String[] args){
    System.out.println("10 + 20 = " + add(10, 20));
    System.out.println("10 + 20 + 30 = " + add(10, 20, 30));
  }
}