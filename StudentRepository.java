package OOPHW3;

//import lombok.Getter;
//import java.util.ArrayList;
import lombok.Data;
//@Getter
@Data

public class StudentRepository {
    private final StudentGroup studentGroup;


    public void addStudent(Student student) {
        studentGroup.addStudent(student);
    }
}
