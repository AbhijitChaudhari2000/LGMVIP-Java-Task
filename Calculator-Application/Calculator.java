import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calculator implements ActionListener {
    
    JFrame frame;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bmod,bEqual,bDel,bClr,bDec;
    static double a=0,b=0, result=0;
    static int operator=0;


    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(10, 10, 400, 400);
        frame.setResizable(true);

        Font font = new Font("Arial", Font.BOLD,14);
        Font font2 = new Font("Arial", Font.BOLD,20);

        t = new JTextField(10);
        t.setFont(font);
        t.setBounds(50, 40, 300, 50);
        frame.add(t);
    

        b1= new JButton("1");
        b1.setFont(font2);
        b2= new JButton("2");
        b2.setFont(font2);
        b3= new JButton("3");
        b3.setFont(font2);
        b4= new JButton("4");
        b4.setFont(font2);
        b5= new JButton("5");
        b5.setFont(font2);
        b6= new JButton("6");
        b6.setFont(font2);
        b7= new JButton("7");
        b7.setFont(font2);
        b8= new JButton("8");
        b8.setFont(font2);
        b9= new JButton("9");
        b9.setFont(font2);
        b0= new JButton("0");
        b0.setFont(font2);
        badd= new JButton("+");
        badd.setFont(font2);
        bsub= new JButton("-");
        bsub.setFont(font2);
        bmul= new JButton("*");
        bmul.setFont(font2);
        bdiv= new JButton("/");
        bdiv.setFont(font2);
        bEqual= new JButton("=");
        bEqual.setFont(font2);
        bDel= new JButton("DEL");
        bDel.setFont(font);
        bClr= new JButton("CLR");
        bClr.setFont(font);
        bDec= new JButton(".");
        bDec.setFont(font2);
        
        bClr.setBounds(125, 100, 70, 40);
        bDel.setBounds(200, 100, 70, 40);
        bdiv.setBounds(275, 100, 70, 40);

        b7.setBounds(50, 145, 70, 40);
        b8.setBounds(125, 145, 70, 40);
        b9.setBounds(200, 145, 70, 40);
        bmul.setBounds(275, 145, 70, 40);

        b4.setBounds(50, 190, 70, 40);
        b5.setBounds(125, 190, 70, 40);
        b6.setBounds(200, 190, 70, 40);
        bsub.setBounds(275, 190, 70, 40);

        b1.setBounds(50, 235, 70, 40);
        b2.setBounds(125, 235, 70, 40);
        b3.setBounds(200, 235, 70, 40);
        badd.setBounds(275, 235, 70, 40);

        b0.setBounds(50, 280, 140, 40);
        bDec.setBounds(200, 280, 70, 40);
        bEqual.setBounds(275, 280, 70, 40);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bEqual.addActionListener(this);
        bClr.addActionListener(this);
        bDel.addActionListener(this);
        bDec.addActionListener(this);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(badd);
        frame.add(bsub);
        frame.add(bmul);
        frame.add(bdiv);
        // frame.add(bmod);
        frame.add(bEqual);
        frame.add(bDel);
        frame.add(bClr);
        frame.add(bDec);




    }



    public static void main(String[] args) {
        new Calculator();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==b1){
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()==b2){
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3){
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4){
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5){
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6){
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7){
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8){
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9){
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0){
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bDec){
            t.setText(t.getText().concat("."));
        }
        //Operators
        if(e.getSource()==badd){
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }
        if(e.getSource()==bsub){
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(e.getSource()==bmul){
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(e.getSource()==bdiv){
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if(e.getSource()==bClr){
            t.setText("");
        }
        if(e.getSource()==bDel){
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++){
                t.setText(t.getText()+s.charAt(i));
            }
        }
        if(e.getSource()==bEqual){
            b=Double.parseDouble(t.getText());
            String equation="";
            switch(operator){
                case 1: result=a+b;
                equation=a+ "+" +b;
                break;
                case 2: result=a-b;
                equation=a+ "-" +b;
                break;
                case 3: result=a*b;
                equation=a+ "*" +b;
                break;
                case 4: result=a/b;
                equation=a+ "/" +b;
                break;
            }
            t.setText(equation + "=" + result);

        }
    }
}
