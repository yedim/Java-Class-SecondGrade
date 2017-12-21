package Component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.*;

interface GradeGettable
{
	void cal_grade();//���� ���
}

class Grade
{
	int length;                         int[] major = new int[10];
	String[] num = new String[10];   	String[] name = new String[15];
	int[] korean = new int[10];     	int[] math=new int[10];
	int[] java=new int[10];         	int[] cplus=new int[10];
	int[] sum=new int[10];          	double[] avg= new double[10];
	int[] grade =new int[10];       	
	ArrayList<Integer> idx = new ArrayList<Integer>();//�а��� ���� �а��� �ε�����.

	public void writingData(int flag){
		
		for (int j = 0; j < length; j++) {
			if (flag == 0) {// �ι̰�
				if (major[j] == 0)
					idx.add(j);//�ι̰��� �ִ� �ε������� �������� �߰�.
			} else if (flag == 1) {// �ַ�ǰ�
				if (major[j] == 1)
					idx.add(j);//�ַ���� �ִ� �ε������� �������� �߰�.
			} else {// ��ü�а� ����϶�
				idx.add(j);
			}
		}
		//����
		cal_grade();
		// ���
		for (int j = 0; j < length; j++) {
			if (flag == 0) {// �ι̰�
				if (major[j] == 0)
					System.out.println(major[j] + "\t" + num[j] + "\t" + name[j] + "\t" + korean[j] + "\t" + math[j]
							+ "\t" + java[j] + "\t" + cplus[j] + "\t" + sum[j] + "\t" + avg[j] + "\t" + grade[j]);
			} else if (flag == 1) {// �ַ�ǰ�
				if (major[j] == 1)
					System.out.println(major[j] + "\t" + num[j] + "\t" + name[j] + "\t" + korean[j] + "\t" + math[j]
							+ "\t" + java[j] + "\t" + cplus[j] + "\t" + sum[j] + "\t" + avg[j] + "\t" + grade[j]);
			} else {// ��ü�а� ����϶�
				System.out.println(major[j] + "\t" + num[j] + "\t" + name[j] + "\t" + korean[j] + "\t" + math[j] + "\t"
						+ java[j] + "\t" + cplus[j] + "\t" + sum[j] + "\t" + avg[j] + "\t" + grade[j]);
			}
		}
	}
	
	public void cal_grade()
	{
		// ������ �ϴ� 1�� �ʱ�ȭ
		for (int i = 0; i < grade.length; i++)
			grade[i] = 1;

		// �������� ���ؼ� ����
		for (int i = 0; i < idx.size(); i++) 
			for (int j = 0; j < idx.size(); j++)
				if (avg[idx.get(i)] < avg[idx.get(j)])
					grade[idx.get(i)]++;		
	}
	
	public void readingData(String fname) throws IOException {
		
		try {
			String csvStr = "";
			String tmpStr = "";
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			do {
				tmpStr = br.readLine();
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
				}
			} while (tmpStr != null);
			
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			length = parse.countTokens() / 6;

			for (int i = 0; i < length; i++) {
				major[i] = Integer.valueOf(parse.nextToken()).intValue();
				name[i] = parse.nextToken();
				num[i] = parse.nextToken();
				korean[i] = Integer.valueOf(parse.nextToken()).intValue();
				math[i] = Integer.valueOf(parse.nextToken()).intValue();
				java[i] = Integer.valueOf(parse.nextToken()).intValue();
				cplus[i] = Integer.valueOf(parse.nextToken()).intValue();
				sum[i]=korean[i]+math[i]+java[i]+cplus[i];
				avg[i]=sum[i]/4;
				
			} // for
	
			
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�.");
		}
	} 
}

class ProjectLayout extends JFrame { 

    JButton btn1 = new JButton("�ι̰� ����"); 
    JButton btn2 = new JButton("�ַ�ǰ� ����"); 
    JButton btn3 = new JButton("��ü�� ����");
    int flag=0;
	      
   //ȭ�� �����ϴ� ������
    public ProjectLayout() { 
        super("Minju And Yerim's GradeProject"); // Ÿ��Ʋ���� 
        this.setLayout(new FlowLayout()); //���̾ƿ� ���� 
        
        add(btn1); // �����̳ʿ� ������Ʈ �߰� 
        add(btn2); 
        add(btn3);
        
        setSize(600, 400); // ũ������ 
        setVisible(true); // ������ 
        
        btn1.addActionListener(new Event());
        btn2.addActionListener(new Event());
        btn3.addActionListener(new Event());
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ȱ�� 
    } 
    
    class Event implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		Grade g= new Grade();
    		
    		try {
				g.readingData("JavaClass_1/grade.txt");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    		
    		if(e.getSource()==btn1){
    			flag=0;
    			System.out.println("�ι̰�");
				g.writingData(flag);	
    		}
    		else if(e.getSource()==btn2){
    			flag=1;
    			System.out.println("�ַ��");
				g.writingData(flag);
    		}
    		else{
    			flag=2;
				System.out.println("��ü �а�");
				g.writingData(flag);
    		}    		
    	}    	
    }
} 

public class MinjuAndYerim {
	public static void main(String[] args) {
		ProjectLayout p=new ProjectLayout();
	}
}
