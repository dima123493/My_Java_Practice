package HashTables;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {

    String firstName;
    String lastName;
    int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();//HashSet will add all elements
        Comparator
                .comparingInt(Employee::getAge).reversed()
                .thenComparing(Employee::getLastName)
                .thenComparingInt(Employee::getAge);

        set.add(new Employee("Oleksandr", "Butrym", 44));
        set.add(new Employee("Vlad", "Mazur", 18));
        set.add(new Employee("Dmytro", "Zubenko", 26));

        for (var employee : set) {
            System.out.println(employee);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.firstName.compareTo(o.lastName);//lastName...
        //return this.age - o.age; //age sorting
    }
}
