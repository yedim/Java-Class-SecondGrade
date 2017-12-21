package Cashier;

import java.util.Vector;

class VectorOutOfIndexException extends Exception
{
	public VectorOutOfIndexException()
	{
		System.out.println("10���� ����");
	}	
}
class NoCustomerException extends Exception
{
	public NoCustomerException()
	{
		System.out.println("���� �����ϴ�.");
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
		System.out.println(ctName.firstElement()+"��� �Ϸ�");
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
			//�ټ���
			cs.addCustomer(new Customer("��1"));
			cs.addCustomer(new Customer("��2"));
			cs.addCustomer(new Customer("��3"));

			//�����ϱ�
			cs.getNextCustomer();
			cs.getNextCustomer();//���� �մ�~
			cs.getNextCustomer();
			cs.getNextCustomer();//���� �߻�

		} 
		catch (VectorOutOfIndexException e) 
		{
			
		}
		catch(NoCustomerException e)
		{
			
		}
		
		

	}

}
