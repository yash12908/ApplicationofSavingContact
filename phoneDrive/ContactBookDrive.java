package phoneDrive;

import java.util.Scanner;

public class ContactBookDrive 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		phone p=new phone();
		for(;;)
		{
			System.out.println("1:-add contact 2:-remove contact 3:-display contact 4:-search contact 5:-sorting name 6:- sortnumber 7:- sorting_nick_name 8:-exit");
			switch(sc.nextInt())
			{
			case 1:
				p.addContact();
				break;
			case 2:
				p.removeContact();
				break;
			case 3:
				p.displayContact();
				break;
			case 4:
				p.searchcontact();
				break;
			case 5:
				p.sortingname();
				break;
			case 6:
				p.sortingnumber();
				break;
			case 7:
				p.sortingnickname();
				break;
			case 8:
			System.out.println("Application is closed");
			return ;
			}
		}
	}
}
