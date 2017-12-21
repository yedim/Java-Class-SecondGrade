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
	void cal_grade();//석차 계산
}

class Grade
{
	int length;                         int[] major = new int[10];
	String[] num = new String[10];   	String[] name = new String[15];
	int[] korean = new int[10];     	int[] math=new int[10];
	int[] java=new int[10];         	int[] cplus=new int[10];
	int[] sum=new int[10];          	double[] avg= new double[10];
	int[] grade =new int[10];       	
	ArrayList<Integer> idx = new ArrayList<Integer>();//학과에 따른 학과의 인덱스값.

	public void writingData(int flag){
		
		for (int j = 0; j < length; j++) {
			if (flag == 0) {// 인미과
				if (major[j] == 0)
					idx.add(j);//인미과가 있는 인덱스값을 가져오고 추가.
			} else if (flag == 1) {// 솔루션과
				if (major[j] == 1)
					idx.add(j);//솔루과가 있는 인덱스값을 가져오고 추가.
			} else {// 전체학과 출력일때
				idx.add(j);
			}
		}
		//석차
		cal_grade();
		// 출력
		for (int j = 0; j < length; j++) {
			if (flag == 0) {// 인미과
				if (major[j] == 0)
					System.out.println(major[j] + "\t" + num[j] + "\t" + name[j] + "\t" + korean[j] + "\t" + math[j]
							+ "\t" + java[j] + "\t" + cplus[j] + "\t" + sum[j] + "\t" + avg[j] + "\t" + grade[j]);
			} else if (flag == 1) {// 솔루션과
				if (major[j] == 1)
					System.out.println(major[j] + "\t" + num[j] + "\t" + name[j] + "\t" + korean[j] + "\t" + math[j]
							+ "\t" + java[j] + "\t" + cplus[j] + "\t" + sum[j] + "\t" + avg[j] + "\t" + grade[j]);
			} else {// 전체학과 출력일때
				System.out.println(major[j] + "\t" + num[j] + "\t" + name[j] + "\t" + korean[j] + "\t" + math[j] + "\t"
						+ java[j] + "\t" + cplus[j] + "\t" + sum[j] + "\t" + avg[j] + "\t" + grade[j]);
			}
		}
	}
	
	public void cal_grade()
	{
		// 석차를 일단 1로 초기화
		for (int i = 0; i < grade.length; i++)
			grade[i] = 1;

		// 석차값을 비교해서 증가
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
			System.out.println("잘못된 파일 이름을 입력했습니다.");
		}
	} 
}

class ProjectLayout extends JFrame { 

    JButton btn1 = new JButton("인미과 성적"); 
    JButton btn2 = new JButton("솔루션과 성적"); 
    JButton btn3 = new JButton("전체과 성적");
    int flag=0;
	      
   //화면 구성하는 생성자
    public ProjectLayout() { 
        super("Minju And Yerim's GradeProject"); // 타이틀지정 
        this.setLayout(new FlowLayout()); //레이아웃 변경 
        
        add(btn1); // 컨테이너에 컴포넌트 추가 
        add(btn2); 
        add(btn3);
        
        setSize(600, 400); // 크기지정 
        setVisible(true); // 보여줘 
        
        btn1.addActionListener(new Event());
        btn2.addActionListener(new Event());
        btn3.addActionListener(new Event());
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 활성 
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
    			System.out.println("인미과");
				g.writingData(flag);	
    		}
    		else if(e.getSource()==btn2){
    			flag=1;
    			System.out.println("솔루과");
				g.writingData(flag);
    		}
    		else{
    			flag=2;
				System.out.println("전체 학과");
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
