import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static ArrayList<Person> people = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {



        while(true) {
            addPerson();
            printPeopleList();
        }


    }

    private static void addPerson() {
        Person person = new Person(); // Skapar upp en ny instans av vår class Person
        
        System.out.println("Welcome to Person Management System");
        System.out.println();

        System.out.println("Please enter a firstname");
        person.setFirstName(input.nextLine());


        System.out.println("Please enter a lastname");
        person.setLastName(input.nextLine());

        System.out.println("Please enter your age");
        person.setAge(input.nextInt());
        input.nextLine();

        System.out.println("Please enter your job");


        people.add(person);
    }

    private static void printPeopleList() {
        // Går igenom vår lista people
        for(int i = 0; i < people.size(); i++){
            Person person = people.get(i);
            System.out.println((i + 1) + ". " + person.getFirstName() + " " + person.getLastName() + ", " + person.getAge());
        }

    }
}