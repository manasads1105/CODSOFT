package project_1;
import java.util.Scanner;
		class BankAccount 
		{
		    private double balance;

		    public BankAccount(double initialBalance)
		    {
		        balance = initialBalance;
		    }

		    public double getBalance() 
		    {
		        return balance;
		    }

		    public void deposit(double amount) 
		    {
		        if (amount > 0) {
		            balance += amount;
		        }
		    }

		    public boolean withdraw(double amount)
		    {
		        if (amount > 0 && amount <= balance) 
		        {
		            balance -= amount;
		            return true;
		        }
		        return false;
		    }
		}

		class ATMMachine {
		    private BankAccount account;

		    public ATMMachine(BankAccount userAccount) {
		        account = userAccount;
		    }

		    public void withdraw(double amount) {
		        if (account.withdraw(amount)) {
		            System.out.println("Amount is Withdrawed successfully. New balance amount is: $" + account.getBalance());
		        } else {
		            System.out.println(" Because of Insufficient funds or Invalid withdrawal amount.");
		        }
		    }

		    public void deposit(double amount) {
		        account.deposit(amount);
		        System.out.println("Amount is Deposited successfully. New balance amount is: $" + account.getBalance());
		    }

		    public void checkBalance() {
		        System.out.println("Current Balance: $" + account.getBalance());
		    }
		}

		public class ATM_Machine {

			public static void main(String[] args) {
		        BankAccount userAccount = new BankAccount(1000.0);
		        ATMMachine atm = new ATMMachine(userAccount);

		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("ATM Machine(Interface):");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Deposit");
		            System.out.println("3. Withdraw");
		            System.out.println("4. Exit");
		            System.out.print("Select an option: ");

		            int choice = scanner.nextInt();

		            switch (choice) 
		            {
		                case 1:
		                    atm.checkBalance();
		                    break;
		                case 2:
		                    System.out.print("Enter deposit amount: $");
		                    double depositAmount = scanner.nextDouble();
		                    atm.deposit(depositAmount);
		                    break;
		                case 3:
		                    System.out.print("Enter withdrawal amount: $");
		                    double withdrawalAmount = scanner.nextDouble();
		                    atm.withdraw(withdrawalAmount);
		                    break;
		                case 4:
		                    System.out.println("The amount is Withdrawed sucessfully. Thank you!");
		                    scanner.close();
		                    System.exit(0);
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please select a valid option.");
		            }
		            System.out.println();
		        }
		    }
         }
