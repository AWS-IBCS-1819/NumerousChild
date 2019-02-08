/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package events;

/*
 * Beeper.java requires no other files.

COMMENT THIS AS HOMEWORK 2/6 (lower case notes)

//CAPATALIZED NOTES ARE CLASS NOTES
 */

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;//importing a million libraries for various methods used throughout

public class Beeper extends JPanel//subclass = Beeper. super class = JPanel
                    implements ActionListener {//ActionListener is implemented so we can use its super cool functions //USES CLASS: ACTION LISTENER
    JButton button;//creating a button (instance variable) in Beeper. //INSTANCE VARIABLE

    public Beeper() {// CONSTRUCTOR METHOD
        super(new BorderLayout());//IS CONSTRUCTOR OF SUPER CLASS
        button = new JButton("Click Me");//assigning the button variable to say "Click Me"
        button.setPreferredSize(new Dimension(200, 80));//this is just setting the size of the button
        add(button, BorderLayout.CENTER);//This adds the button to the window in the center //ADD: ADDING ___ TO THE FRAME (WHICH HAPPENS TO BE CALLED "BEEPER")
        button.addActionListener(this);//adds ActionListener to the button (so user can interact with button and things can happen) //WE ADD THE ACTION LISTENER TO WHATEVER COMPONENT WE WANT IT TO BE ASSIGNED TO (IN THIS CASE, BUTTON)
    }

    public void actionPerformed(ActionEvent e) {//when user clicks button this (below) happens
        Toolkit.getDefaultToolkit().beep();//method "beep" happens from Toolkit library //MAKES A SOUND "BEEP"
    }


    public static void main(String[] args) {
      JFrame frame = new JFrame("Beeper");//creates the frame/window and names it "Beeper" //USES JFRAME
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this makes it so when you close the window, you close the whole program too //ONE OF THOSE THINGS A FRAME COULD DO. IT HAS A DEFAULT CLOSE OPERATION RATHER THAN SOMETHING ELSE

      JComponent newContentPane = new Beeper();//creating new Beeper object
      newContentPane.setOpaque(true);//makes the background of the window opaque
      frame.setContentPane(newContentPane);

      frame.pack();
      frame.setVisible(true);//makes the frame/window visible //THIS IS ESSENTIAL IF YOU WANT THE FRAME TO APPEAR
    }
}
