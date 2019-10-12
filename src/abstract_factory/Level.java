package abstract_factory;

public interface Level {
  void start();

  class LevelEasy implements Level {

    @Override
    public void start() {
      System.out.println("Level Easy");
    }
  }

  class LevelMedium implements Level {

    @Override
    public void start() {
      System.out.println("Level Medium");
    }
  }

  class LevelHard implements Level {

    @Override
    public void start() {
      System.out.println("Level Hard");
    }
  }
}
