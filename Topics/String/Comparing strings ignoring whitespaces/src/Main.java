import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String noSpacesFirst = first.replace(" ", "");
        String noSpacesSecond = second.replace(" ", "");

        System.out.println(noSpacesFirst.equals(noSpacesSecond));
    }
}