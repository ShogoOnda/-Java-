public class Main {
  public boolean isValidPlayerName(String name) {
    return name.matches("[A-Z][A-Z0-9]{7}");
  }
}