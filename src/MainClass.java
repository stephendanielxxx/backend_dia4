import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //while loop
        int i = 0;
        while (i < 5){
            System.out.println("Loop ke "+i);
            i++;
        }

        //for loop
        for (int x = 0; x < 5; x++) {
            System.out.println("Loop ke " + x);
            if (x == 2) {
                break;
            }
        }

//        String name = "Dani";
//        if(name.equals("Dani")){
//            System.out.println("Nama Dani");
//        }else {
//            System.out.println("Bukan Dani");
//        }

        int age = 7;
        if (age < 5) {
            System.out.println("Umur di bawah 5 tahun");
        } else if (age > 8) {
            System.out.println("Umur di atas 8 tahun");
        } else {
            System.out.println("Umur berapa?");
        }

        String name = "Dani";
        switch (name) {
            case "Dani":
                System.out.println("Nama Dani");
            case "Anton":
                System.out.println("Nama Anton");
                break;
            case "Stephen":
                System.out.println("Nama Stephen");
                break;
            default:
                System.out.println("Nama Lainnya");
                break;
        }

        //Array
        String[] abjad = {"a", "b", "c", "d", "e"};

        List<String> hurufHidup = new ArrayList<>();
        hurufHidup.add("a"); //index 0
        hurufHidup.add("i"); //index 1
        hurufHidup.add("u"); //index 2
        hurufHidup.add("i"); //index 3

        //get data from array n list
        System.out.println(abjad[0]);
        System.out.println(hurufHidup.get(1));

        // key value pair
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Dani");

        String nameDani = hashMap.get("name");
        System.out.println(nameDani);

        // *******************
        //Java - Stream

        //for each
        hurufHidup.forEach(huruf -> {
            System.out.println(huruf);
        });

        //map
        List<String> collect = hurufHidup.stream().map(huruf -> {
            return huruf + ".txt";
        }).collect(Collectors.toList());

        collect.forEach(System.out::println);

        //filter
        List<String> collect1 = hurufHidup.stream()
                .filter(huruf -> huruf.contains("i")).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        //find first
        Optional<String> first = hurufHidup.stream().findFirst();
        if (first.isPresent()) {
            System.out.println(first.get());
        }

        //distinct
        List<String> distinctCollection = hurufHidup.stream().distinct()
                .collect(Collectors.toList());
        distinctCollection.forEach(System.out::println);

        try {
            System.out.println(abjad[0]);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally");
        }

//        Person person = new Person("Dani", 17,"dani.gmail.com");
//        person.setName("Anton");
//        person.setAge(18);
//        person.setEmail("dani.gmail.com");
//
//
//        System.out.println(person.getName());
//        System.out.println(person.getAge());

//        try {
//            person.validateEmail();
//        }catch (com.ideaco.backend.EmailNotValidException e){
//            System.out.println(e);
//        }

        Teacher anggi = new Teacher("Anggi", 17, "anggi@gmail.com");
        anggi.setMataPelajaran("Agile");

        anggi.study("Agile");

        anggi.sleep(6);
        anggi.walk("Jakarta");

        String schoolName = Teacher.SCHOOL_NAME;

//        Student anton = new Student();
//        anton.study("Backend");
    }
}
