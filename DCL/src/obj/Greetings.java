package obj;

public class Greetings{
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a name and an age.");
            return;
        }

        String name = args[0];
        // Convert text to an integer for math or numeric use
        int age = Integer.parseInt(args[1]);

        System.out.println("Name: " + name + ", Age: " + age);
    }
}
