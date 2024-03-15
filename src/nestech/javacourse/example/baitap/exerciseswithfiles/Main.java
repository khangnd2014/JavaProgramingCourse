package nestech.javacourse.example.baitap.exerciseswithfiles;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Employee> employeeList = new ArrayList<>();
    private static int currentIndex;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String filePath = "employee.dat";
        boolean run = true;

        while (run){

            System.out.println("EMPLOYEE MANAGEMENT");
            System.out.println("1. Open file data");
            System.out.println("2. Display list of employee");
            System.out.println("3. Display First employee");
            System.out.println("4. Display Previous employee");
            System.out.println("5. Display Next employee");
            System.out.println("6. Display Last employee");
            System.out.println("7. Input new employee");
            System.out.println("8. Delete a employee");
            System.out.println("9. Find employee");
            System.out.println("10. Save and exit");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    readFile(filePath);
                    break;
                case 2:
                    printListEmployee();
                    break;
                case 3:
                    printEmployeeAtIndex(0);
                    break;
                case 4:
                    printPreviousEmployee();
                    break;
                case 5:
                    printNextEmployee();
                    break;
                case 6:
                    printLastEmployee();
                    break;
                case 7:
                    addNewEmployee();
                    break;
                case 8:
                    removeEmployee();
                    break;
                case 9:
                    findEmployee();
                    break;
                case 10:
                    writeFile(filePath);
                    System.out.println("Saved!!! ");
                    System.out.println("Closing program...");
                    run = false;
                    break;
                default:
                    System.out.println("The choose isn't valid, please enter again");
                    break;
            }
        }
    }

    private static void findEmployee() {

        System.out.println("Enter employee name to search: ");
        String findName = scanner.next();

        boolean found = false;
        for(Employee tempEmployee : employeeList){
            if(tempEmployee.getName().equals(findName)){
                System.out.println("Employee found: " + tempEmployee);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Can't found employee " + findName);
        }
    }

    private static void removeEmployee() {

        System.out.println("Enter employee name to remove: ");
        String removeName = scanner.next();

        boolean removed = false;
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee.getName().equals(removeName)){
                iterator.remove();
                removed = true;
                break;
            }
        }
        if(removed){
            System.out.println("Employee removed successfully");
        }
        else{
            System.out.println("Can't found employee " + removeName);
        }

    }

    private static void addNewEmployee() {

        System.out.println("Enter id: ");
        int id = scanner.nextInt();

        System.out.println("Enter name: ");
        String name = scanner.next();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter position: ");
        String position = scanner.nextLine();

        Employee newEmployee = new Employee(id, name, age, position);
        employeeList.add(newEmployee);
        System.out.println("Employee added successfully.");
    }

    private static void printLastEmployee() {

        if(employeeList != null && !employeeList.isEmpty()){
            currentIndex = employeeList.size() - 1;
            System.out.println("Previous Employee: " + currentIndex);
            System.out.println(employeeList.get(currentIndex) + "\n");
        }
        else{
            System.out.println("No employee available.");
        }

    }

    private static void printNextEmployee() {

        if(currentIndex < employeeList.size() - 1){
            currentIndex ++;
            printEmployeeAtIndex(currentIndex);
        }else{
            System.out.println("No employee available.");
        }
    }

    private static void printPreviousEmployee() {

        if(currentIndex > 0){
            currentIndex--;
            printEmployeeAtIndex(currentIndex);
        }
        else{
            System.out.println("No employee available.");
        }
    }

    private static void printEmployeeAtIndex(int index) {

        if(employeeList.isEmpty()){
            System.out.println("No employee available.");
            return;
        }

        currentIndex = index;
        System.out.println("Current Employee: " + currentIndex);
        System.out.println(employeeList.get(currentIndex) + "\n");
    }

    private static void writeFile(String filePath) {
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            Employee[] employees =  {
//                    new Employee(1,"John",30,"Boss"),
//                    new Employee(2,"Christine",26,"Staff"),
//                    new Employee(3,"Jimmy",25,"Staff"),
//                    new Employee(4,"Henry",30,"Staff"),
//            };

            oos.writeObject(employeeList);

            oos.close();
            fos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printListEmployee() {
        if (employeeList != null) {
            for (Employee tempEmployee : employeeList) {
                System.out.println(tempEmployee);
            }
            System.out.println("Total employee: " + employeeList.size() + "\n");
        } else {
            System.out.println("No employee data available.");
        }
    }

    private static void readFile(String filePath){
        try{
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            //Employee[] employees = (Employee[]) ois.readObject();

            //employeeList = new ArrayList<>(Arrays.asList(employees));

            employeeList = (ArrayList<Employee>) ois.readObject();

            System.out.println("Data loaded successfully!!" + "\n");
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data from file");
        }
    }
}
