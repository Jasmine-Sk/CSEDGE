import java.util.Scanner;

public class Todo_Manager {

    public static void main(String[] args) {
        System.out.println("Welcome to your Todo Manager!\n");
        System.out.print("Please Enter your Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();  // Using nextLine to avoid issues with input buffer
        System.out.println("Hello " + name);

        String choice;
        String[] tasks = new String[10];
        int taskCount = 0;  // Keep track of the number of tasks
        Scanner input = new Scanner(System.in);

        do {
            // Display the Menu
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Enter a task ");
            System.out.println("2. Remove a task ");
            System.out.println("3. Update a task ");
            System.out.println("4. List all tasks ");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            choice = input.nextLine();

            switch (choice) {
                case "1":  // Enter a task
                    if (taskCount < tasks.length) {
                        System.out.print("Enter a new task: ");
                        tasks[taskCount] = input.nextLine();
                        taskCount++;
                    } else {
                        System.out.println("Task list is full! Remove a task before adding a new one.");
                    }
                    break;
                case "2":  // Remove a task
                    System.out.print("Enter the task number to remove (1 to " + taskCount + "): ");
                    int removeIndex = input.nextInt() - 1;
                    input.nextLine();  // Clear the buffer
                    if (removeIndex >= 0 && removeIndex < taskCount) {
                        // Shift tasks to the left
                        for (int i = removeIndex; i < taskCount - 1; i++) {
                            tasks[i] = tasks[i + 1];
                        }
                        tasks[taskCount - 1] = null;
                        taskCount--;
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case "3":  // Update a task
                    System.out.print("Enter the task number to update (1 to " + taskCount + "): ");
                    int updateIndex = input.nextInt() - 1;
                    input.nextLine();  // Clear the buffer
                    if (updateIndex >= 0 && updateIndex < taskCount) {
                        System.out.print("Enter the new task: ");
                        tasks[updateIndex] = input.nextLine();
                        System.out.println("Task updated.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case "4":  // List all tasks
                    System.out.println("Listing all tasks:");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.println((i + 1) + ". " + tasks[i]);
                    }
                    if (taskCount == 0) {
                        System.out.println("No tasks available.");
                    }
                    break;
                case "5":  // Exit
                    System.out.println("Exiting Todo Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (!choice.equals("5"));

        in.close();
        input.close();
    }
}
