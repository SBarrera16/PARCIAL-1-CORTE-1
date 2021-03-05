import java.time.LocalDate;

public class Group {


    public int id;
    private String name;
    private String area;
    private LocalDate createdAt;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
