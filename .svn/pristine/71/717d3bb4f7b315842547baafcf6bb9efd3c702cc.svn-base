/*
 * Copyright (c) 2012. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/*
 * Created by JFormDesigner on Tue Apr 10 10:09:31 EEST 2012
 */

package ua.edu.objects.graph.menuFiler;


import ua.edu.dataBase.create.GeneratorDataTable;
import ua.edu.debug.Printer;
import ua.edu.file.MyFiler;
import ua.edu.objects.constants.Global;
import ua.edu.objects.graph.fileEditor.AboutJPanel;
import ua.edu.objects.graph.menuFiler.createFile.WindowFileCreater;
import ua.edu.objects.graph.menuFiler.viewFile.WindowFileViewer;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.ResourceBundle;

/**
 * @author Oxana Nastasyuk
 */
public class MenuFiler extends JPanel {
    protected static String fullFileName ;
    protected static String baseName = "FilerTable";
    protected static String fullBaseName;
    private String textFile = "";
    private boolean ok=false;

    public static String getBaseName() {
        return baseName;
    }

    public MenuFiler() {
        if (!initDataBase()) return;
        initComponents();
    }

    protected boolean initDataBase() {
       GeneratorDataTable gen=new GeneratorDataTable(baseName, false);
        fullBaseName=gen.getPathToDataBase();
        return true;
    }

    public static boolean writeInDataBasePathFile(String path) {
        boolean isOk = MyFiler.writeTextIntoFile(fullBaseName, new StringBuffer(path));
        return isOk;
    }

    public static String readPathFromDataBase() {
        Printer.intoConsole("MenuFiler", "readPathFromDataBase()", "fullBaseName " + fullBaseName);
        String nameFile=MyFiler.readTextFromFile(fullBaseName);
        nameFile=nameFile.replaceAll("\n", "");
        nameFile=nameFile.replaceAll("\r", "");
        nameFile=nameFile.trim();
        Printer.intoConsole("MenuFiler", "readPathFromDataBase()", nameFile);
        return nameFile;
    }

    private void createFileMousePressed(MouseEvent e) {
        WindowFileCreater win = new WindowFileCreater();
        this.setFullFileName(readPathFromDataBase());

    }

    private void openFileMousePressed(MouseEvent e) {
        String nameFile=readPathFromDataBase();
        WindowFileViewer view = new WindowFileViewer(nameFile);
        view.setPreferredSize(Global.size);
        view.setVisible(true);
    }

    private void exitMousePressed(MouseEvent e) {
        System.exit(0);
    }

    private void menuItemAboutActionPerformed(ActionEvent e) {
        AboutJPanel aboutJPanel= new AboutJPanel();
        aboutJPanel.setIconImage(new ImageIcon(getClass().getResource("/ua/edu/objects/resources/images/StudyInJava !32X32.GIF")).getImage());
        aboutJPanel.setVisible(true);
    }

    private void buttonCancelMousePressed(MouseEvent e) {
        System.exit(0);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("ua.edu.objects.resources.resources");
        menuFiler = new JMenuBar();
        menuFile = new JMenu();
        menuItemCreateFile = new JMenuItem();
        menuItemOpenFile = new JMenuItem();
        menuItemExit = new JMenuItem();
        menuHelp = new JMenu();
        menuItemAbout = new JMenuItem();
        buttonCancel = new JButton();

        //======== this ========
        setBackground(new Color(51, 102, 255));
        setBorder(new TitledBorder(new LineBorder(Color.blue, 3), bundle.getString("menuFiler.this.border"), TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
            new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14), Color.cyan));
        setToolTipText(bundle.getString("menuFiler.this.toolTipText"));
        setMaximumSize(new Dimension(600, 600));
        setMinimumSize(new Dimension(386, 300));
        setPreferredSize(new Dimension(386, 400));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", TitledBorder.CENTER,
                TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //======== menuFiler ========
        {
            menuFiler.setBackground(new Color(51, 255, 255));
            menuFiler.setMinimumSize(new Dimension(100, 50));
            menuFiler.setMaximumSize(new Dimension(400, 80));
            menuFiler.setPreferredSize(new Dimension(150, 50));

            //======== menuFile ========
            {
                menuFile.setText(bundle.getString("menuFiler.menuFile.text"));
                menuFile.setBackground(new Color(0, 102, 255));
                menuFile.setForeground(Color.cyan);
                menuFile.setIcon(new ImageIcon(getClass().getResource("/ua/edu/objects/resources/images/StudyInJava !32X32.GIF")));
                menuFile.setActionCommand(bundle.getString("menuFiler.menuFile.actionCommand"));
                menuFile.setPreferredSize(new Dimension(70, 40));
                menuFile.setMaximumSize(new Dimension(115, 100));

                //---- menuItemCreateFile ----
                menuItemCreateFile.setText(bundle.getString("menuFiler.menuItemCreateFile.text"));
                menuItemCreateFile.setBackground(new Color(0, 102, 255));
                menuItemCreateFile.setForeground(Color.cyan);
                menuItemCreateFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
                menuItemCreateFile.setIcon(new ImageIcon(getClass().getResource("/ua/edu/objects/resources/images/open.jpg")));
                menuItemCreateFile.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        createFileMousePressed(e);
                    }
                });
                menuFile.add(menuItemCreateFile);

                //---- menuItemOpenFile ----
                menuItemOpenFile.setText(bundle.getString("menuFiler.menuItemOpenFile.text"));
                menuItemOpenFile.setBackground(new Color(0, 102, 255));
                menuItemOpenFile.setForeground(Color.cyan);
                menuItemOpenFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
                menuItemOpenFile.setIcon(new ImageIcon(getClass().getResource("/ua/edu/objects/resources/images/openfile.jpg")));
                menuItemOpenFile.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        openFileMousePressed(e);
                    }
                });
                menuFile.add(menuItemOpenFile);

                //---- menuItemExit ----
                menuItemExit.setText(bundle.getString("menuFiler.menuItemExit.text_2"));
                menuItemExit.setBackground(new Color(0, 102, 255));
                menuItemExit.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        exitMousePressed(e);
                    }
                });
                menuFile.add(menuItemExit);
            }
            menuFiler.add(menuFile);

            //======== menuHelp ========
            {
                menuHelp.setText(bundle.getString("menuFiler.menuHelp.text"));
                menuHelp.setIcon(new ImageIcon(getClass().getResource("/ua/edu/objects/resources/images/dialog_question.png")));
                menuHelp.setToolTipText(bundle.getString("menuFiler.menuHelp.toolTipText"));
                menuHelp.setMaximumSize(new Dimension(115, 100));

                //---- menuItemAbout ----
                menuItemAbout.setText(bundle.getString("menuFiler.menuItemAbout.text"));
                menuItemAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK));
                menuItemAbout.setIcon(new ImageIcon(getClass().getResource("/ua/edu/objects/resources/images/about.jpg")));
                menuItemAbout.setBackground(new Color(0, 102, 204));
                menuItemAbout.setForeground(Color.cyan);
                menuItemAbout.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        menuItemAboutActionPerformed(e);
                    }
                });
                menuHelp.add(menuItemAbout);
            }
            menuFiler.add(menuHelp);
        }
        add(menuFiler);
        menuFiler.setBounds(20, 20, 255, menuFiler.getPreferredSize().height);

        //---- buttonCancel ----
        buttonCancel.setText(bundle.getString("menuFiler.buttonCancel.text"));
        buttonCancel.setBackground(new Color(0, 204, 255));
        buttonCancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                buttonCancelMousePressed(e);
            }
        });
        add(buttonCancel);
        buttonCancel.setBounds(195, 195, buttonCancel.getPreferredSize().width, 42);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Asya Dudnik
    private JMenuBar menuFiler;
    private JMenu menuFile;
    private JMenuItem menuItemCreateFile;
    private JMenuItem menuItemOpenFile;
    private JMenuItem menuItemExit;
    private JMenu menuHelp;
    private JMenuItem menuItemAbout;
    private JButton buttonCancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public static String getFullFileName() {
        return fullFileName;
    }

    public static void setFullFileName(String fullFileName) {
        MenuFiler.fullFileName = fullFileName;
    }

    public String getTextFile() {
        return textFile;
    }

    public void setTextFile(String textFile) {
        this.textFile = textFile;
    }
}
