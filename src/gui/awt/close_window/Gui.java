package gui.awt.close_window;

import java.awt.*;
import java.awt.event.*;

public class Gui {

    public static void main(String[] args){
        Frame window = new Frame();

        window.setSize(300,300);
        Button b = new Button();
        b.setLabel("close");
        b.addActionListener(new MyActionListener());
        window.add(b);
        window.addWindowListener(new MyWindowListener());
        window.setVisible(true);

    }

    private static class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    private static class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Button source = (Button) e.getSource();
            if(source.getLabel().equals("close")){
                Frame window = (Frame) source.getParent();
                window.getWindowListeners()[0].windowClosing(null);
            }
        }
    }

}
