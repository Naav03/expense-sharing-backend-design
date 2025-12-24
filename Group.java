import java.util.List;

public class Group {
    private String groupId;
    private String name;
    private List<User> members;

    public Group(String groupId, String name, List<User> members) {
        this.groupId = groupId;
        this.name = name;
        this.members = members;
    }
}
