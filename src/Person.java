public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person() {
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void greet(){
        System.out.println("Hello, my name is " + this.firstName);
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;


    }
}
