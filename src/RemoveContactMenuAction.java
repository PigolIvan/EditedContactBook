import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {

    private ImMemoryContacts contacts;
    private Scanner scanner;

    public RemoveContactMenuAction(ImMemoryContacts contacts, Scanner scanner) {
        this.contacts = contacts;
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return "Видалити контакт";
    }

    @Override
    public void execute() {
        System.out.println("Виберіть контакт для видалення(1, 2, 3...)");
        int index = scanner.nextInt();
        contacts.remove(index - 1);
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
