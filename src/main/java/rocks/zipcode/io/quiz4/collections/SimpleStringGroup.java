package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String>{
    ArrayList<String> myList;

    public SimpleStringGroup() {
        this.myList = new ArrayList<>();
    }

    public Integer count() {

        return myList.size();
    }

    public void insert(String string) {
        myList.add(string);

    }

    public Boolean has(String string) {
        if(myList.contains(string)){
            return true;
        }
        return false;
    }

    public String fetch(int indexOfValue) {
        return myList.get(indexOfValue);
    }

    public void delete(String string) {
            myList.remove(string);
    }

    public void clear() {
        myList.clear();
    }

    @Override
    public Iterator iterator() {
        return myList.iterator();
    }
}
