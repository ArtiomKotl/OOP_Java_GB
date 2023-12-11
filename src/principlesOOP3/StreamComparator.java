package principlesOOP3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Group>{


    @Override
    public int compare(Group o1, Group o2) {
        if (o1.getStudentGroupList ().equals ( o2 )) {
            return o2.compareTo ( o1 );
        } else {
            return o1.compareTo ( o2 );

        }
    }
}