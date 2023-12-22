import com.ideaco.backend.PrintUtils;

public class Student implements StudyInterface, RestInterface{
    @Override
    public void study(String mataPelajaran) {
//        System.out.println("Print Utils : Student is studying "+mataPelajaran);
        PrintUtils.printData("Student is studying "+mataPelajaran);
    }

    public void study(String mataPelajaran, Teacher teacher){

    }

    public void study(int studyTime){

    }

    @Override
    public void rest(int minute) {

    }

}
