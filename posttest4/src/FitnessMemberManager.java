import java.util.ArrayList;
import java.util.Scanner;
public class FitnessMemberManager {
    private ArrayList<FitnessMember> members;
    private Scanner scanner;

    public FitnessMemberManager() {
        members = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Update Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    viewMembers();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void addMember() {
        System.out.println("Enter member name:");
        String name = scanner.nextLine();
        System.out.println("Enter member age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter member gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter membership type:");
        String membershipType = scanner.nextLine();
        System.out.println("Enter member phone number:");
        String phoneNumber = scanner.nextLine();

        FitnessMember member = new FitnessMember(name, age, gender, membershipType, phoneNumber);
        members.add(member);

        System.out.println("Member added successfully!");
    }

    public void viewMembers() {
        if (members.size() == 0) {
            System.out.println("No members found!");
            return;
        }

        System.out.println("List of members:");
        for (FitnessMember member : members) {
            System.out.println("Name: " + member.getName());
            System.out.println("Age: " + member.getAge());
            System.out.println("Gender: " + member.getGender());
            System.out.println("Membership Type: " + member.getMembershipType());
            System.out.println("Phone Number: " + member.getPhoneNumber());
            System.out.println("------------------------");
        }
    }

    public void updateMember() {
        System.out.println("Enter member name to update:");
        String name = scanner.nextLine();
        boolean found = false;

        for (FitnessMember member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                System.out.println("Enter new member name:");
                String newName = scanner.nextLine();
                System.out.println("Enter new member age:");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter new member gender:");
                String newGender = scanner.nextLine();
                System.out.println("Enter new membership type:");
                String newMembershipType = scanner.nextLine();
                System.out.println("Enter new member phone number:");
                String newPhoneNumber = scanner.nextLine();

                member.setName(newName);
                member.setAge(newAge);
                member.setGender(newGender);
                member.setMembershipType(newMembershipType);
                member.setPhoneNumber(newPhoneNumber);

                System.out.println("Member updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found!");
        }
    }

    public void deleteMember() {
        System.out.println("Enter member name to delete:");
        String name = scanner.nextLine();
        boolean found = false;

        for (FitnessMember member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                members.remove(member);
                System.out.println("Member deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found!");
        }
    }

    public void exit() {
        System.out.println("Goodbye!");
        scanner.close();
        System.exit(0);
    }
}
