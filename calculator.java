import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.util.ArrayList;


public class calculator implements ActionListener{
    double result;
    boolean resultDisplayed = false;

    JFrame jf;
    JLabel display,history;
    JButton seven,eight,nine,four,five,six,one,two,three,zeros,zero,decimalpoint;
    JButton addButton,subButton,mulButton,divButton,equal,backspace,clear;


    public calculator()
    {
        jf = new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600,800);
        jf.setLocation(300,0);
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        display = new JLabel();
        display.setBounds(30, 50,540, 80);
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        display.setBackground(Color.WHITE);
        display.setOpaque(true);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.BLACK);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(display); 

        history = new JLabel();
        history.setBounds(30, 20, 540, 20);
        history.setHorizontalAlignment(SwingConstants.RIGHT);
        history.setFont(new Font("Arial", Font.PLAIN, 20));
        history.setForeground(Color.GRAY);
        jf.add(history);



        seven = new JButton("7");
        seven.setBounds(30,140, 80, 80);
        seven.addActionListener(this);
        seven.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(seven);
        

        eight = new JButton("8");
        eight.setBounds(130,140, 80, 80);
        eight.addActionListener(this);
        eight.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(eight);

        nine = new JButton("9");
        nine.setBounds(230,140, 80, 80);
        nine.addActionListener(this);
        nine.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(nine);

        four = new JButton("4");
        four.setBounds(30,240, 80, 80);
        four.addActionListener(this);
        four.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(four);

        five = new JButton("5");
        five.setBounds(130,240, 80, 80);
        five.addActionListener(this);
        five.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(five);

        six = new JButton("6");
        six.setBounds(230,240, 80, 80);
        six.addActionListener(this);
        six.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(six);

        one = new JButton("1");
        one.setBounds(30,340, 80, 80);
        one.addActionListener(this);
        one.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(one);

        two = new JButton("2");
        two.setBounds(130,340, 80, 80);
        two.addActionListener(this);
        two.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(two);

        three = new JButton("3");
        three.setBounds(230,340, 80, 80);
        three.addActionListener(this);
        three.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(three);

        zeros = new JButton("00");
        zeros.setBounds(30,440, 80, 80);
        zeros.addActionListener(this);
        zeros.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(zeros);

        zero = new JButton("0");
        zero.setBounds(130,440, 80, 80);
        zero.addActionListener(this);
        zero.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(zero);

        decimalpoint = new JButton(".");
        decimalpoint.setBounds(230,440, 80, 80);
        decimalpoint.addActionListener(this);
        decimalpoint.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(decimalpoint);

        divButton = new JButton("/");
        divButton.setBounds(330,140, 80, 80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(divButton);

        mulButton = new JButton("*");
        mulButton.setBounds(330,240, 80, 80);
        mulButton.addActionListener(this);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(mulButton);


        subButton = new JButton("-");
        subButton.setBounds(330,340, 80, 80);
        subButton.addActionListener(this);
        subButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(subButton);

        addButton = new JButton("+");
        addButton.setBounds(330,440, 80, 80);
        addButton.addActionListener(this);
        addButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(addButton);

        backspace = new JButton("back");
        backspace.setBounds(430,240, 80, 80);
        backspace.addActionListener(this);
        backspace.setFont(new Font("Arial", Font.PLAIN, 20));
        jf.add(backspace);

        clear = new JButton("AC");
        clear.setBounds(430,340, 80, 80);
        clear.addActionListener(this);
        clear.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(clear);


        equal = new JButton("=");
        equal.setBounds(430,440, 80, 80);
        equal.addActionListener(this);
        equal.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(equal);



    }


public static void main(String[] arg){

    new calculator();
}


@Override
public void actionPerformed(ActionEvent e) {

    //clear display field before next expression 
    if(resultDisplayed &&
        (e.getSource()==zero || e.getSource()==one || e.getSource()==two ||
    e.getSource()==three || e.getSource()==four || e.getSource()==five ||
    e.getSource()==six || e.getSource()==seven || e.getSource()==eight ||
    e.getSource()==nine || e.getSource()==zeros || e.getSource()==decimalpoint))
    {
        display.setText("");
        history.setText("");
        resultDisplayed = false;
    }

    else if(e.getSource()== addButton)
    {
        display.setText(display.getText() + "+");
        resultDisplayed = false;
    }

    else if(e.getSource()== subButton)
    {
        display.setText(display.getText() + "-");
        resultDisplayed = false;
    }

    else if(e.getSource()== mulButton)
    {
        display.setText(display.getText() + "*");
        resultDisplayed = false;
    }

    else if(e.getSource()== divButton)
    {
        display.setText(display.getText() + "/");
        resultDisplayed = false;
    }


    if(e.getSource()== seven)
    {
        display.setText(display.getText()+"7");
    }
    else if(e.getSource()== eight)
    {
        display.setText(display.getText()+"8");
    }
    else if(e.getSource()== nine)
    {
        display.setText(display.getText()+"9");
    }
    else if(e.getSource()== four)
    {
        display.setText(display.getText()+"4");
    }
    else if(e.getSource()== five)
    {
        display.setText(display.getText()+"5");
    }
    else if(e.getSource()== six)
    {
        display.setText(display.getText()+"6");
    }
    else if(e.getSource()== one)
    {
        display.setText(display.getText()+"1");
    }
    else if(e.getSource()== two)
    {
        display.setText(display.getText()+"2");
    }
    else if(e.getSource()== three)
    {
        display.setText(display.getText()+"3");
    }
    else if(e.getSource()== zeros)
    {
        display.setText(display.getText()+"00");
    }
    else if(e.getSource()== zero)
    {
        display.setText(display.getText()+"0");
    }
    else if(e.getSource()== decimalpoint)
    {
        display.setText(display.getText()+".");
    }

     else if(e.getSource()== clear) 
    {
        display.setText("");
    }

    else if(e.getSource() == backspace)
    {
        String text = display.getText();

        if(text.length() > 0)
        {
            display.setText(text.substring(0, text.length() - 1));
        }
    } 


    String expr = display.getText();

    if(e.getSource()== equal)
    {
        String nums[] = expr.split("[+\\-*/]");
        ArrayList<Double> numArray = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            numArray.add(Double.parseDouble(nums[i]));
        }

        ArrayList<Character> operatorArray = new ArrayList<>();
        for(int i=0; i<expr.length(); i++)
        {
            char ch = expr.charAt(i);

            if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                operatorArray.add(ch);
            }
        }

        // solve * and /
        for(int i=0; i<operatorArray.size(); i++)
        {
            if(operatorArray.get(i)=='*')
            {
                result = numArray.get(i) * numArray.get(i+1);

                numArray.set(i, result);
                numArray.remove(i+1);

                operatorArray.remove(i);
                i--;
            }

            else if(operatorArray.get(i)=='/')
            {
                result = numArray.get(i) / numArray.get(i+1);

                numArray.set(i, result);
                numArray.remove(i+1);

                operatorArray.remove(i);
                i--;
            }
        }
        // Solve + and -
        for(int i=0; i<operatorArray.size(); i++)
        {
            if(operatorArray.get(i)=='+')
            {
                result = numArray.get(i) + numArray.get(i+1);

                numArray.set(i, result);
                numArray.remove(i+1);

                operatorArray.remove(i);
                i--;
            }

            else if(operatorArray.get(i)=='-')
            {
                result = numArray.get(i) - numArray.get(i+1);

                numArray.set(i, result);
                numArray.remove(i+1);

                operatorArray.remove(i);
                i--;
            }
        }
        history.setText(expr);
        display.setText(String.valueOf(result));
        resultDisplayed = true;
    }
}
}
