package homework34.todoappl.dao;

import homework34.todoappl.model.Task;

import java.time.LocalDateTime;
import java.util.Arrays;
public class ToDoListImpl implements ToDoList {
    //fields
    private Task[] tasks;
    private int capacity;
    private int quantity;

    private LocalDateTime time;
    LocalDateTime currentdateTime = LocalDateTime.now();


    // constructor
    public ToDoListImpl(int capacity) {
        tasks = new Task[capacity]; // можно использовать ArrayList
        this.quantity = 0;
    }

    @Override
    public boolean addTask(Task task) {
        if (task == null || quantity == tasks.length || findTask(task.getId()) != null) {
            return false;
        }
        tasks[quantity] = task;
        quantity++;
        return true;
    }

    @Override
    public Task removeTask(int id) {
        // find by id then remove, quantity--
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                Task removedTask = tasks[i];
                tasks[quantity - 1] = null;
                quantity--;
                return removedTask;
            }
            // устанавливаем новые индексы c 0 и подряд
            for (int j = 0; j < quantity; j++) {
                tasks[j].setId(j);
            }
            // sort tasks
            Arrays.sort(tasks);
        }
        return null;
    }

    @Override
    public void printTask() {
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks);

        }

    }

    @Override
    public void viewTasks() {
        // for loop, print tasks
        // TODO заменить на foreach
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks.");
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public Task findTask(int id) {
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                return tasks[i];
            }
        }
        return null;
    }
    @Override
    public Task updateTask(int id, String task) {
        for (Task task1 : tasks) {
            if (task.length() == id) {
                return task1;
            }
        }
        return null;
    }

    public void setCurrentdateTime(LocalDateTime currentdateTime) {
        this.currentdateTime = currentdateTime;
    }
}

