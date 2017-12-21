package Bank;


class Bank
{
	private int money =10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void saveMoney(int save)
	{
		int m=this.getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m+save);
	}
	public void minusMoney(int minus)
	{
		int m=this.getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m-minus);
	}
}
class Family1 extends Thread
{
	public void run()
	{
		//synchronized(BankExam.mybank)
		{
			BankExam.mybank.saveMoney(5000);
		}
		System.out.println("saveMoney(5000) :"+BankExam.mybank.getMoney());
	}
}
class Family2 extends Thread
{
	public void run()
	{
		//synchronized(BankExam.mybank)
		{
			BankExam.mybank.minusMoney(2000);
		}
		System.out.println("minusMoney(2000) :"+BankExam.mybank.getMoney());
		
	}
}
public class BankExam {
	
	public static Bank mybank=new Bank();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� : "+mybank.getMoney());
		Family1 f1= new Family1();
		Family2 f2= new Family2();
		f1.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f2.start();
	}

}
