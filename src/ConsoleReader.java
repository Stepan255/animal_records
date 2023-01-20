import java.util.Scanner;

public class ConsoleReader {
        private Scanner iScanner = new Scanner(System.in);

        public String getLine() {
            return iScanner.nextLine();
        }

        public void stop(){
            iScanner.close();
        }
}
