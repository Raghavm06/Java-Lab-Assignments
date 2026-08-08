import java.util.ArrayList;

public class TodoList {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete Java Assignment");
        tasks.add("Practice Coding");
        tasks.add("Submit Lab Manual");

        StringBuffer list = new StringBuffer();

        list.append("To-Do List\n");

        for (int i = 0; i < tasks.size(); i++) {
            list.append(i).append(1).append(". ").append(tasks.get(i)).append("\n");
        }

        System.out.println(list);
    }
}