/*
 * Created by JFormDesigner on Sat Jan 28 19:07:33 EET 2012
 */

package ua.edu.objects.graph.fileEditor;

import com.jgoodies.forms.factories.Borders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;


/**
 * @author Oxana Nastasyuk
 */
public class FileViewer extends JFrame {
    String nameImage;
    public FileViewer() {
        //nameImage=MyFiler.getCurrentDirectory()+"\\src\\ua\\od\\edu\\resources\\images\\StudyInJava !32X32.GIF";
        initComponents();
    }

    private void cancelButtonMousePressed(MouseEvent e) {
        System.exit(0);
    }

    private void menuItem1MousePressed(MouseEvent e) {

        Explorer exp = new Explorer();
        //exp.setPreferredSize(new Dimension(300,300));
        exp.pack();
        exp.setVisible(true);
    }

    private void menuItem2MousePressed(MouseEvent e) {
         System.exit(0);
    }

    private void menuItem4MousePressed(MouseEvent e) {
        AboutJPanel panel=new AboutJPanel();
        panel.pack();
        panel.setVisible(true);

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
        menuItem4 = new JMenuItem();
        buttonBar = new JPanel();
        cancelButton = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(200, 200));
        setIconImage(((ImageIcon)UIManager.getIcon("FileView.computerIcon")).getImage());
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
            dialogPane.setMaximumSize(new Dimension(500, 500));
            dialogPane.setPreferredSize(new Dimension(450, 400));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                    Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setPreferredSize(new Dimension(450, 350));
                contentPanel.setMaximumSize(new Dimension(500, 500));
                contentPanel.setBorder(UIManager.getBorder("OptionPane.border"));
                contentPanel.setLayout(null);

                //======== menuBar1 ========
                {
                    menuBar1.setPreferredSize(new Dimension(450, 50));
                    menuBar1.setBorder(UIManager.getBorder("MenuBar.border"));
                    menuBar1.setMaximumSize(new Dimension(500, 100));

                    //======== menu1 ========
                    {
                        menu1.setText(bundle.getString("FileViewer.menu1.text"));
                        menu1.setMaximumSize(new Dimension(100, 100));
                        menu1.setMinimumSize(new Dimension(30, 20));
                        menu1.setPreferredSize(new Dimension(100, 30));

                        //---- menuItem1 ----
                        menuItem1.setText(bundle.getString("FileViewer.menuItem1.text"));
                        menuItem1.setMaximumSize(new Dimension(300, 300));
                        menuItem1.setPreferredSize(new Dimension(100, 30));
                        menuItem1.setMinimumSize(new Dimension(200, 200));
                        menuItem1.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {
                                menuItem1MousePressed(e);
                                menuItem1MousePressed(e);
                            }
                        });
                        menu1.add(menuItem1);

                        //---- menuItem2 ----
                        menuItem2.setText(bundle.getString("FileViewer.menuItem2.text"));
                        menuItem2.setPreferredSize(new Dimension(100, 30));
                        menuItem2.setMaximumSize(new Dimension(100, 100));
                        menuItem2.setMinimumSize(new Dimension(50, 50));
                        menuItem2.setBackground(SystemColor.desktop);
                        menuItem2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {
                                menuItem2MousePressed(e);
                            }
                        });
                        menu1.add(menuItem2);
                    }
                    menuBar1.add(menu1);

                    //======== menu2 ========
                    {
                        menu2.setText(bundle.getString("FileViewer.menu2.text"));
                        menu2.setMaximumSize(new Dimension(100, 100));
                        menu2.setMinimumSize(new Dimension(50, 50));
                        menu2.setPreferredSize(new Dimension(100, 30));

                        //---- menuItem4 ----
                        menuItem4.setText(bundle.getString("FileViewer.menuItem4.text"));
                        menuItem4.setPreferredSize(new Dimension(100, 30));
                        menuItem4.setMaximumSize(new Dimension(100, 100));
                        menuItem4.setMinimumSize(new Dimension(50, 30));
                        menuItem4.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mousePressed(MouseEvent e) {
                                menuItem4MousePressed(e);
                            }
                        });
                        menu2.add(menuItem4);
                    }
                    menuBar1.add(menu2);
                }
                contentPanel.add(menuBar1);
                menuBar1.setBounds(0, 10, 368, 50);

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
                buttonBar.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
                buttonBar.setLayout(null);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("FileViewer.cancelButton.text"));
                cancelButton.setPreferredSize(new Dimension(70, 50));
                cancelButton.setBorder(Borders.BUTTON_BAR_GAP_BORDER);
                cancelButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        cancelButtonMousePressed(e);
                    }
                });
                buttonBar.add(cancelButton);
                cancelButton.setBounds(255, 5, 100, 40);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < buttonBar.getComponentCount(); i++) {
                        Rectangle bounds = buttonBar.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = buttonBar.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    buttonBar.setMinimumSize(preferredSize);
                    buttonBar.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(605, 435);
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
    private JMenuItem menuItem4;
    private JPanel buttonBar;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
