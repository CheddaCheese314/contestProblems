import java.io.File;
import java.util.*;

public class elfEspionage 
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("ee.in"));
		int times = file.nextInt();
		file.nextLine();
		
		boolean ja = false;
		boolean jb = false;
		
		boolean ca = false;
		boolean cb = false;
		
		for(int x=1; x<=times;x++)
		{
			String bell = file.nextLine();
			if(bell.length()>0)
			{
				if(x%2 == 0)
				{
					if(bell.contains("winks"))
					{
						ca = true;
					}
					else if(bell.contains("checks watch"))
					{
						cb = true;
					}
				}
				else
				{
					if(bell.contains("winks"))
					{
						ja = true;
					}
					else if(bell.contains("checks watch"))
					{
						jb = true;
					}
				}
			}
		}
		if(ja&&jb)
		{
			System.out.println("JINGLE IS A SPY");
		}
		else if(ca&&cb)
		{
			System.out.println("GUMDROP IS A SPY");
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		new elfEspionage().run();
	}
}
