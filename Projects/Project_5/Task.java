import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.lang.Integer;


enum Priority {
    URGENT,
    HIGH,
    NORMAL,
    LOW
}

enum Status {
    NOT_STARTED,
    IN_PROGRESS,
    WAITING,
    DEFERRED
}

class Task implements Comparable<Task> {

    int taskId;
    String subject;
    Priority priority;
    Status status;
    LocalDate startDate;
    LocalDate dueDate;

    public Task(int taskId, String subject, Priority priority, Status status, LocalDate startDate, LocalDate dueDate) {
        this.taskId = taskId;
        this.subject = subject;
        this.priority = priority;
        this.status = status;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }


    public int getTaskId() {
        return taskId;
    }

    @Override
    public String toString() {
        return "Id:" + taskId + "; Subject: " + subject + "; Status: " + status + "; Priority: " + priority + "; StartDate: " + startDate.toString() + "; Due date: " + dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task task) {
        return this.getPriority().compareTo(task.getPriority());        }
}
