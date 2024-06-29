package homework34.todoappl.tests;
import homework34.todoappl.dao.ToDoListImpl;
import homework34.todoappl.model.Menu;
import homework34.todoappl.model.Task;

import java.util.Scanner;



    public class ToDoListAppl {
        public static void main(String[] args) {
            // greeting
            System.out.println("Welcome to ToDo Application!");
            ToDoListImpl toDoList = new ToDoListImpl(10);
            int id = 0;

            // начало цикла
            while (true) {
                // print menu
                Menu.printMenu(); // статический метод вызывается по имени класса
                // ask choice
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input your choice: ");
                int choice = scanner.nextInt();
                // execute
                switch (choice) {
                    case 1: {
                        scanner.nextLine();
                        System.out.println("Input task: ");
                        String task = scanner.nextLine();
                        Task newTask = new Task(1,"Print task",600);
                        toDoList.addTask(newTask);
                        break;
                    }
                    case 2: {
                        System.out.println("Your tasks: ");
                        toDoList.viewTasks();
                        break;
                    }
                    case 3: {
                        System.out.println("Input task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        Task removedTask = toDoList.removeTask(taskNumber - 1);
                        System.out.println(removedTask + " is removed.");
                        break;
                    }
                    case 4:
                        return;
                    default: {
                        System.out.println("Wrong input.");
                    }
                }
            }
        }
    }


