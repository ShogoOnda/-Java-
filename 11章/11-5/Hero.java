public class Hero extends Character {
  public void atack(Matango m) { //あえてatackと記述。オーバーライド失敗の例。
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に10ポイントのダメージをあたえた！");
    m.hp -= 10;
  }
}