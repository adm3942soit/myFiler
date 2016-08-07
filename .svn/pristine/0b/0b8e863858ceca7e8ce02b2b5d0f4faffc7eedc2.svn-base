/*
 * Created by JFormDesigner on Tue Apr 24 12:07:04 EEST 2012
 */

package ua.edu.loops.win;


import ua.edu.loops.console.ExampleCircles;
import ua.edu.workWithStr.box.MessageBox;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;

/**
 * @author Asya Dudnik
 */
public class TestCircles extends JFrame {
    public String result1= "1";
    public String result2="2";
    public String result3="3";
    ExampleCircles circle=new ExampleCircles();
    public int limit=0;
    public Integer input;
    MessageBox box=new MessageBox();
    TextArea textArea1;

    public TestCircles() {
        result1=circle.getResultExpression(3d,4).toString();
        result2=circle.factorial(4).toString();
        result3=circle.getListRowFibonacci(6).toString();

        initComponents();
        textArea1.setText(result1);
        textArea2.setText(result2);
        textArea3.setText(result3);
        repaint();
    }



    private void okButtonMousePressed(MouseEvent e) {
        System.exit(0);
    }

    private void textField1ActionPerformed(ActionEvent e) {
        if(!textField1.getText().isEmpty())
        {
           try{
               input=Integer.parseInt(textField1.getText());
               result2=circle.factorial(input).toString();
               textArea2.setText(result2);
               textArea2.repaint();
               textArea2.setVisible(true);
           }catch (Exception ex)
           {
               box.showString("Input is not correct!Try again, please!", true,false);
           }
        }
    }

    private void textField2ActionPerformed(ActionEvent e) {
        if(!textField2.getText().isEmpty())
        {
            try{
                limit=Integer.parseInt(textField2.getText());
                result3=circle.getListRowFibonacci(limit).toString();
                textArea3.setText(result3);
                textArea3.repaint();
                textArea3.setVisible(true);
                this.okButton.setFocusPainted(true);
            }catch (Exception ex)
            {
                box.showString("Input is not correct!Try again, please!", true,false);
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Oxana Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("ua.od.edu.resources.resources");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        JTextArea textArea1 = new JTextArea();
        label2 = new JLabel();
        textArea2 = new JTextArea();
        label3 = new JLabel();
        textArea3 = new JTextArea();
        textField1 = new JTextField();
        textField2 = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new CompoundBorder(
                new TitledBorder(new EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", TitledBorder.CENTER,
                    TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                    Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //---- label1 ----
                label1.setText(bundle.getString("TectCircles.label1.text"));
                contentPanel.add(label1);
                label1.setBounds(0, 15, 165, 25);

                //======== scrollPane1 ========
                {

                    //---- textArea1 ----
                    textArea1.setEditable(false);
                    textArea1.setFont(new Font("Times New Roman", Font.BOLD, 14));
                    textArea1.setEnabled(false);
                    textArea1.setFocusable(false);
                    scrollPane1.setViewportView(textArea1);
                }
                contentPanel.add(scrollPane1);
                scrollPane1.setBounds(60, 45, 240, 30);

                //---- label2 ----
                label2.setText(bundle.getString("TectCircles.label2.text"));
                contentPanel.add(label2);
                label2.setBounds(0, 80, 165, 25);

                //---- textArea2 ----
                textArea2.setEditable(false);
                textArea2.setFont(new Font("Times New Roman", Font.BOLD, 14));
                textArea2.setEnabled(false);
                textArea2.setFocusable(false);
                contentPanel.add(textArea2);
                textArea2.setBounds(65, 105, 236, 26);

                //---- label3 ----
                label3.setText(bundle.getString("TectCircles.label3.text"));
                contentPanel.add(label3);
                label3.setBounds(0, 141, 245, 25);

                //---- textArea3 ----
                textArea3.setEditable(false);
                textArea3.setFont(new Font("Times New Roman", Font.BOLD, 14));
                textArea3.setEnabled(false);
                textArea3.setFocusable(false);
                contentPanel.add(textArea3);
                textArea3.setBounds(25, 200, 236, 26);

                //---- textField1 ----
                textField1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField1ActionPerformed(e);
                    }
                });
                contentPanel.add(textField1);
                textField1.setBounds(175, 80, 80, 25);

                //---- textField2 ----
                textField2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField2ActionPerformed(e);
                    }
                });
                contentPanel.add(textField2);
                textField2.setBounds(140, 170, 80, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < contentPanel.getComponentCount(); i++) {
                        Rectangle bounds = contentPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = contentPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    contentPanel.setMinimumSize(preferredSize);
                    contentPanel.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("TectCircles.okButton.text"));
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        okButtonMousePressed(e);
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Oxana Dudnik
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JLabel label2;
    private JTextArea textArea2;
    private JLabel label3;
    private JTextArea textArea3;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
