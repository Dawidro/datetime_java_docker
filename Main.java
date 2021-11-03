import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.Random; //  Import the Random class
import java.util.concurrent.TimeUnit; // Import TimeUnit class


public class Main {
    public static void main(String[] args) {
        boolean done = false; // main loop logic

        while (!done) {
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            Random rand = new Random(); //instance of random class
            int upperlimit = 59;
            int int_random = rand.nextInt(upperlimit); 
            try {
                TimeUnit.SECONDS.sleep(int_random);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
            LocalDateTime myDateObj = LocalDateTime.now();
            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Current date and time: " + formattedDate);
        }
    }
}
