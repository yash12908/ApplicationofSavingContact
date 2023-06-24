package phoneDrive;

import java.util.Arrays;
import java.util.Scanner;

public class phone 
{
	contactBook[] b=new contactBook[3];
	contactBook b1;
	Scanner sc=new Scanner(System.in);
	public void addContact()
	{
		for (int i = 0; i < b.length; i++) 
		{	
			if(b[i]==null)
			{
				System.out.println("Enter the name");
				String name=sc.next();
				System.out.println("Enter the number");
				int number=sc.nextInt();
				System.out.println("Enter the nick name");
				String nick=sc.next();
				b1=new contactBook(name,number,nick);
				for(int j=0;j<b.length;j++)
				{
					if(b[i]!=null)
					{
						contactBook B=b[i];
						if(B.getNumber()==number)
						{
							System.out.println("number  is alredy present");
							return;
						}
					}
				}
				b[i]=b1;
				System.out.println("contact is added");
				return;
			}
		}
		System.out.println("contact list is full");
	}
	public void removeContact()
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=null)
			{
				contactBook B=b[i];
				if(B.getNumber()==number)
				{
					b[i]=null;
					System.out.println("contact is remover");
					return ;
				}
			}
		}
		System.out.println("Contact is not present");
	}
	public void displayContact()
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=null) {
			System.out.println(b[i]);
			}
		}
		System.out.println("data is not present");
	}
	public void searchcontact()
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=null)
			{
				contactBook B=b[i];
				if(number==B.getNumber())
				{
					System.out.println(B.getName()+" "+B.getNumber()+" "+B.getNickname());
					return;
				}
			}
		}
		System.out.println("Id not Found");
	}
	public void sortingname()
	{
		try {
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("data is not present");
		}
	}
	@SuppressWarnings("unchecked")
	public void sortingnumber()
	{
		try {
			Arrays.sort(b,new contactBook());
			for(int i=0;i<b.length;i++)
			{
				System.out.println(b[i]);
			}
		}
		catch(NullPointerException n)
		{
			System.out.println("data is not present");
		}
	}
	@SuppressWarnings("unchecked")
	public void sortingnickname()
	{
		Arrays.sort(b,new sorting_nick_name());
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	}
}
