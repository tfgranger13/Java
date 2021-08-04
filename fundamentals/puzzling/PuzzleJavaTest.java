import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJavaTest {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassword());
        System.out.println(generator.getNewPasswordSet(1));
        System.out.println(generator.getNewPasswordSet(2));
        System.out.println(generator.getNewPasswordSet(3));
    }
}