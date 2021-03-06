import java.time.LocalDate;
import java.util.ArrayList;

public class Group {


    public int id;
    private String name;
    private String area;
    private LocalDate createdAt;
    private static  ArrayList<Project> projects;
    private static  ArrayList<Group> groups;

    public static int countActiveProjects() {
        int p = Project.size();
        for (int i = 0; i<p; i++){
            Project.get(i).isActive();
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

