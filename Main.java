import java.util.Scanner;

abstract class Bank {
    public String name = "uco bank";
    public String IFSCCODE = "UCBA0001544";

    public void bankdetails() {
        System.out.println("Bank: " + name + " | IFSC CODE: " + IFSCCODE);
    }

    abstract void deposit();

    abstract void withdraw();

    abstract void checkbalance();

    abstract void bankdetaile();
}

class BankService extends Bank {
    private double bal = 10000;
    private int pwd;

    public void deposit() {
        System.out.print("Enter your bank password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 9109) {
            System.out.print("Enter your deposit amount: ");
            double money = s.nextDouble();
            bal += money;
            System.out.println("Deposit amount: " + money);
            System.out.println("Total balance: " + bal);
        } else {
            System.out.println("Incorrect bank password.");
        }
    }

    public void withdraw() {
        System.out.print("Enter your password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 9109) {
            System.out.print("Enter your withdraw amount: ");
            double money = s.nextDouble();
            if (bal >= money) {
                bal -= money;
                System.out.println("Withdraw amount: " + money);
                System.out.println("Total balance: " + bal);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Incorrect password.");
        }
    }

    public void checkbalance() {
        System.out.print("Enter your password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 9109) {
            System.out.println("Total balance: " + bal);
        } else {
            System.out.println("Incorrect password.");
        }
    }

    public void bankdetaile() {
        System.out.print("Enter your bank password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd == 9109) {
            System.out.println("Customer Name: DEEPAK KUSHWAH");
            System.out.println("Account Type: SAVINGS");
            System.out.println("Father's Name: NANDRAM KUSHWAH");
            System.out.println("Mother's Name: RAJPATI KUSHWAH");
            System.out.println("Address: RAMGARH KUSHWAH CHHATRAVASH DABDRA GWALIOR MP (475110)");
            System.out.println("Aadhar No.: 959624878125");
            System.out.println("Account No.: 15443211013297");
            System.out.println("IFSC Code: UCBA0001544");
            System.out.println("Mobile No.: 9109001109");
            System.out.println("Branch Name: SHUKALHARI");
        } else {
            System.out.println("Incorrect password.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankService b = new BankService();
        b.bankdetails();
        Scanner s = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Details");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    b.deposit();
                    break;
                case 2:
                    b.withdraw();
                    break;
                case 3:
                    b.checkbalance();
                    break;
                case 4:
                    b.bankdetaile();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (ch != 0);
    }
}
