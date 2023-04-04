import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable<Contact> {
    private ArrayList<Contact> myList = new ArrayList<>();

    public People() {
    }

    public void addContact(Contact a){
        myList.add(a);
    }


    @Override
    public String toString() {
        return "Classroom{" +
                "myList=" + myList +
                '}';
    }


    @Override
    public Iterator<Contact> iterator() {
        return myList.iterator();
    }



}
