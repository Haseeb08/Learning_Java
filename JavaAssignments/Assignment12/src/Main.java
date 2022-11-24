import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, (float) 70.8));
        stuList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, (float) 50.2));
        stuList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, (float) 90.3));
        stuList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        stuList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        stuList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        stuList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        stuList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        stuList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        stuList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        stuList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        stuList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, (float) 60.4));
        stuList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, (float) 45.6));
        stuList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, (float) 95.8));
        stuList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, (float) 88.4));
        stuList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, (float) 72.4));
        stuList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, (float) 57.5));

        // 1. Print the name of all departments in the college?
        stuList.stream().map(stu -> stu.engDepartment).distinct()
                .forEach(stu -> System.out.println(stu));
        System.out.println("");

        // 2. Get the names of all students who have enrolled after 2018?
        stuList.stream().filter(x -> x.enrollmentYear > 2018).forEach(y -> System.out.println(y.name));
        System.out.println("");

        // 3. Get the details of all male student in the computer sci department?
        stuList.stream().filter(stu -> stu.engDepartment == "Computer Science")
                .forEach(stu -> System.out.println(stu.name));
        System.out.println("");

        // 4. How many male and female student are there ?
        stuList.stream().filter(stu -> stu.engDepartment == "Computer Science" && stu.gender == "Male")
                .forEach(stu -> System.out.println(stu.name + " " + stu.gender));
        System.out.println("");

        // 7. Count the number of students in each department?
        System.out.println(stuList.stream().map(stu -> stu.gender)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println("");

        // 9. Get the details of youngest male student in the Electronic department?(
        System.out.println((stuList.stream().filter(stu -> stu.engDepartment == "Electronic" && stu.gender == "Male")
                .map(stu -> stu.age).collect(Collectors.minBy(Comparator.naturalOrder()))).get());
        System.out.println("");
    }

}