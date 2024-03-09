import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        while (true) {
            // Get current time
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);  // 24-hour format
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);

            // Format time with leading zeros for aesthetics (00:00:00)
            String formattedTime = String.format("%02d:%02d:%02d", hour, minute, second);

            // Clear the console (optional)
            System.out.print("\033[H\033[2J");

            // Print the formatted time
            System.out.println(formattedTime);

            // Introduce a delay of 1 second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
