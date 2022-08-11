public class SuperHero extends Hero {
  boolean flying;
  //飛ぶ
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  //着地する
  public void land() {
    this.flying = false;
    System.out.println("着地した");
  }
  //runを再定義する（オーバーライド）
  public void run() {
    System.out.println(this.name + "は撤退した");
  }
}