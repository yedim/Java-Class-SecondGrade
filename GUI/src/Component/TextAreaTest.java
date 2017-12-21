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
        //textField����
        textField.setColumns(20); //���� ũ��(����ũ��)
        textField.setText("�߰��� ���� �Է��� �ּ���.");
        textField.addActionListener(this);
        
        //textArea����
        textArea.setLineWrap(true); //������ �ʹ� ��� �ڵ����� �������� ����
        textArea.setColumns(20); //���� ũ��(����ũ��)
        textArea.setRows(20); //���� ũ��(����ũ��)
        
        //�⺻ �г� ����
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(textField);
        panel.add(textArea);
        
        //�⺻ ������ ����
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