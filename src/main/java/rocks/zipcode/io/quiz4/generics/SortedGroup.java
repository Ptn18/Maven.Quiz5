package rocks.zipcode.io.quiz4.generics;


/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    @Override
    public void insert(_ value) {
        myList.add(value);
    }

    @Override
    public void delete(_ value) {
        myList.remove(value);
    }

    public Integer indexOf(_ value) {
        return myList.indexOf(value);
    }
}
