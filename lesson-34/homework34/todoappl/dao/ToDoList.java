package homework34.todoappl.dao;

import homework34.todoappl.model.Task;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);
    void printTask();

    // print list of Tasks
    void viewTasks();

    // quantity of tasks
    int quantity();

    Task findTask(int id);

    Task updateTask(int id, String task);


}

