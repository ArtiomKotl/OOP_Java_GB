package principlesOOP3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator {

    private final List<Group> streams;
    private int counter;

    public StreamIterator(List<Group> streams) {
        this.streams = streams;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < streams.size ();
    }

    @Override
    public Object next() {
        if (hasNext ())
            return streams.get ( counter++ );
        return null;
    }

    @Override
    public void remove() {
        streams.remove ( counter );
    }
}
