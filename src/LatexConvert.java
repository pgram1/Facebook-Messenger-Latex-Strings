import java.util.Scanner;
public class LatexConvert {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me string to convert to Facebook-style Latex:");
        String[] words = (sc.nextLine()).split("\\s+");
        for (int i = 0; i < words.length; i++) {
                System.out.print("\\(" + words[i] + "\\) ");
        }
        System.out.println();
}
}
