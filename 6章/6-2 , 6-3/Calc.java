public class Calc{
  public static void main(String[] args){
    //メソッドがクラス内に記載されておらず、エラーになる例
    int a = 10; int b = 2;
    int total = tasu(a, b);
    int delta = hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
