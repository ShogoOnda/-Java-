public class Main{
  public static void main(String[] args){
    final double PI =3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    // テキストの通り、pieではなく、piに代入しています。上書きしてはいけない失敗例です。
    PI = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
  }
}