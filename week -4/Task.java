public class Task implements Comparable<Task> {
    private String name;
    private int priority; // Higher number means higher priority

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Sort by priority (descending order)
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Task: " + name + ", Priority: " + priority;
    }
}

