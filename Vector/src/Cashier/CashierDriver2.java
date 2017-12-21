package Cashier;

import java.util.Vector;

class Customer2 {
	String name;

	public Customer2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
} //class

class Queue {
	Vector q = new Vector(10);

	public boolean isEmpty() {
		return q.isEmpty(); // �⺻�޼ҵ�
	}

	public Object dequeue() throws QueueEmptyException {
		if (isEmpty() == true) {
			throw new QueueEmptyException();
		}
		Object obj = q.firstElement(); // �⺻�޼ҵ�
		q.removeElement(obj); // �⺻�޼ҵ�
		return obj;
	}

	public void enqueue(Object obj) {
		q.addElement(obj); // �⺻�޼ҵ�
	}
} //class

class QueueEmptyException extends Exception {
	public QueueEmptyException() {
	}

	public QueueEmptyException(String msg) {
		super(msg);
	}
} //class

class Cashier {
	Queue customerQueue = new Queue();

	public void addCustomer2(Customer2 customer) { // �մ� �߰��ϱ�
		customerQueue.enqueue(customer);
	};

	public void getNextCustomer() {
		Customer2 cust;

		try {
			cust = (Customer2) (customerQueue.dequeue());
			System.out.println(cust.getName() + "���� ����ϼ̽��ϴ�.");
		} catch (QueueEmptyException e) {
			System.out.println("��ٸ��� ���� ��� ����� �� �����ϴ�.");
		}
	} //getNextCustomer
} // class

public class CashierDriver2 {
	public static void main(String[] args) {
		Cashier cs = new Cashier();

		cs.addCustomer2(new Customer2("��1"));
		cs.addCustomer2(new Customer2("��2"));
		cs.addCustomer2(new Customer2("��3"));

		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
	}
}
