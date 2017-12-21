package Component;

import java.awt.event.ActionEvent;                                                                                              
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
class MyFrame implements ActionListener
{
    private JFrame frm = new JFrame();
    private JPanel panel = new JPanel();
    private JTextField textField = new JTextField();
    private JTextArea textArea = new JTextArea();
    public MyFrame()
    {
        //textField셋팅
        textField.setColumns(20); //열의 크기(가로크기)
        textField.setText("추가할 글을 입력해 주세요.");
        textField.addActionListener(this);
        
        //textArea셋팅
        textArea.setLineWrap(true); //한줄이 너무 길면 자동으로 개행할지 설정
        textArea.setColumns(20); //열의 크기(가로크기)
        textArea.setRows(20); //행의 크기(세로크기)
        
        //기본 패널 셋팅
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(textField);
        panel.add(textArea);
        
        //기본 프래임 셋팅
        frm.setTitle("JTextArea Test");
        frm.setLocation(120, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(panel);
        frm.pack();
        frm.setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == textField)
        {
            String tmpStr = textField.getText();
            textArea.append(tmpStr+"\n");
            textField.setText("");
            textField.requestFocus();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }
}
 
public class TextAreaTest 
{
    public static void main(String[] args) 
    {
        MyFrame my = new MyFrame();
    }
}