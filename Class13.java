import java.util.Scanner;
class Exception520 extends Exception
{
	
}
public class Class13 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try 
		{
			String str="";
			Scanner sc=new Scanner(System.in);
			System.out.println("�п�J:");
			str=sc.nextLine();
			if(str.equals("520"))
				throw new Exception520();
			else
				System.out.println("String="+str);
		}
		catch(Exception520 e)
		{
			System.out.println("�o�O�Ѧr��520�Ҥް_���ҥ~");
		}
	}

}
