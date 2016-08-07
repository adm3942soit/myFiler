/*
 * Created by JFormDesigner on Mon Apr 30 09:27:27 EEST 2012
 */

package ua.edu.objects.graph.test;


import ua.edu.debug.Printer;
import ua.edu.objects.graph.login.LoginDetector;
import ua.edu.objects.graph.menuFiler.MenuFiler;

import javax.swing.FocusManager;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ResourceBundle;

/**
 * @author Asya Dudnik
 */
public class TestForm extends JFrame {

    public TestForm() {
        initComponents();
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        System.exit(0);
    }

        private void dialogPaneComponentRemoved(ContainerEvent e) {
            if(LoginDetector.isCorrectLogin)
            {
                Printer.intoConsole("Yse!!");
                loginDetector1.close();
                this.menuFiler1.setVisible(true);
                this.repaint();
            }
        }


        private void loginDetector1ComponentHidden(ComponentEvent e) {
            Printer.intoConsole("loginDetector1ComponentHidden");
            this.menuFiler1.setVisible(true);
            this.menuFiler1.setPreferredSize(this.getSize());
            this.cancelButton.setVisible(false);
            if (!FocusManager.getCurrentManager().getFocusOwner().equals(this.menuFiler1)) {
                FocusManager.getCurrentManager().focusNextComponent(this.menuFiler1);
                this.nextFocus();
            }

        }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("ua.edu.objects.resources.resources");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        loginDetector1 = new LoginDetector();
        menuFiler1 = new MenuFiler();
        buttonBar = new JPanel();
        cancelButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
/*
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});
*/

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //---- loginDetector1 ----
                loginDetector1.setBorder(LineBorder.createBlackLineBorder());
                loginDetector1.addComponentListener(new ComponentAdapter() {
                    @Override
                    public void componentHidden(ComponentEvent e) {
                        loginDetector1ComponentHidden(e);
                    }
                });
                contentPanel.add(loginDetector1);
                loginDetector1.setBounds(20, 25, 350, 320);

                //---- menuFiler1 ----
                menuFiler1.setVisible(false);
                contentPanel.add(menuFiler1);
                menuFiler1.setBounds(10, 10, 330, 320);

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

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("MyObjects_cancelButton.text"));
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cancelButtonActionPerformed(e);
                    }
                });
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
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
    // Generated using JFormDesigner Evaluation license - Asya Dudnik
    private JPanel dialogPane;
    private JPanel contentPanel;
    private LoginDetector loginDetector1;
    private MenuFiler menuFiler1;
    private JPanel buttonBar;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    class FrameListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
        {
           if(JOptionPane.showConfirmDialog(null, "Do you want exit really?")==JOptionPane.OK_OPTION)
           {
            System.exit(0);
           }
        }
    }
}
