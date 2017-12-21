package Cashier;

import java.util.Vector;

class VectorOutOfIndexException extends Exception
{
	public VectorOutOfIndexException()
	{
		System.out.println("10명이 넘음");
	}	
}
class NoCustomerException extends Exception
{
	public NoCustomerException()
	{
		System.out.println("고객이 없습니다.");
	}
}
class Casher
{
    Vector<String> ctName = new Vector<String>(10);
	public void addCustomer(Customer a) throws VectorOutOfIndexException
	{
		if(ctName.size()>=10)  throw new VectorOutOfIndexException();
		ctName.addElement(a.name);
	}
	public void getNextCustomer() throws NoCustomerException
	{
		if(ctName.isEmpty()==true) throw new NoCustomerException();
		System.out.println(ctName.firstElement()+"계산 완료");
		ctName.removeElementAt(0);
	}
	
}
class Customer
{
	String name;
	public Customer(String name)
	{
		this.name=name;
	}
}
public class CashierDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Casher cs = new Casher();
			//줄서기
			cs.addCustomer(new Customer("고객1"));
			cs.addCustomer(new Customer("고객2"));
			cs.addCustomer(new Customer("고객3"));

			//서비스하기
			cs.getNextCustomer();
			cs.getNextCustomer();//다음 손님~
			cs.getNextCustomer();
			cs.getNextCustomer();//예외 발생

		} 
		catch (VectorOutOfIndexException e) 
		{
			
		}
		catch(NoCustomerException e)
		{
			
		}
		
		

	}

}
