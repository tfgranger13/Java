import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls(){
        Random randMachine = new Random();
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            int value = randMachine.nextInt(20) + 1;
            resultArray.add(value);
        }
        return resultArray;
    }
    public char getRandomLetter(){
        Random randMachine = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int number = randMachine.nextInt(26);
        return alphabet[number];
    }
    public String generatePassword(){
        String password = "" + getRandomLetter() + getRandomLetter() + getRandomLetter() + getRandomLetter() + getRandomLetter() + getRandomLetter() + getRandomLetter() + getRandomLetter();
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}