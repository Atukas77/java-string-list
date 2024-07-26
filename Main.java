import java.util.Scanner;

public class Main {
    private static void readWith(StringList list) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.startsWith("add")) {
                if (line.length() == 3) {
                    System.out.println("Illegal command");
                    continue;
                }
                String string = line.substring(4, line.length());
                list.add(string);
            } else if (line.startsWith("contains")) {
                if (line.length() == 8) {
                    System.out.println("Illegal command");
                    continue;
                }
                String string = line.substring(9, line.length());
                boolean contains = list.contains(string);
                System.out.println(contains);
            } else if (line.equals("print")) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            } else if (line.equals("clear")) {
                list.clear();
            } else if (line.equals("size")) {
                System.out.println(list.size());
            } else if (line.equals("exit")) {
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public static void main(String[] args) {
        readWith(new StringListImpl());
    }
}
