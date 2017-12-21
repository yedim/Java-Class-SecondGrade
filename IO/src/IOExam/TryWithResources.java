package IOExam;
//try-with-resources 블럭 선언
//java io객체는 인스턴스를 만들고, 모두 사용하면 close()메소드를 호출해야 한다.
//close()메소드를 사용자가 호출하지 않더라도, Exception이 발생하지 않았다면 자동으로 close()가 되게 할 수 있는 방법

//data.txt로부터 값을 읽어들여 화면에 출력하는 클래스
//다양한 타입의 데이터를 읽어낼 수 있는 DataInputStream
//readInt() -정수를 읽어들이는 메소드
//readBoolean() - boolean 값을 읽어들이는 메소드
//readDouble() - douboe 값을 읽어들이는 메소드

//파일에 저장된 순서대로 읽어 들여야한다.
//int, boolean, double순서대로 저장하였기 때문에 읽어들일 때도 같은 순서로 읽어여야 한다.
import java.io.*;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				DataInputStream in=new DataInputStream(new FileInputStream("data.txt"));
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
        ){
            out.writeInt(100);//data.txt에 이상하게 쓰인다.
            out.writeBoolean(true);
            out.writeDouble(50.5);
            out.writeDouble(10.11);

			int i= in.readInt();//data.txt에 이상하게 쓰여있는 것들을 반환한다.
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
