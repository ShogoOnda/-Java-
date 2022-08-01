public class Main{
  public static void main(String[] args){
    int x = 100;
    int y = 10;
    add();
  }
  //コンパイルエラーになる例
  public static void add(){
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}