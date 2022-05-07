import java.util.Scanner;

    public class ChatBot {
       final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
    greeting();
    String userAns = repeatName();
    int age = guessAge();
    int num = counting();
    testing();
    story(userAns, age, num);
    }
    public static void greeting (){
        System.out.println("Hey there! my name is Bruno. " + "\n" + " I am excited to get to know you");
    }

    public static String userName() {

        return sc.nextLine();
    }
    public static String repeatName() {
        System.out.println("Can you tell me your name please?");
        String userAns = userName();
        System.out.println("My bad, I didn't get that. " + "\n" + "Can you tell me your name one more time?");
        String userAns2 = userName();
        if (userAns2.equalsIgnoreCase(userAns)) {
            System.out.println("Hm " + userAns + ", what a lovely name!");
            return userAns;
        } else {
            System.out.println("your name won't match" + ".\n" + "Can you please enter your name again?");
            userAns = userName();
            System.out.println("Ok " + userAns + " , lets get to know each other;)");
            return userAns;
        }
    }
    public static int guessAge(){
        System.out.println("Let me guess your age?");
        System.out.println("Can you tell me the reminders of dividing your age by 3, 5 and 7.");
        int re1 = sc.nextInt();
        int re2 = sc.nextInt();
        int re3 = sc.nextInt();
        int age = (re1 * 70 + re2 * 21 + re3 * 15) % 105;
        System.out.println("Your age is " + age);
        return age;
    }

    public static int counting(){
        System.out.println("Now, Let me count you any number you want." + "\n" +
                "Please enter any integer number starting from 0");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%,d %n", i);

        }
        return num;
    }
    public static void testing(){
        System.out.println("One last thing, Do you want to participate in a short java programming test?" + "\n"
                + "Please enter 1 for Yes or enter 2 for No" );
        System.out.println("[1]");
        System.out.println("[2]");
        int useAns3 = sc.nextInt();
        switch (useAns3) {
            case 1:
                System.out.println("Let's test your Java programming skill!");
                System.out.println("Question one:");
                System.out.println("Which one is true about the return type method?");
                System.out.println("[1] The void return type requires return statement..");
                System.out.println("[2] The return type of the method and type of data returned at the end of the method should be of the different type..");
                System.out.println("[3] A return statement causes the program control to transfer back to the caller of a method.");
                System.out.println("[4] The variable that stores the returned value after the method is called should be a different data type.");

                while (true) {
                    useAns3 = sc.nextInt();
                    if (useAns3 == 3) {
                        System.out.println("You got it!");
                        break;
                    }
                    System.out.println("Sorry, that's not the right answer please try again.");
                }

                System.out.println("Question two:");
                System.out.println("what was the name of java before it was created?");
                System.out.println("[1] Oak.");
                System.out.println("[2] JavaScript.");
                System.out.println("[3] Python.");
                System.out.println("[4] Java.");

                while (true) {
                    useAns3 = sc.nextInt();
                    if (useAns3 == 1) {
                        System.out.println("That's Correct!");
                        break;
                    }
                    System.out.println("Sorry, that's not the right answer please try again.");
                }

                System.out.println("Question three:");
                System.out.println("What is the appropriate data type for this field: isACoder?");
                System.out.println("[1] int");
                System.out.println("[2] String");
                System.out.println("[3] Double");
                System.out.println("[4] Boolean");

                while (true) {
                    useAns3 = sc.nextInt();
                    if (useAns3 == 4) {
                        System.out.println("Here we go!");
                        break;
                    }
                    System.out.println("Sorry, that's not the right answer please try again.");
                }

                System.out.println("Question four:");
                System.out.println(" What does the expression float a = 35 / 0 return?");
                System.out.println("[1] 0");
                System.out.println("[2] Not a number");
                System.out.println("[3] Infinity");
                System.out.println("[4] Run time exception.");

                while (true) {
                    useAns3 = sc.nextInt();
                    if (useAns3 == 3) {
                        System.out.println("Nice!");
                        break;
                    }
                    System.out.println("Sorry, that's not the right answer please try again.");
                }

                System.out.println("Congratulations you got all the answers, It was nice talking to you,  have a blessed day!");
                break;
            case 2:
                System.out.println("Bye, see you soon!!!");
                break;
        }
 }
    public static void story(String userAns, int age, int num){
             System.out.println("Here is what I know about you: " + "\n" +
                     "your name is " + userAns + ", you are " +  age +" years old, and your favorite number is " + num + ".");
        }
}
