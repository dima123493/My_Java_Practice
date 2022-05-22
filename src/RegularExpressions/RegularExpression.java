package RegularExpressions;

public class RegularExpression {
    public static void main(String[] args) {
        String aleRegex = "ale";// the "ale" regex
        "ale".matches(aleRegex);  // true
        "pale".matches(aleRegex); // false, "pale" string has an additional character
        "ALE".matches(aleRegex);  // false, uppercase letters don't match lowercase and vice versa

        String helloRegex = "Hello, World";
        "Hello, World".matches(helloRegex); // true
        "Hello, world".matches(helloRegex); // false
        "Hello,World".matches(helloRegex); // false

        String learnRegex = "Learn.Regex";
        "Learn Regex".matches(learnRegex); // true
        "Learn.Regex".matches(learnRegex); // true
        "LearnRegex".matches(learnRegex); // false
        "Learn, Regex".matches(learnRegex); // false
        "Learn\nRegex".matches(learnRegex); // false

        String pattern = "behaviou?r";
        "behaviour".matches(pattern); // true
        "behavior".matches(pattern);  // true

        String pattern1 = "..?";
        "I".matches(pattern1);  // true
        "am".matches(pattern1); // true
        "".matches(pattern1);   // false

        String endRegex = "The End\\.";
        "The End.".matches(endRegex); // true
        "The End?".matches(endRegex); // false

        String pattern2 = ".....\\.";
        "a1b2c.".matches(pattern2); // true
        "Wrong.".matches(pattern2); // true
        "Hello!".matches(pattern2); // false

        String pattern3 = "[bcr]at"; // it matches strings "bat", "cat", "rat", but not "fat"
        "rat".matches(pattern3); // true
        "fat".matches(pattern3); // false

        String pattern4 = "[ab]x[12]"; // can match a or b followed by x followed by either 1 or 2

        String anyDigitPattern = "[0-9]";
        String anyLetterPattern = "[a-zA-Z]";
        String anyLetterPattern1 = "[a-z!?.A-Z]"; // matches any letter and "!", "?", "."

        String regex = "[^abc]"; // matches everything except for "a", "b", "c"
        "a".matches(regex); // false
        "b".matches(regex); // false
        "c".matches(regex); // false
        "d".matches(regex); // true


        String regex1 = "[^1-6]";
        "1".matches(regex1); // false
        "2".matches(regex1); // false
        "0".matches(regex1); // true
        "9".matches(regex1); // true

        String pattern5 = "[\\[\\]]"; // matches "[" and "]"

        String pattern6 = "yes|no|maybe"; // matches "yes", "no", or "maybe", but not "y" or "e"
        "no".matches(pattern6); // true

        String pattern7 = "(b|r|go)at"; // matches "bat", "rat" or "goat"
        String answer = "The answer is definitely (yes|no|maybe)";

        String repetitions = "ca+b";
        "cab".matches(repetitions); // true
        "caaaaab".matches(repetitions); // true
        "cb".matches(repetitions); // false because it does not have at least one repetition of 'a'

        String re = "A[0-3]*";
        "A".matches(re);  // true because the pattern matches zero or more repetitions
        "A0".matches(re); // true
        "A000111222333".matches(re); // true

        String johnRegex = ".*John.*"; // it matches all strings containing the substring "John"
        String textWithJohn = "My friend John is a computer programmer";
        textWithJohn.matches(johnRegex); // true
        String john = "John";
        john.matches(johnRegex); // true
        String textWithoutJohn = "My friend is a computer programmer";
        textWithoutJohn.matches(johnRegex); // false

        String numberRepetitions = "[0-9]{4}"; // four digits
        "6342".matches(numberRepetitions);  // true
        "9034".matches(numberRepetitions);  // true

        "182".matches(numberRepetitions);   // false
        "54312".matches(numberRepetitions); // false

        String inAnswerMatch = "1{2,3}";
        "1".matches(inAnswerMatch);    // false
        "11".matches(inAnswerMatch);   // true
        "111".matches(inAnswerMatch);  // true
        "1111".matches(inAnswerMatch); // false

        String matchesWithComa = "ab{4,}";
        "abb".matches(matchesWithComa); // false, not enough 'b'
        "abbbb".matches(matchesWithComa); // true
        "abbbbbbb".matches(matchesWithComa); // true

        String startRegex = "\\bcat"; // matches the part of the word that starts with "cat"
        String endRegex1 = "cat\\b"; // matches the part of the word that ends with "cat"
        String wholeRegex = "\\bcat\\b"; // matches the whole word "cat"
    }
}
