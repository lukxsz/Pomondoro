import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PomodoroTimer timer = new PomodoroTimer();
        Task task = new Task();;
        System.out.println("insert task");
        task.taskDescription = scanner.nextLine();
        System.out.println("Tasks: "+task.taskDescription); //maybe it's better to make tasks an array

    }
}
