package abstract_factory;

public class Game {
  private Level level;
  private Arena arena;
  private Enemy enemy;

  public Game(GameFactory gameFactory) {
    this.level = gameFactory.createLevel();
    this.arena = gameFactory.createArena();
    this.enemy = gameFactory.createEnemy();
  }

  public void start() {
    this.level.start();
    this.arena.start();
    this.enemy.start();
  }
}
