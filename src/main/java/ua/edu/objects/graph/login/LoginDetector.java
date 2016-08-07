/*
 * Created by JFormDesigner on Mon Mar 26 21:28:35 EEST 2012
 */

package ua.edu.objects.graph.login;


import ua.edu.debug.Printer;
import ua.edu.file.MyFiler;
import ua.edu.dataBase.create.GeneratorDataTable;

import javax.swing.*;
import javax.swing.FocusManager;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Oxana Nastasyuk                                       /
 */
public class LoginDetector extends JPanel {
    public static String nameDataBase = "LoginTable";
    public String login = "";
    public String password = "";
    public String loginDef = "Admin";
    public String passwordDef = "Admin";
    public String textDef = "Lg" + loginDef + "Psw" + new String(passwordDef);
    public Object owner;
    boolean frameIs = false;
    private static GeneratorDataTable gen = new GeneratorDataTable(nameDataBase, false);

    public static boolean isCorrectLogin = false;

    public static boolean isCorrectLogin() {
        return isCorrectLogin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDetector() {
        isCorrectLogin = false;
        frameIs = false;
        if (!found(textDef))
            MyFiler.writeTextIntoFile(gen.getPathToDataBase(nameDataBase), new StringBuffer(textDef));
        initComponents();
        this.setVisible(true);
    }

    public LoginDetector(JPanel owner) {
        this();
        this.owner = (JPanel) owner;
        owner.add(this);
    }

    public LoginDetector(JFrame owner) {
        this();
        frameIs = true;
        this.owner = (JFrame) owner;
        owner.add(this);
    }

    public void close() {
        this.setVisible(false);
/*
        LoginAction action = new LoginAction();
        Printer.intoConsole("Event");
        this.getActionMap().put(action.getValue(Action.NAME), action);
        if (owner == null) {


            Printer.intoConsole("close2");
            return;
        }
        //this.getParent().handleEvent(new ActionEvent(this,this.getParent().action));
        Printer.intoConsole("close3");
        if (this.frameIs) {
            ((JFrame) owner).addWindowListener(new LoginListener());
            ((JFrame) owner).setFocusable(true);
            ((JFrame) owner).setEnabled(true);
            Printer.intoConsole("JFrame");

        } else {
            ((JPanel) owner).getActionMap()
                    .put(action.getValue(Action.NAME), action);
            Printer.intoConsole("JPanel");
            ((JPanel) owner).setFocusable(true);
            ((JPanel) owner).setEnabled(true);

        }
        this.setVisible(false);
*/
    }

    public boolean found(String text) {
    return MyFiler.findTextInFile(gen.getPathToDataBase(nameDataBase), text);
    }

    public boolean isPasswordCorrect(char[] password) {
        return found("Lg" + login + "Psw" + new String(password));
    }

    public void passwordFieldActionPerformed(ActionEvent e) {
        char[] passwordCharArray = passwordField.getPassword();
        login = textField.getText();
        System.out.println("login " + login + "!");

        if (isPasswordCorrect(passwordCharArray)) {
            System.out.println("Correct  password.");
            isCorrectLogin = true;
            this.close();

        } else {
            JOptionPane.showMessageDialog(this, "Sorry. Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
            resetForm();

        }
    }

    private void passwordFieldKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && e.getID() == KeyEvent.KEY_PRESSED) {

            char[] passwordCharArray = passwordField.getPassword();
            login = textField.getText();

            if (isPasswordCorrect(passwordCharArray)) {
                System.out.println("Correct  password.");
                isCorrectLogin = true;
                this.close();

            } else {

                JOptionPane.showMessageDialog(this,
                        "Sorry. Try again.", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                resetForm();

            }

        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE && e.getID() == KeyEvent.KEY_PRESSED) {
            resetForm();
        }
    }

    public void resetForm() {
        isCorrectLogin = false;
        this.login = "";
        this.password = "";
        this.passwordField.setText(password);
        this.textField.setText(login);

        if (FocusManager.getCurrentManager().getFocusOwner().equals(this.passwordField)) {
            FocusManager.getCurrentManager().focusNextComponent(this.textField);
            this.nextFocus();
        }
        this.passwordField.repaint();
        this.textField.repaint();
    }

    public void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        label2 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        passwordField = new JPasswordField();
        textField = new JTextField();

        //======== this ========
        setBackground(new Color(0, 153, 255));
        setBorder(null);

        setLayout(null);

        //---- label2 ----
        label2.setText("Input your login, please!");
        label2.setBackground(new Color(204, 255, 255));
        label2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        label2.setIcon(new ImageIcon(getClass().getResource("/ua/edu/objects/resources/images/JavaCoffe32X32.jpg")));
        add(label2);
        label2.setBounds(55, 50, 232, 21);

        //---- label1 ----
        label1.setText("login:");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        label1.setHorizontalAlignment(SwingConstants.TRAILING);
        add(label1);
        label1.setBounds(10, 80, 90, 35);

        //---- label3 ----
        label3.setText("password:");
        label3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        label3.setHorizontalAlignment(SwingConstants.TRAILING);
        add(label3);
        label3.setBounds(15, 125, 90, 35);

        //---- passwordField ----
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordFieldActionPerformed(e);
            }
        });
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                passwordFieldKeyPressed(e);
            }
        });
        add(passwordField);
        passwordField.setBounds(115, 130, 200, 35);
        add(textField);
        textField.setBounds(115, 80, 200, 35);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for (int i = 0; i < getComponentCount(); i++) {
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
        LoginAction action = new LoginAction();
        if (((JComponent) owner) != null) {
            ((JComponent) owner).
                    getActionMap()
                    .put(action.getValue(Action.NAME), action);

            if (frameIs) {
                ((JFrame) owner).addWindowListener(new LoginListener());
            }
        }

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Asya Dudnik
    private JLabel label2;
    private JLabel label1;
    private JLabel label3;
    private JPasswordField passwordField;
    private JTextField textField;

    // JFormDesigner - End of variables declaration  //GEN-END:variables
    class LoginListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            if (!isCorrectLogin) {
                Printer.intoConsole("WindowEvent");
                if (JOptionPane.showConfirmDialog(null, "Do you want exit really?") == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            } else {
                Printer.intoConsole("WindowEvent");


            }
        }
    }

    class LoginAction extends AbstractAction {
        public LoginAction() {
            super((isCorrectLogin) ? "Login success" : "Login failed");
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println((isCorrectLogin) ? "Login success" : "Login failed");

        }
    }


}
