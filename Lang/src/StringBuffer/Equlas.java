package StringBuffer;

public class Equlas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer("100");
		Double d= new Double("100");
		Integer i2= new Integer("100");//공백들어가면  에러나더라
		
		if(i.equals(i2))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
		}
}
