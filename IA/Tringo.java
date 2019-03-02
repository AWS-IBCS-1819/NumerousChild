import java.awt.*;
import java.awt.event.*;

public class Tringo extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(50);//20 = length of the TextField
        TextField which = new TextField(20);
        TextField oops = new TextField(20);
        Button b;
        Button b2;
        Button b3;
        Button b4;
        Button b5;
        Button b6;
        Button b7;
        Button b8;
        Button b9;
        Button b10;
        Button b11;
        Button b12;
        Button b13;
        Button b14;
        Button b15;
        Button b16;
        Button b17;
        Button b18;
        Button b19;
        Button b20;
        private int numClicks = 0;

        public Tringo(String title) {

                super(title);
                setLayout(new FlowLayout());
                addWindowListener(this);
                add(text);
                b = new Button("cos(60)");
                add(b);
                b2 = new Button("tan(30)");
                add(b2);
                b3 = new Button("90º");
                add(b3);
                b4 = new Button("0º");
                add(b4);
                b5 = new Button("sin(0)");
                add(b5);
                b6 = new Button("sin(60)");
                add(b6);
                b7 = new Button("45º");
                add(b7);
                b8 = new Button("sin(90)");
                add(b8);
                b9 = new Button("sin(30)");
                add(b9);
                b10 = new Button("cos(45)");
                add(b10);
                b11 = new Button("tan(45)");
                add(b11);
                b12 = new Button("cos(90)");
                add(b12);
                b13 = new Button("cos(30)");
                add(b13);
                b14 = new Button("tan(60)");
                add(b14);
                b15 = new Button("sec(60)");
                add(b15);
                b16 = new Button("30º");
                add(b16);
                b17 = new Button("sin(45)");
                add(b17);
                b18 = new Button("csc(60)");
                add(b18);
                b19 = new Button("60º");
                add(b19);
                b20 = new Button("cos(0)");
                add(b20);
                add(which);
                add(oops);
                b.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
                b6.addActionListener(this);
                b7.addActionListener(this);
                b8.addActionListener(this);
                b9.addActionListener(this);
                b10.addActionListener(this);
                b11.addActionListener(this);
                b12.addActionListener(this);
                b13.addActionListener(this);
                b14.addActionListener(this);
                b15.addActionListener(this);
                b16.addActionListener(this);
                b17.addActionListener(this);
                b18.addActionListener(this);
                b19.addActionListener(this);
                b20.addActionListener(this);
        }

        public static void main(String[] args) {
                Tringo myWindow = new Tringo("TRINGO!");
                myWindow.setSize(500,400);
                myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
                numClicks++;
                oops.setText(numClicks + " wrong tries");
        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}
