public class Main{
  public static void main(String[] args){
    int[] array = {1, 2, 3};
    //nullによって配列の参照を切る
    array = null;
    array[0] = 10;
  }
}