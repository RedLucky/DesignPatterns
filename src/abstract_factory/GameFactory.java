package abstract_factory;

public interface GameFactory {
  Level createLevel();

  Arena createArena();

  Enemy createEnemy();

  class GameFactoryEasy implements GameFactory {

    @Override
    public Level createLevel() {
      return new Level.LevelEasy();
    }

    @Override
    public Arena createArena() {
      return new Arena.ArenaEasy();
    }

    @Override
    public Enemy createEnemy() {
      return new Enemy.EnemyEasy();
    }
  }

  class GameFactoryMedium implements GameFactory {

    @Override
    public Level createLevel() {
      return new Level.LevelMedium();
    }

    @Override
    public Arena createArena() {
      return new Arena.ArenaMedium();
    }

    @Override
    public Enemy createEnemy() {
      return new Enemy.EnemyMedium();
    }
  }

  class GameFactoryHard implements GameFactory {

    @Override
    public Level createLevel() {
      return new Level.LevelHard();
    }

    @Override
    public Arena createArena() {
      return new Arena.ArenaHard();
    }

    @Override
    public Enemy createEnemy() {
      return new Enemy.EnemyHard();
    }
  }
}
