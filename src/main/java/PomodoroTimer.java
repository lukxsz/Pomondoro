import static java.lang.Thread.sleep;

public class PomodoroTimer {
    int time = 0;
    boolean state = false;

    public void start(){
        state = true;
        while(state == true) {
            time++;
            System.out.println(time);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore the interrupted status
                System.out.println("Countdown interrupted.");
                break;
            }
        }
    }

    public void pause(){
        state = false;
    }

    public void restart(){
        state = true;
        time = 0;
    }
}
