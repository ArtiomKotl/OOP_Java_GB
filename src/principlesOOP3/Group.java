package principlesOOP3;

import java.util.List;

public class Group implements Comparable<Group>{
    private int groupId;
    private List<Student> studentGroupList;

    public Group(int groupId, List<Student> studentGroupList) {
        this.groupId = groupId;
        this.studentGroupList = studentGroupList;
    }

    public int getGroupId() {
        return groupId;
    }

    public List<Student> getStudentGroupList() {
        return studentGroupList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "\n groupId=" + groupId +
                ", studentGroupList = " + studentGroupList +
                '}';
    }


    @Override
    public int compareTo(Group o) {
        if (o.getGroupId () > groupId)
            return -1;
        if (o.getGroupId () < groupId)
            return 1;
        return 0;
    }
}
