import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiscountService {
    double discount(double value) {
        return value * 0.8;
    }

    void input(Scanner scanner) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("text.txt"));
    }
}
