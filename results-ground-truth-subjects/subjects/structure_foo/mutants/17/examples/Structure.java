package examples;

public class Structure {

  private int var62;

  public Structure() {
    clear();
  }

  public Structure(int x) {
    var62 = ((x) + 1);
  }

  public void clear() {
    ;
  }

  public int foo() {
    int result = var62;
    assert(true);
    return result;
  }

  public void setX(int y) {
    var62 = ((y) + 1);
  }
}