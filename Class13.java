import java.util.Scanner;
class Exception520 extends Exception
{
	
}
public class Class13 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		try 
		{
			String str="";
			Scanner sc=new Scanner(System.in);
			System.out.println("請輸入:");
			str=sc.nextLine();
			if(str.equals("520"))
				throw new Exception520();
			else
				System.out.println("String="+str);
		}
		catch(Exception520 e)
		{
			System.out.println("這是由字串520所引起的例外");
		}
	}

}
