package OOPHW3;

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
//----------------------------------------------------------------------
        controller.addStudent(new Student(4L, "Ivan Morozov"));
        controller.addStudent(new Student(6L, "Petr Vorobev"));
        controller.addStudent(new Student(2L, "Sidor Sidorov"));
        controller.addStudent(new Student(1L, "Elena Ivanova"));
        controller.addStudent(new Student(8L, "Anna Morozova"));
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.deleteStudent("Anna Morozova");
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.compareTo();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortBySecondName();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.printAll();

    }
}
