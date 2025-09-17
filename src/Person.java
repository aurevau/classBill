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

    public void greetOtherPerson(Person other){
        System.out.println("Hello " + other.firstName +
                ", my name is " + this.firstName);
    }
    public void stateAge(){
        System.out.println("I am " + this.age + " years old");
    }
    public void guessAge(int guess){

        if(guess == this.age){
            System.out.println("Yeah, you guessed it!!");
            this.stateAge();
        } else if (guess > this.age){
            System.out.println("I'm not that old...:(");
            this.stateAge();
        } else {
            System.out.println("No, do I look that young?:) ");
            this.stateAge();
        }
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
