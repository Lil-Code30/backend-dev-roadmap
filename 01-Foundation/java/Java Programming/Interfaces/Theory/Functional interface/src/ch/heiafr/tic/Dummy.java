package ch.heiafr.tic;

public class Dummy implements DummyInterface {
  private String append;

  public Dummy(String string) {
    this.append = string;
  }
  @Override
  public String dummyMethod(String string) {
    return string + this.append;
  }
}
