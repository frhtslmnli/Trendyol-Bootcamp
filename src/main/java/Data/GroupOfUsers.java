package Data;

import java.util.ArrayList;

public class GroupOfUsers {
    public ArrayList<User> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<User> group) {
        this.group = group;
    }

    ArrayList<User> group = new ArrayList<User>();
}
