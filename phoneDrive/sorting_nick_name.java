package phoneDrive;

import java.util.Comparator;

public class sorting_nick_name implements Comparator
{
	public int  compare(Object o,Object o1)
	{
		contactBook B=(contactBook)o;
		contactBook b1=(contactBook)o1;
		//one way :-
		return B.getNickname().compareTo(b1.getNickname());
		//another way to do
//		if(B.getNickname().equals(b1.getNickname()))
//		{
//			return 1;
//		}
//		else if(B.getNickname().equals(b1.getNickname()))
//		{
//			return 0;
//		}
//		else
//		{
//			return -1;
//		}
	}
}
