package calcapp.main;
import calcapp.logics.CalcLogic;

public class Calc{
  public static void main(String[] args){
    int a = 10; int b = 2;
    //import文を追記して省略したが、後の学習後にコンパイル必要あり
    int total = CalcLogic.tasu(a, b);
    int delta = calcapp.logics.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}
