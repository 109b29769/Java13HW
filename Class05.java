
public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num=12;
			int den[]= {12,0,3,0,0,4};
			for(int i=0;i<10;i++)
			{
				System.out.println("ans="+num/den[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�}�C�W�X�d��");
		}
		catch(ArithmeticException e)
		{
			System.out.println("���Ƭ�0");
		}
		finally 
		{
			System.out.println("end of main()!!");
		}


}
}