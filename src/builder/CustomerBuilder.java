package builder;

public class CustomerBuilder {
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private String address = "";
  private int age = 0;

  public Customer build() {
    return new Customer(
        this.id,
        this.firstName,
        this.lastName,
        this.email,
        this.phone,
        this.address,
        this.age
    );
  }

  public CustomerBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public CustomerBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public CustomerBuilder setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public CustomerBuilder setEmail(String email) {
    this.email = email;
    return this;
  }

  public CustomerBuilder setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public CustomerBuilder setAddress(String address) {
    this.address = address;
    return this;
  }

  public CustomerBuilder setAge(int age) {
    this.age = age;
    return this;
  }
}
