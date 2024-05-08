import java.util.ArrayList;

public class ImMemoryContacts {

    private int index;
    private ArrayList<Contact> contacts = new ArrayList<>();

    public ArrayList<Contact> getAll(){
        return contacts;
    }

    public void add(Contact contact){
        contacts.add(contact);
    }

    public void remove(int index){
        contacts.remove(index);
    }

    public void set(int index, Contact contact) { contacts.set(index, contact); }

    public Contact get(int index) { return contacts.get(index);}
}
