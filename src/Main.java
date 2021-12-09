import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Введите количество этажей:");
        int Flors = src.nextInt();
        System.out.println("___________´ ´´___");
        System.out.println("___________–––_____");
        System.out.println("___________||______");
        System.out.println("________╱╲ ||______");
        System.out.println("_______╱__╲ ||______");
        System.out.println("______╱____╲ |______");
        System.out.println("_____╱______╲ ______");
        System.out.println("____╱__[__]__╲ _____"); // окно на тех.этаж
        for (int i = 1; i <= Flors; i++) {System.out.println("____|________|_____"); System.out.println("____|__[__]__|_____");}
        System.out.println("____|__-––___|_____");
        System.out.println("____|__| |___|_____");
        src.close();
    }
}
