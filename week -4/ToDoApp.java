import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do App Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Sort Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task priority (1-10): ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Task task = new Task(name, priority);
                    taskManager.addTask(task);
                    System.out.println("Task added.");
                    break;

                case 2:
                    System.out.print("Enter task name to remove: ");
                    name = scanner.nextLine();
                    taskManager.removeTask(new Task(name, 0)); // Priority is ignored for removal
                    System.out.println("Task removed.");
                    break;

                case 3:
                    System.out.println("Tasks:");
                    taskManager.printTasks();
                    break;

                case 4:
                    taskManager.sortTasks();
                    System.out.println("Tasks sorted by priority.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
