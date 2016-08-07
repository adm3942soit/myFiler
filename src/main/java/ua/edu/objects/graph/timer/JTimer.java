/*
 * Created by JFormDesigner on Wed May 02 10:43:12 EEST 2012
 */

package ua.edu.objects.graph.timer;


import ua.edu.debug.Printer;
import ua.edu.objects.constants.Global;
import ua.edu.objects.graph.timer.timeZone.TimeZoneChooser;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import java.util.TimeZone;

/**
 * @author Asya Dudnik
 */
public class JTimer extends JFrame {


    TimeZone zone;
    TimeZoneChooser tz=new TimeZoneChooser();


    public JTimer() {
        initComponents();
        this.setPreferredSize(Global.maxSize);
        this.setMinimumSize(Global.minSize);
    }

    private void menuItem1ActionPerformed(ActionEvent e) {
        tz.setVisible(true);
        tz.repaint();
        this.repaint();
        zone=TimeZone.getTimeZone(tz.getSelectedValue());
        Printer.intoConsole(zone.getDisplayName());
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("resources.resources");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menu2 = new JMenu();
        timeZoneChooser1 = new TimeZoneChooser();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setAlwaysOnTop(true);
        setIconImage(new ImageIcon(getClass().getResource("/resources/images/dialog_question.png")).getImage());
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

                //======== menuBar1 ========
                {

                    //======== menu1 ========
                    {
                        menu1.setText(bundle.getString("JTimer.menu1.text"));

                        //---- menuItem1 ----
                        menuItem1.setText(bundle.getString("JTimer.menuItem1.text"));
                        menuItem1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                menuItem1ActionPerformed(e);
                            }
                        });
                        menu1.add(menuItem1);

                        //---- menuItem2 ----
                        menuItem2.setText(bundle.getString("JTimer.menuItem2.text"));
                        menu1.add(menuItem2);
                    }
                    menuBar1.add(menu1);

                    //======== menu2 ========
                    {
                        menu2.setText(bundle.getString("JTimer.menu2.text"));
                    }
                    menuBar1.add(menu2);
                }
                contentPanel.add(menuBar1);
                menuBar1.setBounds(0, 5, 370, menuBar1.getPreferredSize().height);

                //---- timeZoneChooser1 ----
                timeZoneChooser1.setMaximumSize(new Dimension(800, 800));
                timeZoneChooser1.setVisible(false);
                contentPanel.add(timeZoneChooser1);
                timeZoneChooser1.setBounds(5, 30, 495, 300);

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
            dialogPane.add(contentPanel, BorderLayout.WEST);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("JTimer.okButton.text"));
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("JTimer.cancelButton.text"));
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
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenu menu2;
    private TimeZoneChooser timeZoneChooser1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
