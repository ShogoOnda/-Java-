public class Hero {
  int hp;
  String name;
  int money;
  public void setHero(String name) {
    if (name == null) {
      throw new IllegalArgumentException("名前がnullである。処理を中断。");
    }
    if (name.length() <= 1) {
      throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
    }
    if (name.length() >= 8) {
      throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
    }
    this.name = name;
  }
  public String toString() {
    return "名前：" + this.name + "/HP：" + this.hp;
  }
  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o instanceof Hero) {
      Hero h = (Hero)o;
      if (this.name.equals(h.name)) {
        return true;
      }
    }
    return false;
  }
}
  
