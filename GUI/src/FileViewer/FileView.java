package FileViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//인터페이스 =>actionPerformed 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

public class FileView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("파일 뷰어");//윈도우를 생성 제목표시줄의 이름
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫는 동작에 대한 속성설정. 윈도우를 close할 경우 : system exit
		window.setContentPane(new ViewFileGUI());//l자 없다. 속성초기화: 일반적으로 생성자메서드와 함께 사용 .ViewFileGuI함수는 내용이다.곧 만들거다
		window.pack();//자동으로 윈도우 사이즈 세팅, or가장 최근의 사이즈로
		window.setVisible(true);//화면에 보이기
	}
}//end of mainClass

class ViewFileGUI extends JPanel//JFrame안에 JPanel붙인다고 햇죠
{
	JTextArea ta=new JTextArea(25,80);//size
	JFileChooser fc = new JFileChooser();
	
	public ViewFileGUI()//버튼가져오기
	{
		JButton openButton = new JButton("열기");
		openButton.addActionListener((ActionListener) new OpenAction());//actionListener는 actionperformed를 오버라이딩해야됨
		//버튼에 이벤트리스터 달기
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));//버튼아래(Y축)에 놓겠다
		//패널에 버튼과 텍스트에어리어의 배치와 모양잡기
		this.add(openButton);
		this.add(new JScrollPane(ta));
	}//end of ViewFileGUI constructor
	
	class OpenAction implements ActionListener//ActionListener는 interface . 추상메소드를 가지고 있따. 그건 액션펄폼드 .반드시 오버라이딩 해야되는 메소드가 acitonperformed
	{
		public void actionPerformed(ActionEvent ae)
		{
			int retval = fc.showOpenDialog(ViewFileGUI.this);//open file명령창 열기
			if(retval == JFileChooser.APPROVE_OPTION);//선택여부(true,false리턴)
				File file =fc.getSelectedFile();//중복선택을 허용하면서 선택값을 리턴
				
				try
				{
					Scanner scan = new Scanner(file);
					String line;
					ta.setText("");
					
					while(scan.hasNextLine())
					{
						line = scan.nextLine();
						ta.append(line);//텍스트에어리어에 보여주기
					}
				}catch(FileNotFoundException e){
					System.out.println("파일없음");
				}//end of try~catch
		}
	}//end of
}//end of ViewFileGUI
