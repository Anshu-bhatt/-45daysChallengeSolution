import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void sortTasks() {
        Collections.sort(tasks);
    }

    public void printTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
