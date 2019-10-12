package factory_method;

public class AnimalFactory {
  public static Animal create(String type) {
    if (type.equals("Cat")) {
      return new Cat();
    } else if (type.equals("Dog")) {
      return new Dog();
    } else if (type.equals("Lion")) { // deprecated
//      return new Lion();
      return new Horse();
    } else {
      return new Horse();
    }
  }
}
