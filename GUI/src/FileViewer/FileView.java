package FileViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//�������̽� =>actionPerformed 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class FileView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("���� ���");//�����츦 ���� ����ǥ������ �̸�
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݴ� ���ۿ� ���� �Ӽ�����. �����츦 close�� ��� : system exit
		window.setContentPane(new ViewFileGUI());//l�� ����. �Ӽ��ʱ�ȭ: �Ϲ������� �����ڸ޼���� �Բ� ��� .ViewFileGuI�Լ��� �����̴�.�� ����Ŵ�
		window.pack();//�ڵ����� ������ ������ ����, or���� �ֱ��� �������
		window.setVisible(true);//ȭ�鿡 ���̱�
	}
}//end of mainClass

class ViewFileGUI extends JPanel//JFrame�ȿ� JPanel���δٰ� ����
{
	JTextArea ta=new JTextArea(25,80);//size
	JFileChooser fc = new JFileChooser();
	
	public ViewFileGUI()//��ư��������
	{
		JButton openButton = new JButton("����");
		openButton.addActionListener((ActionListener) new OpenAction());//actionListener�� actionperformed�� �������̵��ؾߵ�
		//��ư�� �̺�Ʈ������ �ޱ�
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));//��ư�Ʒ�(Y��)�� ���ڴ�
		//�гο� ��ư�� �ؽ�Ʈ������� ��ġ�� ������
		this.add(openButton);
		this.add(new JScrollPane(ta));
	}//end of ViewFileGUI constructor
	
	class OpenAction implements ActionListener//ActionListener�� interface . �߻�޼ҵ带 ������ �ֵ�. �װ� �׼������� .�ݵ�� �������̵� �ؾߵǴ� �޼ҵ尡 acitonperformed
	{
		public void actionPerformed(ActionEvent ae)
		{
			int retval = fc.showOpenDialog(ViewFileGUI.this);//open file���â ����
			if(retval == JFileChooser.APPROVE_OPTION);//���ÿ���(true,false����)
				File file =fc.getSelectedFile();//�ߺ������� ����ϸ鼭 ���ð��� ����
				
				try
				{
					Scanner scan = new Scanner(file);
					String line;
					ta.setText("");
					
					while(scan.hasNextLine())
					{
						line = scan.nextLine();
						ta.append(line);//�ؽ�Ʈ���� �����ֱ�
					}
				}catch(FileNotFoundException e){
					System.out.println("���Ͼ���");
				}//end of try~catch
		}
	}//end of
}//end of ViewFileGUI
