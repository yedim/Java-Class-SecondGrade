package IOExam;
//try-with-resources �� ����
//java io��ü�� �ν��Ͻ��� �����, ��� ����ϸ� close()�޼ҵ带 ȣ���ؾ� �Ѵ�.
//close()�޼ҵ带 ����ڰ� ȣ������ �ʴ���, Exception�� �߻����� �ʾҴٸ� �ڵ����� close()�� �ǰ� �� �� �ִ� ���

//data.txt�κ��� ���� �о�鿩 ȭ�鿡 ����ϴ� Ŭ����
//�پ��� Ÿ���� �����͸� �о �� �ִ� DataInputStream
//readInt() -������ �о���̴� �޼ҵ�
//readBoolean() - boolean ���� �о���̴� �޼ҵ�
//readDouble() - douboe ���� �о���̴� �޼ҵ�

//���Ͽ� ����� ������� �о� �鿩���Ѵ�.
//int, boolean, double������� �����Ͽ��� ������ �о���� ���� ���� ������ �о�� �Ѵ�.
import java.io.*;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				DataInputStream in=new DataInputStream(new FileInputStream("data.txt"));
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        ){
            out.writeInt(100);//data.txt�� �̻��ϰ� ���δ�.
            out.writeBoolean(true);
            out.writeDouble(50.5);
            out.writeDouble(10.11);

			int i= in.readInt();//data.txt�� �̻��ϰ� �����ִ� �͵��� ��ȯ�Ѵ�.
			boolean b= in.readBoolean();
			double d =in.readDouble();
			double d2=in.readDouble();
			
            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
            System.out.println(d2);
        }catch (Exception e) {
            e.printStackTrace();
        }
	}

}
