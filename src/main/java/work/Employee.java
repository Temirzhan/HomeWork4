package work;

public class Employee {
    private String name;
    private String firstName;
    private String post;
    private String email;
    private String telephoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String firstName, String post, String email, String telephoneNumber, int salary, int age) {
        this.name = name;
        this.firstName = firstName;
        this.post = post;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showEmployee(){
        System.out.printf("Name: %s\n",name );
        System.out.printf("First Name: %s\n",firstName );
        System.out.printf("Post: %s\n",post );
        System.out.printf("age: %d\n",age );
        System.out.printf("telephone number: 5s\n",telephoneNumber );
        System.out.printf("Salary: %d\n",salary );
        System.out.printf("email: %s\n",email );
        System.out.println("-----------------------------");

    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
