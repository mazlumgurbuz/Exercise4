package exercise;

public class Main {
    public static void main(String[] args) {
        String str = "*";
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.println(str);
                str = str.concat("*");
            } else if (i % 2 == 0) {
                System.out.println(str);
                str = str.concat("**");
            }
        }
    }
}
