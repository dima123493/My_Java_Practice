package StringFormatting;

public class FormatTheString {
    public static void main(String[] args) {
        String name = "My name is %c. %s ";
        String age = "My age is %d ";
        String height = "My height is %.2fm";
        System.out.println(String.format(name + age + height, 'M', "Anderson", 22, 1.53));
    }
}
