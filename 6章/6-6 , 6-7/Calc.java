package calcapp.main;
public class Calc{
  public static void main(String[] args){
    int a = 10; int b = 2;
    //calcapp.logics.を追記したが、後の学習後にコンパイル必要あり
    int total = calcapp.logics.CalcLogic.tasu(a, b);
    int delta = calcapp.logics.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
