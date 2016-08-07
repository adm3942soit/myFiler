/*
 * Copyright (c) 2012. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/*
 * Created by JFormDesigner on Tue Apr 10 10:21:43 EEST 2012
 */

package ua.edu.objects.graph.menuFiler.createFile;


import ua.edu.debug.Printer;
import ua.edu.file.MyFiler;
import ua.edu.objects.graph.menuFiler.MenuFiler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;

/**
 * @author Oxana Nastasyuk
 */
public class WindowFileCreater extends JFrame {
    private String fileName;
    private String path;

    public WindowFileCreater() {

        initComponents();
    }

    private void buttonCreateFileMousePressed(MouseEvent e) {
        this.setFileName(this.textField1.getText());
        Printer.intoConsole("WindowFileCreater", getFileName());
        if(MyFiler.createFile(this.getFileName()))
        {
            this.setPath(MyFiler.getPath(this.getFileName()));

            Printer.intoConsole("WindowFileCreater",getPath());
            MenuFiler.writeInDataBasePathFile(getPath());
            JOptionPane.showMessageDialog(this,"Created file"+
                    MyFiler.getPath(this.getFileName()));
        }else
        {
           JOptionPane.showMessageDialog(this,"Sorry,I can't create file"
                   + MyFiler.getPath(this.getFileName()));
        }


    }

    private void thisKeyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE && e.getID()==KeyEvent.KEY_PRESSED){
           this.setVisible(false);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("ua.edu.objects.resources.resources");
        labelCreateFile = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(300, 300));
        setName("dialogCreateFile");
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- labelCreateFile ----
        labelCreateFile.setText(bundle.getString("WindowFileCreater.labelCreateFile.text"));
        labelCreateFile.setBackground(new Color(0, 153, 153));
        labelCreateFile.setForeground(Color.cyan);
        contentPane.add(labelCreateFile);
        labelCreateFile.setBounds(32, 26, 360, labelCreateFile.getPreferredSize().height);
        contentPane.add(textField1);
        textField1.setBounds(32, 63, 360, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText(bundle.getString("WindowFileCreater.button1.text"));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                buttonCreateFileMousePressed(e);
            }
        });
        button1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                thisKeyPressed(e);
            }
        });

        contentPane.add(button1);
        button1.setBounds(32, 120, 360, button1.getPreferredSize().height);

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

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Asya Dudnik
    private JLabel labelCreateFile;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
