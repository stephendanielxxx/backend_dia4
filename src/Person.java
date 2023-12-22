import com.ideaco.backend.EmailNotValidException;

public abstract class Person {
    private String name; //alt + insert
    private int age; //Integer
    private String email;

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void walk(String destination){
        System.out.println("Person "+destination);
    }

    public boolean validateEmail() throws EmailNotValidException {
        if(email.contains("@")){
            return true;
        }else {
            throw new EmailNotValidException("Email not valid");
        }
    }

    public abstract void sleep(int sleepTime);
}
