
class RadiusIsNegatvie extends Exception//�ۭq�ҥ~���O
{
	
}
class RadiusTooLarge extends Exception
{
	
}
class CCircle
{
	private double radius;
	public void setRadius(double r) throws RadiusIsNegatvie,RadiusTooLarge
	{
		if(r<0)
		{
			throw new RadiusIsNegatvie();
		}
		else if(r>100)
		{
			throw new RadiusTooLarge();
		}
		else 
		{
			radius=r;
		}
	}
	public void show()
	{
			System.out.println("area="+3.14*radius*radius);
	}
}
	

public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle cir=new CCircle();
		try
		{
			cir.setRadius(-1);
		}
		catch(RadiusIsNegatvie e)
		{
			System.out.println(e+" throwed");
		}
		catch(RadiusTooLarge e)
		{
			System.out.println(e+" throwed");
		}
		finally
		{
			
		}
	}
}



