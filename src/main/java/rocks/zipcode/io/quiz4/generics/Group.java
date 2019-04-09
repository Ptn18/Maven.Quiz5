package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable{

    ArrayList<_> myList;

    public Group() {
        this.myList = new ArrayList<>();
    }

    public Integer count() {
        return myList.size();
    }

    public void insert(_ value) {
        myList.add(value);
    }

    public Boolean has(_ value) {
        return myList.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return myList.get(indexOfValue);
    }

    public void delete(_ value) {
        myList.remove(value);
    }

    public void clear() {
        myList.clear();
    }

    public Iterator<_> iterator() {
        return myList.iterator();
    }
}
