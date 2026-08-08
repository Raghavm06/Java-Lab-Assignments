import java.util.ArrayList;

public class CourseRegistration {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Programming with Java");
        courses.add("Database Management System");
        courses.add("Operating Systems");

        courses.remove("Database Management System");

        StringBuffer list = new StringBuffer();

        list.append("Registered Courses\n");

        for (String course : courses) {
            list.append("- ").append(course).append("\n");
        }

        System.out.println(list);
    }
}