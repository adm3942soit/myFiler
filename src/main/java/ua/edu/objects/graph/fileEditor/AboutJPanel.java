/*
 * Created by JFormDesigner on Sun Jan 29 11:41:38 EET 2012
 */

package ua.edu.objects.graph.fileEditor;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

/**
 * @author Oxana Nastasyuk
 */
public class AboutJPanel extends JFrame {
    public AboutJPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Oxana Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("ua.edu.objects.resources.resources");
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        setTitle(bundle.getString("AboutJPanel.this.title"));
        setAlwaysOnTop(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setMaximumSize(new Dimension(300, 300));
            textArea1.setMinimumSize(new Dimension(100, 100));
            textArea1.setPreferredSize(new Dimension(200, 200));
            textArea1.setText("Program licensed by Adonis company in 2012.");
            textArea1.setRows(2);
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Oxana Dudnik
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
