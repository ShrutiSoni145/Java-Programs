//import static java.util.*;// this will not work.
//import static java.lang.*;//this will not work.
import java.util.Scanner;
import static java.lang.System.*;
class Acco {
	static Scanner s = new Scanner(in);
	final int acno;
	String name;
	double balance;

	Acco(int r) {
		acno = r;
		out.println("Enter your name:");
		name = s.nextLine();
		balance = 0.0;
		System.out.println("your account have been successfully created and your account number is:"+r);
	}

	void getDetails() {
		out.println("Account No=" + acno);
		out.println("Name=" + name);
		out.println("balance=" + balance);
	}

	void deposit(int ammount) {
		balance += ammount;
	}

	void withdraw(int ammount) {
		balance -= ammount;
	}

	void getlist(Acco a1[]) {
		int i = 1;
		for (Acco x : a1) {
			out.println((i++) + "   " + x.acno + "  " + x.name);
		}
	}

	public static void main(String args[]) {
		//static Scanner s=new Scanner(in);
		out.println("how many accounts you want to open: ");
		int size = s.nextInt();
		s.nextLine();
		Acco a[] = new Acco[size];
		int i;
		int amt;
		int ac;
		int n;
		int r = 100;

		for (i = 0; i < size; i++) {
			r += 1;
			a[i] = new Acco(r);
			//a[i].setAccount();
		}
		//out.println("Enter value of n except 0");
		//n = s.nextInt();
		while (true) {
			//out.println("press 1 for creating bancking account.");
			out.println("press 1 for getting details of your account.");
			out.println("press 2 for depositing the ammount.");
			out.println("press 3 for withdrawing the ammount.");
			out.println("press 4 for getting the list of account holders.");
			out.println("press 5 for exiting.");
			out.println("Enter your choice:");
			int c = s.nextInt();
			//case 1:a[i].setAccount();
			//break;


			switch (c) {
				case 1:
					out.println("Enter your account no for getting details:");
					ac = s.nextInt();
					for (i = 0; i < size; i++) {
						if (ac == a[i].acno) {
							a[i].getDetails();
						}
					}
					break;
				case 2:
					out.println("Enter your account no for depositing:");
					ac = s.nextInt();
					for (i = 0; i < size; i++) {
						if (ac == a[i].acno) {
							out.println("Enter ammount to deposit:");
							amt = s.nextInt();
							a[i].deposit(amt);
						}

					}
					//if (i == size - 1) {

						break;
						case 3:
							out.println("Enter your account no for withdrawing:");
							ac = s.nextInt();
							for (i = 0; i < size; i++) {
								if (ac == a[i].acno) {
									out.println("Enter ammount to withdraw:");
									amt = s.nextInt();
									a[i].withdraw(amt);
								}
							}
							break;
						case 4:
							a[i].getlist(a);
							break;
						case 5:
							exit(0);
					}
					//String e=s.next("Type "exit" if you want to exit from this program"); //will give you an error:1. ) expected.
					//2. ; expected.
					//out.println("enter 0 to exit. ");
					//n = s.nextInt();

			}
		}
}
		