/*
 * Created by JFormDesigner on Thu Apr 12 09:38:35 EEST 2012
 */

package ua.edu.objects.graph.menuFiler.viewFile;

import ua.edu.debug.Printer;
import ua.edu.file.MyFiler;
import ua.edu.workWithStr.box.MessageBox;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;

/**
 * @author Asya Dudnik
 */
public class WindowFileViewer extends JFrame {
    String fileText;
    String fileName;

    public WindowFileViewer(String nameFile) {
        fileName=nameFile;

           if(nameFile.endsWith(".txt") || !nameFile.matches("."))
           {
            this.fileText=MyFiler.readTextFromFile(nameFile);
            Printer.intoConsole("WindowFileViewer", fileText);
           }
           else {

              if(nameFile.endsWith(".doc") || nameFile.endsWith(".docx"))
              {
                  String[] str=MyFiler.
                          readDocFile(nameFile);
                  int index=0;
                  while(index<str.length)
                  {
                     this.fileText=str[index];
                     index++;
                  }
              }

           }
           if(this.fileText!=null)
                   initComponents();

           else {
               (new MessageBox()).messageShow(MyFiler.getError(),true);
               return;}

        }


    private void okButtonMousePressed(MouseEvent e) {
        Printer.intoConsole("okButtonMousePressed"+this.editorPane1.getText());

        if(MyFiler.writeTextIntoFile(fileName, new StringBuffer(this.editorPane1.getText())))
        {
           JOptionPane.showMessageDialog(this,"text wrote into file"+fileName);
        } else
        {
            JOptionPane.showMessageDialog(this,"Sorry!Text did not write into file"+fileName);
        }
    }

    private void cancelButtonMousePressed(MouseEvent e) {
        MessageBox box=new MessageBox();
        box.showString("Do you want exit without saving?", true, true);
        if( box.answer==MessageBox.ANSWER_YES){
            this.setVisible(false);
        }
        else{
            box.showString("Do you want save file ?", true, true);
            if( box.answer==MessageBox.ANSWER_YES)
            {
                Printer.debug("okButtonKeyPressed"+this.editorPane1.getText());

                if(MyFiler.writeTextIntoFile(fileName, new StringBuffer(this.editorPane1.getText())))
                {
                    JOptionPane.showMessageDialog(this,"text wrote into file"+fileName);
                } else
                {
                    JOptionPane.showMessageDialog(this,"Sorry!Text did not write into file"+fileName);
                }

            }else {
                setVisible(false);
            }

        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("resources.resources");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        scrollPane1 = new JScrollPane();
        editorPane1 = new JEditorPane();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/resources/images/StudyInJava !32X32.GIF")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                    Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //======== scrollPane1 ========
                {
                    scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
                    scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                    scrollPane1.setViewportView(editorPane1);
                }
                contentPanel.add(scrollPane1);
                scrollPane1.setBounds(0, 0, 365, 200);

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
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("WindowFileViewer.okButton.text"));
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        okButtonMousePressed(e);
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("WindowFileViewer.cancelButton.text"));
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        cancelButtonMousePressed(e);
                    }
                });
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void okButtonKeyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER && e.getID()==KeyEvent.KEY_PRESSED){
           MessageBox box=new MessageBox();
            box.showString("Do you want save file really?", true, true);
          if( box.answer==MessageBox.ANSWER_YES)
          {
              Printer.debug("okButtonKeyPressed"+this.editorPane1.getText());

              if(MyFiler.writeTextIntoFile(fileName, new StringBuffer(this.editorPane1.getText())))
              {
                  JOptionPane.showMessageDialog(this,"text wrote into file"+fileName);
              } else
              {
                  JOptionPane.showMessageDialog(this,"Sorry!Text did not write into file"+fileName);
              }

          }
        }
    }
    private void escKeyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE && e.getID()==KeyEvent.KEY_PRESSED){
            MessageBox box=new MessageBox();
            box.showString("Do you want exit without saving?", true, true);
            if( box.answer==MessageBox.ANSWER_YES){
                this.setVisible(false);
            }
            else{
                box.showString("Do you want save file ?", true, true);
                if( box.answer==MessageBox.ANSWER_YES)
                {
                    Printer.debug("okButtonKeyPressed"+this.editorPane1.getText());

                    if(MyFiler.writeTextIntoFile(fileName, new StringBuffer(this.editorPane1.getText())))
                    {
                        JOptionPane.showMessageDialog(this,"text wrote into file"+fileName);
                    } else
                    {
                        JOptionPane.showMessageDialog(this,"Sorry!Text did not write into file"+fileName);
                    }

                }else {
                    setVisible(false);
                }

            }

        }

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Asya Dudnik
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JScrollPane scrollPane1;
    private JEditorPane editorPane1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
