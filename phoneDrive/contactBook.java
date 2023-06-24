package phoneDrive;

import java.util.Comparator;

public class contactBook implements Comparable,Comparator
{
	private String name;
	private int number;
	private String nickname;
	
	public contactBook(String name, int number, String nickname) {
		super();
		this.name = name;
		this.number = number;
		this.nickname = nickname;
	}
	
	public contactBook() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String toString()
	{
		return name+" "+number+" "+nickname;
	}
	public int HashCode()
	{
		return name.hashCode()+number+nickname.hashCode();
	}
	public boolean equals(Object o)
	{
		contactBook B=(contactBook)o;
		if(this.HashCode()==B.hashCode())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int compareTo(Object o)
	{
		contactBook B=(contactBook)o;
		int a=this.name.compareTo(B.name);
		return a;
	}
	public int compare(Object o,Object o1)
	{
		contactBook b=(contactBook)o;
		contactBook b1=(contactBook)o1;
		if(b.number>b1.number)
		return 1;
		else if(b.number==b1.number)
			return 0;
		else
		{
			return -1;
		}
	}
}
