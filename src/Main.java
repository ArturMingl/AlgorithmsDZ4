import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final RedBlackTree tree = new RedBlackTree();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число");
        int value = scan.nextInt();
        tree.add(value);
        System.out.println("Finish");
    }
}