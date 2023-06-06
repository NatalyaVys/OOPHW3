package OOPHW3;

import lombok.Data;

@Data
public class StudentController {

    private final StudentGroupService groupService;

    public StudentController(StudentGroupService groupService) {
        this.groupService = groupService;
    }

    public boolean deleteStudent(String fullName){
        groupService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student){
        groupService.addStudent(student);
    }

    public void printAll(){
        groupService.printAll();
    }

    public void compareTo(){
        groupService.compareTo();
    }

    public void sortBySecondName(){
        groupService.sortBySecondName();
    }

    public void sortByid(){
        groupService.sortByid();
    }

}
