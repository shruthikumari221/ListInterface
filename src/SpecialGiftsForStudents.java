import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGiftsForStudents {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> studentNames = Arrays.asList("Abi", "Anu", "Anand", "shruthi", "Anees", "Preethi", "Ananthika", "Andriya", "Lavanya", "Alex");

        // Use Stream API and lambda expression to filter students whose names start with 'A'
        List<String> studentsWithSpecialGifts = studentNames.stream()
                .filter(name -> name.startsWith("A")).collect(Collectors.toList());

        // Display the students who will receive special gifts
        System.out.println("Students who will receive special gifts:");
        studentsWithSpecialGifts.forEach(student -> {
            System.out.println(student);
            // You can add code here to give special gifts to these students
            // For example: giveGift(student);
        });
    }

    // You can define a method to give special gifts to students if needed
    /*
    private static void giveGift(String studentName) {
        // Code to give special gift to the student
        System.out.println("Giving a special gift to " + studentName);
    }
    */
}