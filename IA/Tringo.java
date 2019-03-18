import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Tringo extends Frame implements WindowListener,ActionListener {
  Correct cor;//brings in Correct class as object
  TextField text = new TextField(5);//50 = length of the TextField
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
  Button start;
  Button next;
  TextArea color = new TextArea(10,25);
  TextArea color2 = new TextArea(10,25);


  //ArrayList<String> questions;
  //ArrayList<Integer> sheet;

  private int numClicks = 0;
  private int quest = 0;
  private int i = 0;
  private int j = 0;

    public Tringo(String title) {

        super(title);
        cor = new Correct();
        setLayout(new FlowLayout());
        addWindowListener(this);

        welcome = new Label("Select all values equivalent to:");
        add(welcome);
        add(text);

        start = new Button("Start");
        add(start);
        next = new Button("Next Question");
        add(next);



        b = new Button("cos(60)");//adding each button to the GUI in specific order, each are labeled with answers to questions
        add(b);
        //b.setVisible(false);
        b2 = new Button("tan(30)");
        add(b2);
        //b2.setVisible(false);
        b3 = new Button("90º");
        add(b3);
        //b3.setVisible(false);
        b4 = new Button("0º");
        add(b4);
        //b4.setVisible(false);
        b5 = new Button("sin(0)");
        add(b5);
        //b5.setVisible(false);
        b6 = new Button("sin(60)");
        add(b6);
        //b6.setVisible(false);
        b7 = new Button("45º");
        add(b7);
        //b7.setVisible(false);
        b8 = new Button("sin(90)");
        add(b8);
        //b8.setVisible(false);
        b9 = new Button("sin(30)");
        add(b9);
        //b9.setVisible(false);
        b10 = new Button("cos(45)");
        add(b10);
        //b10.setVisible(false);
        b11 = new Button("tan(45)");
        add(b11);
        //b11.setVisible(false);
        b12 = new Button("cos(90)");
        add(b12);
        //b12.setVisible(false);
        b13 = new Button("cos(30)");
        add(b13);
        //b13.setVisible(false);
        b14 = new Button("tan(60)");
        add(b14);
        //b14.setVisible(false);
        b15 = new Button("sec(60)");
        add(b15);
        //b15.setVisible(false);
        b16 = new Button("30º");
        add(b16);
        //b16.setVisible(false);
        b17 = new Button("sin(45)");
        add(b17);
        //b17.setVisible(false);
        b18 = new Button("csc(60)");
        add(b18);
        //b18.setVisible(false);
        b19 = new Button("60º");
        add(b19);
        //b19.setVisible(false);
        b20 = new Button("cos(0)");
        add(b20);
        //b20.setVisible(false);

        //text.setText(cor.questions.get(0));//automatically prints first question in TextField

        add(which);
        add(oops);
        add(color);
        add(color2);


            /*questions.add("π/2");//b3 -0
            questions.add("√3/2");//b6, b13 -1
            questions.add("π/3");//b19 -2
            questions.add("0");//b4, b5, b12 -3
            questions.add("√2/2");//b10, b17 -4
            questions.add("1/2");//b, b9 -
            questions.add("π/6");//b16 -6
            questions.add("π/4");//b7 -7
            questions.add("1");//b8, b11, b20 -8
            questions.add("√2/3");//b2 -9
            questions.add("√3");//b14 -10
            questions.add("2");//b15 -11
            questions.add("2√3/3");//b18 -12

            int j = 0;
            for(int i=0; i<13; i++){
              questions.get(i);
              j=i;
              sheet.add(j);
            }*/


                b.addActionListener(new ActionListener() {//second ActionListener to set button equal to an int value that corresponds to the question number
                  public void actionPerformed(ActionEvent e) {
                    quest = 5;
                  }
                });
                b.addActionListener(this);//adding an ActionListener to each button so that I can add elements/methods to button clicks

                b2.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 9;
                  }
                });
                b2.addActionListener(this);

                b3.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 0;
                  }
                });
                b3.addActionListener(this);

                b4.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 3;
                  }
                });
                b4.addActionListener(this);

                b5.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 3;
                  }
                });
                b5.addActionListener(this);

                b6.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 1;
                    //b13.setVisible(false);
                  }
                });
                b6.addActionListener(this);

                b7.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 7;
                  }
                });
                b7.addActionListener(this);

                b8.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 8;
                  }
                });
                b8.addActionListener(this);

                b9.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 5;
                  }
                });
                b9.addActionListener(this);

                b10.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 4;
                  }
                });
                b10.addActionListener(this);

                b11.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 8;
                  }
                });
                b11.addActionListener(this);

                b12.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 3;
                  }
                });
                b12.addActionListener(this);

                b13.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 1;
                    //make it wait a moment
                    //b6.setVisible(false);
                  }
                });
                b13.addActionListener(this);

                b14.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 10;
                  }
                });
                b14.addActionListener(this);

                b15.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 11;
                  }
                });
                b15.addActionListener(this);

                b16.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 6;
                  }
                });
                b16.addActionListener(this);

                b17.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 4;
                  }
                });
                b17.addActionListener(this);

                b18.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 12;
                  }
                });
                b18.addActionListener(this);

                b19.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 2;
                  }
                });
                b19.addActionListener(this);

                b20.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    quest = 8;
                  }
                });
                b20.addActionListener(this);

        //which.setText("CLICK START");
        color.setText("The goal of this game is to\nanswer questions until all \nbuttons have disappeared or\nare colored.");
        color2.setText("Click START when you're ready.");
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              text.setText(cor.questions.get(0));
              next.setVisible(false);
              start.setVisible(false);
              color2.setText("");
              color.setText("");
              /*b.setVisible(true);
              b2.setVisible(true);
              b3.setVisible(true);
              b4.setVisible(true);
              b5.setVisible(true);
              b6.setVisible(true);
              b7.setVisible(true);
              b8.setVisible(true);
              b9.setVisible(true);
              b10.setVisible(true);
              b11.setVisible(true);
              b12.setVisible(true);
              b13.setVisible(true);
              b14.setVisible(true);
              b15.setVisible(true);
              b16.setVisible(true);
              b17.setVisible(true);
              b18.setVisible(true);
              b19.setVisible(true);
              b20.setVisible(true);*/
          }
        });

        next.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            j=j+1;
            text.setText(cor.questions.get(j));
            next.setVisible(false);
            which.setText("");
          }
        });

        }

      public static void main(String[] args) {
          Tringo myWindow = new Tringo("TRINGO!");
          myWindow.setSize(500,400);
          myWindow.setVisible(true);
      }

      public void actionPerformed(ActionEvent e) {
        //int i = 0;
        /*text.setText(cor.questions.get(i)); //this should probably not be in the actionPerformed...
        Component c = (Component)e.getSource();*/
      //  for(int i=0; i<13; i++){
          //text.setText(cor.questions.get(i));
          //which.setText("i is " + i);
          Component c = (Component)e.getSource();

          if (quest == cor.sheet.get(i)){//i = index for questions loop
            //button disappears
            //c.setVisible(false);
            next.setVisible(true);
            i=i+1;
            if(i>j){
              which.setText("click Next");
            }
            //which.setText("i is " + i);//worked for the first question and transition over to second question but didn't work for the second answer of second question.


            if(quest == 1){
              //question remains until one other correct button is clicked
              /*b6.setVisible(false);
              b13.setVisible(false);*/
              b6.setBackground(Color.blue);
              b13.setBackground(Color.blue);
              color.setText("blue:\nsin(60)\ncos(30)");
            }
            else if(quest == 4){
              //question remains until one other correct button is clicked
              /*b10.setVisible(false);
              b17.setVisible(false);*/
              b10.setBackground(Color.cyan);
              b17.setBackground(Color.cyan);
              color.setText("blue:\nsin(60)\ncos(30)\n\ncyan:\ncos(45)\nsin(45)");
              color2.setText("yellow:\n0º\nsin(0)\ncos(90)");

            }
            else if(quest == 5){
              //question remains until one other correct button is clicked
              /*b.setVisible(false);
              b9.setVisible(false);*/
              b.setBackground(Color.green);
              b9.setBackground(Color.green);
              color.setText("blue:\nsin(60)\ncos(30)\n\ncyan:\ncos(45)\nsin(45)\n\ngreen:\ncos(60)\nsin(30)");
              color2.setText("yellow:\n0º\nsin(0)\ncos(90)");

            }
            else if(quest == 3){
                //question remains until two other correct buttons are clicked
                /*b4.setVisible(false);
                b5.setVisible(false);
                b12.setVisible(false);*/
                b4.setBackground(Color.yellow);
                b5.setBackground(Color.yellow);
                b12.setBackground(Color.yellow);
                color.setText("blue:\nsin(60)\ncos(30)");
                color2.setText("yellow:\n0º\nsin(0)\ncos(90)");

            }
            else if(quest == 8){
              //question remains until two other correct buttons are clicked
              /*b8.setVisible(false);
              b11.setVisible(false);
              b20.setVisible(false);*/
              b8.setBackground(Color.red);
              b11.setBackground(Color.red);
              b20.setBackground(Color.red);
              color.setText("blue:\nsin(60)\ncos(30)\n\ncyan:\ncos(45)\nsin(45)\n\ngreen:\ncos(60)\nsin(30)");
              color2.setText("yellow:\n0º\nsin(0)\ncos(90)\n\nred:\nsin(90)\nan(45)\ncos(0)");

            }
            else if(quest == 12){
              c.setVisible(false);
              which.setText("FINISHED!");
              color.setText("Congratulations!\nWrite down how many Wrong\nTries you have and give \nit to your teacher.");
              color2.setText("When you're done,\nclose this window to \nexit the game.");
            }
            else{
              c.setVisible(false);
              next.setVisible(true);
            }
          }

          else{
            c.setVisible(true);
            numClicks++;
            oops.setText("Wrong Tries: " + numClicks);//since I haven't set up answer-question checker, everytime a button is clicked it adds one to wrong tries
          }
      //  }
        /*numClicks++;
        oops.setText("Wrong Tries: " + numClicks); //everytime you click a button, it increases wrong tries counter and prints it out
        text.setText("testing " + quest); //setting each button to an integer worked!
        */

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
