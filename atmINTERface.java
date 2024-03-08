import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
public class atmINTERface extends Frame {
    public atmINTERface(){
        setSize(1600, 1000);
        setTitle("ATM INTERFACE");
        Color cc=new Color(80, 60, 70);
        setBackground(cc);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        
        Button button=new Button("WITHDRAWAL");
        Button button1=new Button("DEPOSIT");
        Button button2=new Button("RED");
        Button button4=new Button("1");
        Button button5=new Button("2");
        Button button6=new Button("3");
        Button button7=new Button("4");
        Button button8=new Button("5");
        Button button9=new Button("6");
        Button button10=new Button("7");
        Button button11=new Button("8");
        Button button12=new Button("9");
        Button button13=new Button("0");
        Button button14=new Button("ACCOUNT CHECK");
        Button button15=new Button("RECIEPT");
        Button button17=new Button("CHANGE PIN");
        Button button18=new Button("BLUE");
        Button button20=new Button("YELLOW");


        Color cl=Color.LIGHT_GRAY;
        Color clr=Color.GREEN;
        Color klr=Color.DARK_GRAY;
        Font f= new Font("Courier", Font.BOLD,20);
        Font ff=new Font("Courier", Font.BOLD,50);
        Font fff=new Font("Courier", Font.BOLD,13);
        Color clr2=Color.WHITE;

        button.setBounds(7, 50, 300, 60);
        button.setBackground(cl);
        button.setForeground(clr);
        button.setBackground(klr);
        button.setFont(f);
        add(button);

        button1.setBounds(7, 110, 300, 60);
        button1.setBackground(cl);
        button1.setForeground(clr);
        button1.setBackground(klr);
        button1.setFont(f);
        add(button1);

        //ye krna hai
        button2.setBounds(7, 170, 99, 60);
        button2.setBackground(cl);
        button2.setForeground(clr);
        button2.setBackground(klr);
        button2.setFont(f);
        add(button2);

        button18.setBounds(107, 170, 99, 60);
        button18.setBackground(cl);
        button18.setForeground(clr);
        button18.setBackground(klr);
        button18.setFont(f);
        add(button18);

        button20.setBounds(206, 170, 101, 60);
        button20.setBackground(cl);
        button20.setForeground(clr);
        button20.setBackground(klr);
        button20.setFont(f);
        add(button20);

        button20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Color red=Color.YELLOW;
                setBackground(red); 
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Color red=Color.RED;
                setBackground(red);
            }
        });

        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Color red=Color.BLUE;
                setBackground(red);
            }
        });

        Label l3=new Label("ACCOUNT TYPE - ");
        l3.setBounds(7, 310, 300, 60);
        l3.setBackground(klr);
        l3.setFont(f);
        l3.setForeground(clr);
        add(l3);

        Choice cch=new Choice();
        cch.setBounds(7, 370, 300, 60);
        cch.setBackground(clr);
        cch.setForeground(klr);
        cch.setBackground(cl);
        cch.add("SAVING");
        cch.add("CURRENT");
        add(cch);

        Label l=new Label("LNGUAGE - ");
        l.setBounds(7, 230, 300, 60);
        l.setForeground(clr);
        l.setBackground(klr);
        l.setFont(f);
        add(l);
        
        Choice ch=new Choice();
        ch.setBounds(7, 290, 300, 60);
        ch.setBackground(clr);
        ch.setForeground(klr);
        ch.setBackground(cl);
        ch.add("ENGLiSH");
        ch.add("HINDI");
        ch.add("TELGU");
        ch.add("MARATHI");
        ch.add("MALYALAM");
        add(ch);

        button4.setBounds(5, 450, 510, 90);
        button4.setBackground(cl);
        button4.setForeground(clr);
        button4.setBackground(klr);
        button4.setFont(ff);
        add(button4);

        button5.setBounds(515, 450, 510, 90);
        button5.setBackground(cl);
        button5.setForeground(clr);
        button5.setBackground(klr);
        button5.setFont(ff);
        add(button5);

        button6.setBounds(1025, 450, 510, 90);
        button6.setBackground(cl);
        button6.setForeground(clr);
        button6.setBackground(klr);
        button6.setFont(ff);
        add(button6);

        button7.setBounds(5, 540, 510, 90);
        button7.setBackground(cl);
        button7.setForeground(clr);
        button7.setBackground(klr);
        button7.setFont(ff);
        add(button7);

        button8.setBounds(515, 540, 510, 90);
        button8.setBackground(cl);
        button8.setForeground(clr);
        button8.setBackground(klr);
        button8.setFont(ff);
        add(button8);

        button9.setBounds(1025, 540, 510, 90);
        button9.setBackground(cl);
        button9.setForeground(clr);
        button9.setBackground(klr);
        button9.setFont(ff);
        add(button9);

        button10.setBounds(5, 630, 510, 90);
        button10.setBackground(cl);
        button10.setForeground(clr);
        button10.setBackground(klr);
        button10.setFont(ff);
        add(button10);

        button11.setBounds(515, 630, 510, 90);
        button11.setBackground(cl);
        button11.setForeground(clr);
        button11.setBackground(klr);
        button11.setFont(ff);
        add(button11);

        button12.setBounds(1025, 630, 510, 90);
        button12.setBackground(cl);
        button12.setForeground(clr);
        button12.setBackground(klr);
        button12.setFont(ff);
        add(button12);

        button13.setBounds(5, 720, 1530, 90);
        button13.setBackground(cl);
        button13.setForeground(clr);
        button13.setBackground(klr);
        button13.setFont(ff);
        add(button13);

        button14.setBounds(1235, 110, 300, 60);
        button14.setBackground(cl);
        button14.setForeground(clr);
        button14.setBackground(klr);
        button14.setFont(f);
        add(button14);

        //left
        button15.setBounds(1235, 50, 300, 60);
        button15.setBackground(cl);
        button15.setForeground(clr);
        button15.setBackground(klr);
        button15.setFont(f);
        add(button15);

        button17.setBounds(1235, 170, 300, 60);
        button17.setBackground(cl);
        button17.setForeground(clr);
        button17.setBackground(klr);
        button17.setFont(f);
        add(button17);

        TextField textField=new TextField();
        textField.setBounds(310, 50, 923, 390);
        Color tclr=Color.GRAY;
        textField.setBackground(tclr);
        add(textField);

        Label l1=new Label();
        l1.setBounds(1235, 389, 299,50);
        l1.setBackground(clr2);
        add(l1);

        button.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e){
                l1.setText("SUCESSFULLY WIDRAWAL");
                l1.setFont(fff);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e){
                l1.setText("PLEASE ADD MONEY");
                l1.setFont(fff);
            }
        });

        button15.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e){
                l1.setText("THANK YOU!");
                l1.setFont(fff);
            }
        });
        
        TextField tr=new TextField();
        tr.setBounds(1235, 231, 299, 150);
        Color color=Color.WHITE;
        tr.setBackground(color);
        tr.setFont(f);
        add(tr);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("1");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("2");
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("3");
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("4");
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("5");
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("6");
            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("7");
            }
        });
        
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("8");
            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("9");
            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                textField.setText("0");
                
            }
        });       
        textField.setFont(ff);

        Button button19 = new Button("exit");
        button19.setBounds(7, 390, 300, 50);
        button19.setBackground(klr);
        button19.setFont(f);
        button19.setForeground(clr);
        add(button19);

        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        
    }
    public static void main(String [] args){
        
        new atmINTERface();
    }
}