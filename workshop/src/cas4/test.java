package cas4;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        PhoneBook telephoneBook = new PhoneBook();

        Scanner in = new Scanner(System.in);

        System.out.println("dali sakame da go popolnime imenikot yes/no");

        if (in.nextLine().equals("yes")) {
            System.out.println("vnesi ime ili done koga ke zavrsis");
            String input = in.nextLine();
            while (!input.equals("done")) {
                if (!input.isBlank()) {
                    System.out.println("vnesi broj");
                    String number = in.nextLine();
                    if (!number.isBlank()) {
                        Contact newContact = new Contact(input, number);
                        telephoneBook.add(newContact);
                    } else {
                        System.out.println("gresen vnes na broj");
                    }
                } else {
                    System.out.println("gresen vnes na ime");
                }

                System.out.println("vnesi ime ili done koga ke zavrsis");
                input = in.nextLine();
            }
        } else {
            Contact contact1 = new Contact("ime1", "070324234");
            Contact contact2 = new Contact("ime2", "070123456");
            Contact contact3 = new Contact("ime3", "070321238");
            Contact contact4 = new Contact("ime4", "070324312");
            Contact contact5 = new Contact("ime5", "0703321234");

            telephoneBook.add(contact1);
            telephoneBook.add(contact2);
            telephoneBook.add(contact3);
            telephoneBook.add(contact4);
            telephoneBook.add(contact5);
        }

        telephoneBook.print();

        String input = in.nextLine();

        while (!input.equals("done")) {

            String[] commands = input.split(" ");

            if (!(commands.length == 2)) {
                System.out.println("greska vo vnesot na komandata");

                input = in.nextLine();
                continue;
            }

            if (!(isNumber(commands[0]) && Integer.parseInt(commands[0]) < telephoneBook.getContacts().size())) {
                System.out.println("greska broj");

                input = in.nextLine();
                continue;
            }

            int index = Integer.parseInt(commands[0]);
            String number = commands[1];

            System.out.println("dali sakate i ime da vnesete?");
            String ifShouldPassName = in.nextLine();

            if (ifShouldPassName.equals("yes")) {
                String name = in.nextLine();

                if (!(!name.isEmpty() && !name.contains(" "))) {
                    System.out.println("pogresno ime");

                    input = in.nextLine();
                    continue;
                }

                telephoneBook.update(index, name, number);
            } else {
                telephoneBook.update(index, number);
            }

            telephoneBook.print();
            input = in.nextLine();
        }
    }

    public static boolean isNumber(String stringNumber) {
        for (int i=0;i < stringNumber.length(); i++) {
            if (!Character.isDigit(stringNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isNumber2(String stringNumber) {
        try {
            Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

