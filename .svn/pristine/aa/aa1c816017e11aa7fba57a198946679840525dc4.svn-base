/*
 * Created by JFormDesigner on Wed May 02 12:31:42 EEST 2012
 */

package ua.edu.objects.graph.timer.timeZone;

import com.jgoodies.forms.factories.*;
import ua.edu.objects.constants.Global;
import ua.edu.objects.graph.model.ArrayListComboBoxModel;
import ua.edu.objects.graph.timer.date.TimeZoneStruct;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * @author Asya Dudnik
 */
public class TimeZoneChooser extends JPanel {

    ArrayList<String>list= TimeZoneStruct.getListTimeZones();
    ArrayListComboBoxModel model = new ArrayListComboBoxModel(list);
    String selectedValue;

    public TimeZoneChooser() {
        initComponents();
        comboBox1.setModel(model);
        comboBox1.setSelectedIndex(0);
        selectedValue=comboBox1.getSelectedItem().toString();
        this.setPreferredSize(Global.size);
        //this.setVisible(false);
    }

/*
    public TimeZoneChooser(Dialog owner) {
        super();
        initComponents();
        selectedValue=comboBox1.getSelectedItem().toString();
        this.setPreferredSize(Global.size);
        setVisible(true);
        owner.add(this);

    }
*/

    private void okButtonActionPerformed(ActionEvent e) {
        selectedValue=comboBox1.getSelectedItem().toString();
        setVisible(false);
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    private void thisKeyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ESCAPE )
        {
          this.setVisible(false);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Asya Dudnik
        ResourceBundle bundle = ResourceBundle.getBundle("resources.resources");
        dialogPane = new JPanel();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setBorder(Borders.createEmptyBorder("10dlu, 10dlu, 10dlu, 10dlu"));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                thisKeyPressed(e);
            }
        });

        // JFormDesigner evaluation mark
        setBorder(new CompoundBorder(
            new TitledBorder(new EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", TitledBorder.CENTER,
                TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(null);

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(null);

            //---- label1 ----
            label1.setText(bundle.getString("TimeZoner.label1.text"));
            dialogPane.add(label1);
            label1.setBounds(5, 45, 376, 25);
            dialogPane.add(comboBox1);
            comboBox1.setBounds(12, 100, 376, 30);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("TimeZoner.okButton.text"));
                okButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        okButtonActionPerformed(e);
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("TimeZoner.cancelButton.text"));
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
            dialogPane.add(buttonBar);
            buttonBar.setBounds(12, 251, 376, buttonBar.getPreferredSize().height);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < dialogPane.getComponentCount(); i++) {
                    Rectangle bounds = dialogPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = dialogPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                dialogPane.setMinimumSize(preferredSize);
                dialogPane.setPreferredSize(preferredSize);
            }
        }
        add(dialogPane);
        dialogPane.setBounds(0, 0, 400, 300);

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
    private JPanel dialogPane;
    private JLabel label1;
    private JComboBox comboBox1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
/*
    private class ValueReporter implements ListDataListener {
        public void valueChanged(ListSelectionEvent event) {
            if (!event.getValueIsAdjusting())
                selectedValue = list.getSelectedValue().toString();
            label1.setText(list.getSelectedValue().toString());
        }
    }
*/
}
