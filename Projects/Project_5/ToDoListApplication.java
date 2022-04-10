
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToDoListApplication {


    PriorityQueue<Task> taskPriorityQueue = new PriorityQueue<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ToDoListApplication app = new ToDoListApplication();
        app.testPriorityQueue();
    }

    public void displayNextTask() {
        // add your code here
        Iterator it = taskPriorityQueue.iterator();
        while (((Iterator) it).hasNext()) {
            Task task = (Task) it.next();
            if (task.priority==Priority.URGENT)
            {
                System.out.println(task);
                System.out.println("Is this task complete? y/n:");
                String input = scanner.nextLine();
                break;
            }
        }
    }

    public void showTaskDetail(int taskId)
    {
        Task task = getTaskById(taskId);
        // add your code here to print the task.
        if (task!=null)
            System.out.println(task);
    }

    public Task getTaskById(int taskId)  {

        Iterator it = taskPriorityQueue.iterator();
        while (((Iterator) it).hasNext()) {
            Task task = (Task) it.next();
            if (task.getTaskId() == taskId)
                return task;
        }
        System.out.println("TaskId not found...");
        return null;
    }

    public void removeTask(int taskId)  {
        // Add your code here
        Iterator it = taskPriorityQueue.iterator();
        while (((Iterator) it).hasNext()) {
            Task task = (Task) it.next();
            if (task.getTaskId() == taskId)
            {
                taskPriorityQueue.remove(task);
                System.out.println("Task removed...");
                return;
            }
        }
    }



    public Task editTask(int taskId) {
        // Your code here to change task attributes.
        Iterator it = taskPriorityQueue.iterator();
        boolean checker=false;
        while (((Iterator) it).hasNext()) {
            Task task = (Task) it.next();
            if (task.getTaskId() == taskId)
            {
                checker=true;
                //Better yet, make it optional to keep the existing attribute like this:
                System.out.println("Edit Task:");
                System.out.println("Enter new subject or press enter to leave unchanged: ");
                String subject = scanner.nextLine();
                System.out.println("Enter new due date (yyyy-mm-dd), or press enter to leave unchanged:");
                String input = scanner.nextLine();
                LocalDate dueDate = LocalDate.parse(input);
                LocalDate startDate = LocalDate.now();

                System.out.println("Enter status abbreviation Not Started=n,Deferred=d,Waiting=w,Complete=c):");
                Status status = Status.DEFERRED;
                String statusInp = scanner.nextLine();
                switch (statusInp) {
                    case "n":
                        status = Status.NOT_STARTED;
                        break;
                    case "c":
                        status = Status.IN_PROGRESS;
                        break;
                    case "w":
                        status = Status.WAITING;
                        break;
                    case "d":
                        status = Status.DEFERRED;
                        break;
                }

                Priority priority = Priority.NORMAL;
                System.out.println("Enter priority abbreviation Normal=n,Low=l,High=h,Urgent=u):");
                String abbrev = scanner.nextLine();
                switch (abbrev) {
                    case "n":
                        priority = Priority.NORMAL;
                        break;
                    case "l":
                        priority = Priority.LOW;
                        break;
                    case "h":
                        priority = Priority.HIGH;
                        break;
                    case "u":
                        priority = Priority.URGENT;
                        break;
                }

                if (!subject.equals("")) {
                    task.subject = subject;
                }
                if (!dueDate.equals("")) {
                    task.dueDate = dueDate;
                    task.startDate = startDate;
                }
                if (!statusInp.equals("")) {
                    task.status = status;
                }

                if (!abbrev.equals("")) {
                    task.priority = priority;
                }

                return task;
            }
        }
        if (checker==false)
        {
            System.out.println("TaskId not found...");
            return null;
        }
        return null;
    }


    public void testPriorityQueue() {
        System.out.println("Welcome to My Task List\n");
        do {
            System.out.println("Choose action (Add(a), Next(n), List(l), Detail(d), Edit(e), Remove(r), Quit(q):");

            String menuItem = scanner.nextLine();

            switch (menuItem) {
                case "a":
                    addTask();
                    break;
                case "n":
                    displayNextTask();
                    break;
                case "l":
                    showTaskSummaryList();
                    break;
                case "d":
                    System.out.println("Enter taskId: ");
                    int taskId = Integer.parseInt(scanner.nextLine());
                    showTaskDetail(taskId);
                    break;
                case "e":
                    System.out.println("Enter taskId: ");
                    int taskID = Integer.parseInt(scanner.nextLine());
                    editTask(taskID);
                    break;
                case "r":
                    System.out.println("Enter taskId: ");
                    taskId = Integer.parseInt(scanner.nextLine());
                    removeTask(taskId);
                    break;
                case "q":
                    System.out.println("Goodbye.");
                    return;
            }
        } while (true);
    }

    void showTaskSummaryList() {
        for (Task task: taskPriorityQueue)
            System.out.println(task);
    }



    private Priority scanForPriority() {
        Priority priority = Priority.NORMAL;
        System.out.println("Enter priority abbreviation Normal=n,Low=l,High=h,Urgent=u): ");String abbrev = scanner.nextLine();
        switch (abbrev) {
            case "n":
                priority = Priority.NORMAL;
                break;
            case "l":
                priority = Priority.LOW;
                break;
            case "h":
                priority = Priority.HIGH;
                break;
            case "u":
                priority = Priority.URGENT;
                break;
        }
        return priority;
    }

    void addTask() {
        System.out.println("Adding new Task...");
        System.out.println("Enter subject:");
        Scanner scanner = new Scanner(System.in);
        String subject = scanner.nextLine();

        System.out.println("Enter due date (yyyy-MM-dd):");
        String input = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dueDate = LocalDate.parse(input);
        Priority priority = scanForPriority();

        Status status = Status.NOT_STARTED;
        LocalDate date = LocalDate.now();
        LocalDate startDate = LocalDate.now();
        Task task = new Task(taskPriorityQueue.size() + 1, subject, priority, status, startDate, dueDate);
        taskPriorityQueue.add(task);
    }
}