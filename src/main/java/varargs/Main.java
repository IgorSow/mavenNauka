package varargs;

public class Main {

    public static void main(String... args) {

        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println("taki main tez jest poprawny");
        test("pierwszy","drugi", "trzeci");
    }

    public static void test(String... testString) {

        for (String a: testString) {
            System.out.println(a);
        }
    }
}
