import java.util.Scanner;

public class EditPhoneNumber implements MenuAction {

    private ImMemoryContacts contacts;
    private Scanner scanner;

    public EditPhoneNumber(ImMemoryContacts contacts, Scanner scanner){
        this.scanner = scanner;
        this.contacts = contacts;
    }

    @Override
    public String getName(){return "Змінити номер телефону"; }

    @Override
    public void execute() {
        System.out.println("Введіть новий номер телефону: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Введіть номер індексу контакту, номер якого ви хочете змінити: ");
        int index = scanner.nextInt() - 1;
        String newName = contacts.get(index).getName();
        Contact contact = new Contact(newName, phoneNumber);
        contacts.set(index, contact);
    }

    @Override
    public boolean closeAfter(){ return false; }
}
