/*
 * Copyright (c) 2012.
 */

/*
 * Created by JFormDesigner on Sun Feb 19 15:51:46 EET 2012
 */

package ua.edu.workWithStr.box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;

/**
 * @author Oxana Nastasyuk
 *
 *
 */
public class MessageBox extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Asya Dudnik
    private JLabel labelMessage;
    private JToggleButton toggleButtonNo;
    private JToggleButton toggleButtonYes;
    private JLabel label1;
    String currentMessage="";
    public Integer wasAnswer;
    public boolean answer=false;
    public static boolean ANSWER_YES=true;
    public static boolean ANSWER_NO=false;
    JLabel labelAnswer=new JLabel();

    public MessageBox() {
        initComponents();
        setDefaultCloseOperation(MessageBox.HIDE_ON_CLOSE);
        setAlwaysOnTop(true);
        showString(currentMessage, false, false);
        if(currentMessage.isEmpty())setVisible(false);
    }

    public MessageBox(String message) {
        this();
        showString(message, false, false);
    }
    public MessageBox(String message, boolean yesButton, boolean noButton) {
        this();
        showString(message, yesButton, noButton);
    }
    public void  showString(String message, boolean yesButton, boolean noButton, boolean reInit) {
       // if(reInit){initComponents();}
/*
       try{
        this.clone();
       }catch(CloneNotSupportedException ex){ex.printStackTrace();}
*/
        buttonsShow(yesButton, noButton);
        messageShow(message, true);
        this.setVisible(true);
        this.repaint();
        //contentPane.repaint();
    }

    public void  showString(String message, boolean yesButton, boolean noButton)
    {
        buttonsShow(yesButton, noButton);
        messageShow(message, true);
        this.setVisible(true);
        repaint();
    }
    public void messageShow(String curMessage,boolean yes)
    {   wasAnswer=null;
        labelMessage.setText(curMessage);
        labelMessage.setVisible(yes);
        this.setVisible(yes);
        repaint();
    }
    public void answerSetShow(String curMessage,boolean yes)
    {

      labelAnswer.setText(curMessage);
      labelAnswer.setEnabled(true);
      labelAnswer.setVisible(true);
      labelMessage.setVisible(false);
      setVisible(true);
      repaint();

    }
    private void buttonsShow(boolean yesButton, boolean noButton)
    {
        toggleButtonNo.setVisible(yesButton);
        toggleButtonYes.setVisible(noButton);
        repaint();

    }

    public boolean isAnswer() {
        return answer;
    }

    private void toggleButtonYesMousePressed(MouseEvent e) {

        answer=ANSWER_YES;
        wasAnswer=1;
        setVisible(false);
        this.repaint();

    }
    private void toggleButtonYesKeyPressed(KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_ENTER && e.getID()==KeyEvent.KEY_PRESSED){
            answer=ANSWER_YES;
            wasAnswer=1;
            setVisible(false);
            this.repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE && e.getID()==KeyEvent.KEY_PRESSED){
            answer=ANSWER_NO;
            wasAnswer=1;
            setVisible(false);
            this.repaint();
        }
        }

    private void toggleButtonNoMousePressed(MouseEvent e) {

        answer=ANSWER_NO;
        wasAnswer=1;
        setVisible(false);
        this.repaint();
    }
    private void toggleButtonNoKeyPressed(KeyEvent e) {

      if(e.getKeyCode()==KeyEvent.VK_ENTER && e.getID()==KeyEvent.KEY_PRESSED){
        answer=ANSWER_NO;
        wasAnswer=1;
        setVisible(false);
        this.repaint();
      }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("ua.edu.workWithStr.resources.resource");
        labelMessage = new JLabel();
        toggleButtonNo = new JToggleButton();
        toggleButtonYes = new JToggleButton();
        label1 = new JLabel();

        //======== this ========
        setName("frameMessageBox");
        setIconImage(((ImageIcon)UIManager.getIcon("OptionPane.informationIcon")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- labelMessage ----
        labelMessage.setText(bundle.getString("MessageBox.labelMessage.text"));
        contentPane.add(labelMessage);
        labelMessage.setBounds(5, 5, 290, 35);

        //---- toggleButtonNo ----
        toggleButtonNo.setText(bundle.getString("MessageBox.toggleButtonNo.text"));
        toggleButtonNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                toggleButtonNoMousePressed(e);
            }
        });
        toggleButtonNo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                toggleButtonNoKeyPressed(e);
            }
        });
        contentPane.add(toggleButtonNo);
        toggleButtonNo.setBounds(175, 65, 100, 30);

        //---- toggleButtonYes ----
        toggleButtonYes.setText(bundle.getString("MessageBox.toggleButtonYes.text"));
        toggleButtonYes.setSelected(true);
        toggleButtonYes.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                toggleButtonYesMousePressed(e);
            }
        });
        toggleButtonYes.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                toggleButtonYesKeyPressed(e);
            }
        });

        contentPane.add(toggleButtonYes);
        toggleButtonYes.setBounds(45, 65, 100, 30);

        //---- label1 ----
        label1.setText(bundle.getString("MessageBox.label1.text"));
        label1.setEnabled(false);
        contentPane.add(label1);
        label1.setBounds(5, 35, 280, 19);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

}
