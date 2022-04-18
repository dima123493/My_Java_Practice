package MySimpleChattyZubBot;

import java.util.Scanner;

import static java.lang.System.*;

public class ZubBot {
    static final Scanner scanner = new Scanner(in);

        public static void main(String[] args) {
            greet("ZubBot", "2022");
            remindName();
            guessAge();
            count();
            test();
            end();
        }

        static void greet(String assistantName, String birthYear) {
            out.println("Hello! My name is " + assistantName + ".");
            out.println("I was created in " + birthYear + ".");
            out.println("Please, remind me your name.");
        }

        static void remindName() {
            String name = scanner.nextLine();
            out.println("What a great name you have, " + name + "!");
        }

        static void guessAge() {
            out.println("Let me guess your age.");
            out.println("Enter remainders of dividing your age by 3, 5 and 7.");
            int rem3 = scanner.nextInt();
            int rem5 = scanner.nextInt();
            int rem7 = scanner.nextInt();
            int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
            out.println("Your age is " + age + "; that's a good time to start programming!");
        }

        static void count() {
            out.println("Now I will prove to you that I can count to any number you want.");
            int num = scanner.nextInt();
            for (int i = 0; i <= num; i++) {
                out.printf("%d!\n", i);
            }
        }

        static void test() {
            out.println("Let's test your programming knowledge.");
            out.println("What is a Java?");
            out.println("1. Programming language?");
            out.println("2. Island?");
            out.println("3. Tea drink?");
            out.println("4. Nothing from above.");
            int answer = scanner.nextInt();
            if (answer == 1) {
            } else {
                out.println("Please, try again.");

            }
        }

            static void end() {
                out.println("Congratulations, have a nice day!");
            }
        }