package OOPHW3;

import lombok.Data;
///import lombok.Getter;
///import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//@Getter
//@ToString
@Data
public class StudentGroup implements Iterable<Student> {

    List<Student> studentList;

    public StudentGroup(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentList);
    }
}
