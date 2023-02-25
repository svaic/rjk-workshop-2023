package cas4_p;

import java.util.Scanner;

public class TelephoneMain {

    public static void main(String[] args) {
        Contact contact1 = new Contact("Luka", "070123123");
        Contact contact2 = new Contact("Luka2", "071231230");
        Contact contact3 = new Contact("Luka3", "072312301");
        Contact contact4 = new Contact("Luka4", "073123012");
        Contact contact5 = new Contact("Luka5", "071230123");

        TelephoneBook telephoneBook = new TelephoneBook();

        Scanner scanner = new Scanner(System.in);

        System.out.println("read");
        System.out.println("Do you want to fill the phonebook? yes/no");

        if (scanner.next().equals("yes")) {

            String command = scanner.next();
            while (!command.equals("done")) {

                String name = command;

                if (!(name.isBlank() || name.isEmpty())) {

                    String number = scanner.next();
                    if (!(number.isBlank() || number.isEmpty())) {
                        telephoneBook.addContact(new Contact(name, number));
                    } else {
                        System.out.println("greska br");
                    }

                } else {
                    System.out.println("greska ime");
                }

                command = scanner.next();
            }

        } else {
            telephoneBook.addContact(contact1);
            telephoneBook.addContact(contact2);
            telephoneBook.addContact(contact3);
            telephoneBook.addContact(contact4);
            telephoneBook.addContact(contact5);
        }

        telephoneBook.print();


    }

    public static void Update(TelephoneBook telephoneBook) {
        Scanner scanner = new Scanner(System.in);

        // update
        System.out.println("update");
        String command = scanner.next();
        while (!command.equals("done")) {

            if (isInteger(command) && scanner.hasNextInt()) {

                int index = Integer.parseInt(command);
                String newNumber = scanner.next();

                if (index - 1 < telephoneBook.getContacts().size()) {

                    System.out.println("dali sakate i imeto da go smenite?");
                    if (scanner.next().equals("yes")) {
                        String name = scanner.next();
                        name = name.trim();
                        if (!name.isBlank()) {
                            telephoneBook.updateContact(index, name, newNumber);
                        }
                    } else {
                        telephoneBook.updateContact(index, newNumber);
                    }
                } else {
                    System.out.println("nema tolku elementi vo telefonskiot imenik");
                }

            } else {
                System.out.println("vnesen e pogresen format obidete se povtorno");
            }

            telephoneBook.print();

            command = scanner.next();
        }
    }

    public static boolean isInteger(String value) {

        boolean isInteger = true;

        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            isInteger = false;
        }

        return isInteger;
    }
}
