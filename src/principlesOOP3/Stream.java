package principlesOOP3;


import java.util.Iterator;
import java.util.List;


public class Stream  implements Iterable<Group>  {
   private List<Group> streamGroup;


    public Stream( List<Group> streamGroup) {
        this.streamGroup = streamGroup;
    }

    public List<Group> getGroup() {
        return streamGroup;
    }
    public void addGroup(Group group) {streamGroup.add ( group );}


    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator ( (List<Group>) this );


    }

    public void remove(Group group){
        streamGroup.remove ( group );
    }
}
