class Ctest
{
	public static void test(int num,int den) throws ArithmeticException
	{
		System.out.println(num/den);
	}
}

public class Class08 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try
		{
			Ctest.test(20,10);
		}
		catch(ArithmeticException e)
		{
			System.out.println("���Ƭ�0");
		}
		finally
		{
			System.out.println("end of main() method!");
		}
	}

}
