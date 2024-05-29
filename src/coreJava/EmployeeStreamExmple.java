package coreJava;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamExmple {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public EmployeeStreamExmple(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }

    public static void main(String[] args) {
        List<EmployeeStreamExmple> employeeList = new ArrayList<EmployeeStreamExmple>();

        employeeList.add(new EmployeeStreamExmple(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new EmployeeStreamExmple(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new EmployeeStreamExmple(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new EmployeeStreamExmple(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new EmployeeStreamExmple(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new EmployeeStreamExmple(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new EmployeeStreamExmple(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new EmployeeStreamExmple(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new EmployeeStreamExmple(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new EmployeeStreamExmple(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new EmployeeStreamExmple(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new EmployeeStreamExmple(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new EmployeeStreamExmple(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new EmployeeStreamExmple(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new EmployeeStreamExmple(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new EmployeeStreamExmple(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new EmployeeStreamExmple(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //Find out the count of male and female employees present in the organization?
//        getCountOfMaleFemale(employeeList);
//
//        //Write a program to print the names of all departments in the organization.
//        getDepartmentName(employeeList);
//
//        //Find the average age of Male and Female Employees.
//        getGender(employeeList);
//
//        //Get the Names of employees who joined after 2015.
//        getNameOfEmp(employeeList);
//
//        // Count the number of employees in each department.
//        countByDept(employeeList);
//
//        //6. Find out the average salary of each department.
//        avgSalary(employeeList);
//
//        //7. Find out the oldest employee, his/her age and department?
//        oldestEmp(employeeList);
//
//        //8. Find out the average and total salary of the organization.
//        getEmpSalary(employeeList);
//
//        //9. List down the employees of each department.
//        listDownDept(employeeList);
//
//        //Find out the highest experienced employees in the organization
//        seniorEmp(employeeList);

        interviewQuestions(employeeList);
    }

    public static void getCountOfMaleFemale(List<EmployeeStreamExmple> employeeList) {

        int femaleCount = (int) employeeList.stream().filter(e -> e.getGender().equals("Female")).count();
        int maleCount = (int) employeeList.stream().filter(e -> e.getGender().equals("Male")).count();
        System.out.println("Female Count:" + femaleCount);
        System.out.println("Male Count:" + maleCount);

        // OR

        Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(
                EmployeeStreamExmple::getGender, Collectors.counting()));
        System.out.println(genderCount);

    }

    public static void getDepartmentName(List<EmployeeStreamExmple> employeeList) {

        List<String> depttList = employeeList.stream().map(EmployeeStreamExmple::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(depttList);
    }

    public static void getGender(List<EmployeeStreamExmple> employeeList) {
        // average gender age
        Map<Object, Double> genderAge = employeeList.stream().collect(Collectors.groupingBy(EmployeeStreamExmple::getGender, Collectors.averagingLong(EmployeeStreamExmple::getAge)));
        System.out.println(genderAge);
    }

    public static void getNameOfEmp(List<EmployeeStreamExmple> employeeList) {
        // joined after 2015

        employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015)
                //.map(Employee::getName)
                .forEach(e -> System.out.println(e.getName() + " = " + e.getYearOfJoining()));

    }

    public static void countByDept(List<EmployeeStreamExmple> employeeList) {
        Map<String, Long> dptt = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.department, Collectors.counting()));
        System.out.println(dptt);
    }

    public static void avgSalary(List<EmployeeStreamExmple> employeeList) {
        Map<String, Double> avgSal = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.department, Collectors.averagingDouble(EmployeeStreamExmple::getSalary)));

        System.out.println(avgSal);
    }

    public static void oldestEmp(List<EmployeeStreamExmple> employeeList) {

        Optional<EmployeeStreamExmple> employee = employeeList.stream().max(Comparator.comparing(EmployeeStreamExmple::getAge));
        System.out.println(employee);

    }

    public static void getEmpSalary(List<EmployeeStreamExmple> employeeList) {
        //Find out the average and total salary of the organization.

        Double totalSal = employeeList.stream().collect(Collectors.summingDouble(EmployeeStreamExmple::getSalary));
        Double avgSal = employeeList.stream().collect(Collectors.averagingDouble(EmployeeStreamExmple::getSalary));
        System.out.println(totalSal);
        System.out.println(avgSal);

    }


    public static void listDownDept(List<EmployeeStreamExmple> employeeList) {
        //9. List down the employees of each department.

        Map<String, List<String>> empList = employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeStreamExmple::getDepartment,
                        Collectors.mapping(EmployeeStreamExmple::getName, Collectors.toList())));
        System.out.println(empList);
        System.out.println(empList);

        // Map<Integer,List<EmployeeStreamExmple>> deptemployees = employeeList.stream().collect(Collectors.groupingBy(d->d)).entrySet().stream().map(EmployeeStreamExmple::getDepartment).Collect(Collectors.toList());

    }

    public static void seniorEmp(List<EmployeeStreamExmple> employeeList) {
        Optional<EmployeeStreamExmple> seniorEmp = employeeList.stream()
                .sorted(Comparator
                        .comparingInt(EmployeeStreamExmple::getYearOfJoining)).findFirst();

        EmployeeStreamExmple seniorMostEmployee = seniorEmp.get();

        System.out.println("Senior Most Employee Details :");
        System.out.println("----------------------------");
        System.out.println("ID : " + seniorMostEmployee.getId());
        System.out.println("Name : " + seniorMostEmployee.getName());
        System.out.println("Age : " + seniorMostEmployee.getAge());
    }

    public static void interviewQuestions(List<EmployeeStreamExmple> employeeList) {

        // get only employee names whose Salary > 30k
        List<String> enames = employeeList.stream()
                .filter(e -> e.getSalary() > 30000)
                .map(e -> e.getName())
                .collect(Collectors.toList());

        enames.stream().forEach(System.out::println);


        // Department wise employees information
         Map<String,List<EmployeeStreamExmple>> departmentWiseEmployees = employeeList.stream()
                 .collect(Collectors.groupingBy(e-> e.getDepartment()));

        departmentWiseEmployees.forEach((department, employees) -> {
            System.out.println("Department: " + department);
            System.out.println("--------------------------------");
            employees.forEach(e ->
                    System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary())
            );
            System.out.println();
        });

    }
}
