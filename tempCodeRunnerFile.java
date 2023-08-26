import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameMatcher {
    public static void main(String[] args) {
        List<String> list1 = readNames("List 1");
        List<String> list2 = readNames("List 2");

        List<String> commonNames = matchNames(list1, list2);

        if (commonNames.isEmpty()) {
            System.out.println("No common names found.");
        } else {
            System.out.println("Common names in both lists:");
            for (String name : commonNames) {
                System.out.println(name);
            }
        }
    }

    public static List<String> readNames(String listName) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Enter names for " + listName + " (Type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("done")) {
                break;
            }
            names.add(name);
        }

        return names;
    }

    public static List<String> matchNames(List<String> list1, List<String> list2) {
        List<String> commonNames = new ArrayList<>();
        for (String name : list1) {
            if (list2.contains(name)) {
                commonNames.add(name);
            }
        }
        return commonNames;
    }
}
