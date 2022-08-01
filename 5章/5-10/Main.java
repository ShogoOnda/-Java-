public class Main{
  // 一つ目のメソッド
  public static int add(int x, int y){
    return x + y;
  }
  // 二つ目のメソッド
  public static double add(double x, double y){
    return x + y;
  }
  // 三つ目のメソッド
  public static String add(String x, String y){
    return x + y;
  }
  public static void main(String[] args){
    System.out.println(add(10, 20));
    System.out.println(add(3.5, 2.7));
    System.out.println(add("Hello","World"));
  }
}