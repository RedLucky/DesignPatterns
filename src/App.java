import abstract_factory.Game;
import abstract_factory.GameFactory;
import builder.Customer;
import builder.CustomerBuilder;
import factory_method.Animal;
import factory_method.AnimalFactory;
import factory_method.Employee;
import factory_method.EmployeeFactory;

public class App {
  public static void main(String[] args) {
    System.out.println("----Design Patterns With Builder-----");
    CustomerBuilder customerBuilder = new CustomerBuilder();
    Customer customer = customerBuilder
        .setId("1")
        .setFirstName("Lucky")
        .setLastName("Fernanda")
        .setEmail("lucky@gmail.com")
        .setPhone("081").build();
    System.out.println(customer.getAddress());
    System.out.println(customer.getEmail());

    System.out.println("----Design Patterns With Factory Method-----");
    Employee employeeStaff = EmployeeFactory.createStaff("Staff");
    Employee employeeManager = EmployeeFactory.createManager("Manager");
    Animal lion = AnimalFactory.create("Lion"); // kondisi class Lion deprecated, jadi dirubah ke class horse
    Animal cat = AnimalFactory.create("Cat");
    Animal dog = AnimalFactory.create("Dog");
    Animal horse = AnimalFactory.create("Horse");
    System.out.println(employeeStaff.getName() + " - " + employeeStaff.getTitle());
    System.out.println(employeeManager.getName() + " - " + employeeManager.getTitle());
    lion.shoud();
    cat.shoud();
    dog.shoud();
    horse.shoud();

    System.out.println("----Design Patterns With Abstract Method-----");
    Game gameEasy = new Game(new GameFactory.GameFactoryEasy());
    Game gameMedium = new Game(new GameFactory.GameFactoryMedium());
    Game gameHard = new Game(new GameFactory.GameFactoryHard());
    gameEasy.start();
    gameMedium.start();
    gameHard.start();
  }
}
