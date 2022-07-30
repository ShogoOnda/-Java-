public class Main {
  public static void main(String[] args){
    int isHungry = 1;
    String food = "ハム";
    System.out.println("こんにちは");
    if (isHungry == 0){
      System.out.println("お腹がいっぱいです");
    }else{
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
      System.out.println("ごちそうさまでした");
    }
  }
}