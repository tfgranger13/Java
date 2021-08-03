public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself. 
        // Hint: You can use a String method to cast the int to a String.
        if (number %15 == 0){
            return "FizzBuzz";
        }
        else if (number %3 == 0){
            return "Fizz";
        }
        else if (number %5 == 0){
            return "Buzz";
        }
        else {
            return String.valueOf(number);
        }
    }
    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(
    // Parameters
    int number,  
    String multOf3Word, 
    String multOf5Word,
    String multOf15Word
    ) {

    // Implement the same logic, but replace "Fizz", "Buzz" and 
    // "Fizzbuzz" with the given words
    if (number %15 == 0){
        return multOf15Word;
    }
    else if (number %3 == 0){
        return multOf3Word;
    }
    else if (number %5 == 0){
        return multOf5Word;
    }
    else {
        return String.valueOf(number);
    }
    }
}

