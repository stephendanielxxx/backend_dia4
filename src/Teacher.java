import com.ideaco.backend.PrintUtils;

public class Teacher extends Person implements StudyInterface {
    private String mataPelajaran;
    public static final String SCHOOL_NAME = "SMA BPK Penabur";
    public Teacher(String name, int age, String email) {
        super(name, age, email);
    }

    @Override
    public void sleep(int sleepTime) {
        System.out.println("Teacher sleep "+sleepTime+" hour(s)");
    }

    @Override
    public void walk(String destination) {
//        super.walk(destination);
        System.out.println("Teacher walk to "+destination);
    }

    public String getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public void study(String mataPelajaran) {
//        System.out.println("Print Utils : Teacher is studying "+mataPelajaran);
        PrintUtils.printData("Teacher is studying "+mataPelajaran);
    }

}
