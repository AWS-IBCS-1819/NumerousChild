import java.awt.*;
import java.awt.event.*;

public class Tringo extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(50);//50 = length of the TextField
        TextField which = new TextField(15);//question number will be displayed
        TextField oops = new TextField(15);//number of wrong tries will be displayed
        Label welcome = new Label();
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
        public int quest = 0;

        public Tringo(String title) {

                super(title);
                setLayout(new FlowLayout());
                addWindowListener(this);
                welcome = new Label("Select all values equivalent to:");
                add(welcome);
                add(text);
                b = new Button("cos(60)");//adding each button to the GUI in specific order, each are labeled with answers to questions
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
                b.addActionListener(this);//adding an ActionListenerto each button so that I can add elements/methods to button clicks
                b.addActionListener(new ActionListener() {//second ActionListener to set button equal to an int value that corresponds to the question number
                  public void actionPerformed(ActionEvent e) {
                    quest = 5;
                  }
                });
                b2.addActionListener(this);
                b2.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 9;
                  }
                });
                b3.addActionListener(this);
                b3.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 0;
                  }
                });
                b4.addActionListener(this);
                b4.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 3;
                  }
                });
                b5.addActionListener(this);
                b5.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 3;
                  }
                });
                b6.addActionListener(this);
                b6.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 1;
                  }
                });
                b7.addActionListener(this);
                b7.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 7;
                  }
                });
                b8.addActionListener(this);
                b8.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 8;
                  }
                });
                b9.addActionListener(this);
                b9.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 5;
                  }
                });
                b10.addActionListener(this);
                b10.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 4;
                  }
                });
                b11.addActionListener(this);
                b11.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 8;
                  }
                });
                b12.addActionListener(this);
                b12.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 3;
                  }
                });
                b13.addActionListener(this);
                b13.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 1;
                  }
                });
                b14.addActionListener(this);
                b14.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 10;
                  }
                });
                b15.addActionListener(this);
                b15.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 11;
                  }
                });
                b16.addActionListener(this);
                b16.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 6;
                  }
                });
                b17.addActionListener(this);
                b17.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 4;
                  }
                });
                b18.addActionListener(this);
                b18.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 12;
                  }
                });
                b19.addActionListener(this);
                b19.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 2;
                  }
                });
                b20.addActionListener(this);
                b20.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 8;
                  }
                });

        }

        public static void main(String[] args) {
                Tringo myWindow = new Tringo("TRINGO!");
                myWindow.setSize(500,400);
                myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {

          for(int l=0; l<13; l++){
            text.setText(question.get(l));
            if (quest == sheet.get(l)){//l = index for questions loop
            //button disappears
              if (quest == 1||4||5){
                //question remains until one more correct button has been clicked
              }
              else if(quest == 3||8){
                //question remains until two more correct buttons have been clicked
              }
              else{
                //next question displayed
              }
            }
            else{
              numClicks++;
              oops.setText("Wrong Tries: " + numClicks);//since I haven't set up answer-question checker, everytime a button is clicked it adds one to wrong tries
            }
          }


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
