/*
 * Created by JFormDesigner on Sat Jan 28 19:59:06 EET 2012
 */

package ua.edu.objects.graph.fileEditor;

import com.intellij.uiDesigner.core.*;
import com.jgoodies.forms.factories.*;

import ua.edu.file.MyFiler;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ResourceBundle;

//import myFiler.MyFiler;


/**
 * @author Oxana Nastasyuk
 */
public class Explorer extends JFrame {
   ResourceBundle bundle=null;
    public Explorer() {

        initComponents();
    }

    public Explorer(JFrame owner) {
        initComponents();
        owner.add(this);
    }


    private void fileChooser1ActionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)){
          try{
           fileChooser1.addChoosableFileFilter(new TextFilter());

           FileController fc=new FileController(fileChooser1.getSelectedFile());
              fc.setVisible(true);
          }catch(Exception ex)
          {
             System.out.println("Txt - files only!"); 
          }

       }
        if(e.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)){

            this.setVisible(false);

        }

    }

    Dimension minSize=new Dimension(300,300);
    Dimension maxSize=new Dimension(700, 700);
    Dimension size = new Dimension(500, 600);

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Oxana Dudnik
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        fileChooser1 = new JFileChooser();

        //======== this ========
        setMinimumSize(new Dimension(300, 300));
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), 5, -1));

        //======== dialogPane ========
        {
            dialogPane.setBorder(Borders.DIALOG_BORDER);
            dialogPane.setPreferredSize(new Dimension(360, 220));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                    Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setPreferredSize(new Dimension(360, 220));
                contentPanel.setMaximumSize(new Dimension(600, 600));
                contentPanel.setMinimumSize(new Dimension(300, 300));
                contentPanel.setLayout(null);

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

            //---- fileChooser1 ----
            fileChooser1.setPreferredSize(new Dimension(400, 400));
            fileChooser1.setMinimumSize(new Dimension(300, 300));
            fileChooser1.setMaximumSize(new Dimension(600, 600));
            fileChooser1.setCurrentDirectory(null);
            fileChooser1.addActionListener(e -> fileChooser1ActionPerformed(e));
            dialogPane.add(fileChooser1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Oxana Dudnik
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JFileChooser fileChooser1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
class TextFilter extends FileFilter {

  public boolean accept(File f) {
    if (f.isDirectory())
      return true;
    String s = f.getName();
    int i = s.lastIndexOf('.');

    if (i > 0 && i < s.length() - 1)
      if (s.substring(i + 1).toLowerCase().equals("txt"))
        return true;

    return false;
  }

  public String getDescription() {
    return "Accepts txt files only.";
  }
}
}
