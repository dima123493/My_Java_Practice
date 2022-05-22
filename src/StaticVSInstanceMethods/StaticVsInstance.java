package StaticVSInstanceMethods;

public class StaticVsInstance {
    public static void main(String[] args) {
        Human.printStatic(); //calling the static method

        Human peter = new Human();//calling the instance method
        peter.printInstance();

        Human.averageWorking(); // "An average human works 40 hours per week."

        /////////////////////////

        Human david = new Human();
        david.name = "David";
        david.work(); // "David loves working!"


        Human alice = new Human();
        alice.name = "Alice";
        alice.work(); // "Alice loves working!"

        david.workTogetherWith(alice); // "David loves working with Alice"
    }
}

class Human {
    String name;
    int age;

    public static void printStatic() {
        System.out.println("It's a static method");
    }

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void printInstance() {//if there is no "static" word - it is Instance method
        System.out.println("It's an instance method");
        /*
        an instance method is a method that belongs to each object
        that we created of the particular class.
         */
    }

    public void work() {
        System.out.println(this.name + " loves working!");
    }

    public void workTogetherWith(Human other) {
        System.out.println(this.name + " loves working with " + other.name + '!');
    }
}