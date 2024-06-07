package coreJava;

import java.util.HashSet;
import java.util.Objects;



public class DuplicateInHashSet {


    public static void main(String[] args) {

        Employee emp = new Employee("Dip",41, 101);


        HashSet<Employee> set = new HashSet<>();

        set.add(emp);
        set.add(emp);
        set.add(emp);

        System.out.println(set.size());

        set.stream().forEach(e -> {
                    System.out.println(e.getName() + " Id:" + e.getId());
                }
        );

    }
}

class Employee {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int id;
    int age;


    public  Employee(String name, int id, int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return Objects.hash(id++);

    }


}
