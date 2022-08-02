public class Main{
  public static void email() {
    String title = "メールのタイトル";
    String address = "メールの宛先アドレス";
    String text = "メールの本文";
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void main(String[] args) {
    email();
  }
}