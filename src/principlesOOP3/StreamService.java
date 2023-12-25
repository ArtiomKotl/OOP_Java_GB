package principlesOOP3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public Stream getStream() {
        return stream;
    }

    public void removeGroup(Group group){
        for (Group groupItem : stream){
            if (stream.equals ( groupItem )){
                stream.remove ( groupItem );
            }
        }
    }

    public List<Group> getSortedGroup(){
        List<Group> groupList = new ArrayList<> (stream.getGroup ());
        Collections.sort ( groupList );
        return groupList;
    }
    public List<Group> getSortedStream(){
        List<Group> groupListList = new ArrayList<> (stream.getGroup ());
        groupListList.sort ( new StreamComparator () );
        return groupListList;
    }

}
