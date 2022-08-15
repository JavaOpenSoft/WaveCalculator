package com.waveCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static JFrame getMainFrame() {
        return MainFrame;
    }

    public static JPanel getApplicationPanel() {
        return ApplicationPanel;
    }

    public static JTextField getMainTextField() {
        return mainTextField;
    }

    public static JMenuBar getMainMenuBar() {
        return mainMenuBar;
    }

    public static JMenu getFile() {
        return file;
    }

    public static JMenu getEdit() {
        return edit;
    }

    public static JMenu getHelp() {
        return help;
    }

    public static JButton getZero() {
        return zero;
    }

    public static JButton getOne() {
        return one;
    }

    public static JButton getTwo() {
        return two;
    }

    public static JButton getThree() {
        return three;
    }

    public static JButton getFour() {
        return four;
    }

    public static JButton getFive() {
        return five;
    }

    public static JButton getSix() {
        return six;
    }

    public static JButton getSeven() {
        return seven;
    }

    public static JButton getEight() {
        return eight;
    }

    public static JButton getNine() {
        return nine;
    }

    public static JButton getClear() {
        return clear;
    }

    public static JButton getPositiveNegative() {
        return positiveNegative;
    }

    public static JButton getDecimal() {
        return decimal;
    }

    public static JButton getSquare() {
        return square;
    }

    public static JButton getSquareRoot() {
        return squareRoot;
    }

    public static JButton getPlus() {
        return plus;
    }

    public static JButton getMinus() {
        return minus;
    }

    public static JButton getDivide() {
        return divide;
    }

    public static JButton getMultiply() {
        return multiply;
    }

    public static JButton getEquals() {
        return equals;
    }

    //int sum;
    static JFrame MainFrame = new JFrame();
    static JPanel ApplicationPanel = new JPanel();
    static JTextField mainTextField = new JTextField("");
    static JMenuBar mainMenuBar = new JMenuBar();
    static JMenu file = new JMenu("File");
    static JMenu edit = new JMenu("Edit");
    static JMenu help = new JMenu("Help");
    static JButton zero = new JButton("0");
    static JButton one = new JButton("1");
    static JButton two = new JButton("2");
    static JButton three = new JButton("3");
    static JButton four = new JButton("4");
    static JButton five = new JButton("5");
    static JButton six = new JButton("6");
    static JButton seven = new JButton("7");
    static JButton eight = new JButton("8");
    static JButton nine = new JButton("9");
    static JButton clear = new JButton("C");
    static JButton positiveNegative = new JButton("+/-");
    static JButton decimal = new JButton(".");
    static JButton square = new JButton("");
    static JButton squareRoot = new JButton( jst.Math.toSuperscript("2")+"√x");
    static JButton plus = new JButton("+");
    static JButton minus = new JButton("-");
    static JButton divide = new JButton("÷");
    static JButton multiply = new JButton("×");
    static JButton equals = new JButton("=");


    public static void main(String[] args) {
        /*AbstractAction append9 = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nine.requestFocusInWindow();

            }
        };*/

        //nine.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        //nine.getActionMap().put("Enter", append9);
        //nine.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "F1");
        //nine.getActionMap().put("F1", append9);
        one.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "9");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "0");
            }
        });
        decimal.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               mainTextField.setText(mainTextField.getText() + ".");
           }
        });
        positiveNegative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!mainTextField.getText().equals(""))
                mainTextField.setText(Integer.parseInt(mainTextField.getText())*-1 + "");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "+");
            }
        });
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                mainTextField.setText(mainTextField.getText() + "-");
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "*");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainTextField.setText(mainTextField.getText() + "/");
            }
        });
        equals.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               mainTextField.setText(Integer.parseInt(mainTextField.getText()) + "");
           }
        });

        mainTextField.setEditable(false);
        ApplicationPanel.setLayout(null);
        mainTextField.setBounds(0,0,250,60);
        ApplicationPanel.add(mainTextField);
        one.setBounds(0,80,50,50);
        ApplicationPanel.add(one);
        two.setBounds(60,80,50,50);
        ApplicationPanel.add(two);
        plus.setBounds(180,80,50,50);
        ApplicationPanel.add(plus);
        three.setBounds(120,80,50,50);
        ApplicationPanel.add(three);
        four.setBounds(0,130,50,50);
        ApplicationPanel.add(four);
        five.setBounds(60,130,50,50);
        ApplicationPanel.add(five);
        six.setBounds(120,130,50,50);
        ApplicationPanel.add(six);
        minus.setBounds(180,130,50,50);
        ApplicationPanel.add(minus);
        seven.setBounds(0,180,50,50);
        ApplicationPanel.add(seven);
        eight.setBounds(60,180,50,50);
        ApplicationPanel.add(eight);
        nine.setBounds(120,180,50,50);
        ApplicationPanel.add(nine);
        multiply.setBounds(180,180,50,50);
        ApplicationPanel.add(multiply);
        zero.setBounds(0,230,50,50);
        ApplicationPanel.add(zero);
        decimal.setBounds(60,230,50,50);
        ApplicationPanel.add(decimal);
        positiveNegative.setBounds(120,230,50,50);
        ApplicationPanel.add(positiveNegative);
        divide.setBounds(180,230,50,50);
        ApplicationPanel.add(divide);
        equals.setBounds(180,280,50,50);
        ApplicationPanel.add(equals);
        ApplicationPanel.add(squareRoot);
        MainFrame.add(ApplicationPanel);
        MainFrame.setSize(new Dimension(250,410));
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setVisible(true);
    }
}
