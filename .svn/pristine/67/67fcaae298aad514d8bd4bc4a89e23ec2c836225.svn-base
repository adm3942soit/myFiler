/*
 * Created by JFormDesigner on Sun Jan 29 15:32:20 EET 2012
 */

package ua.edu.objects.graph.fileEditor;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * @author Oxana Nastasyuk
 */
public class FileController extends JFrame {
    public StringBuilder s=new StringBuilder();
    public char ps=10;
    public char vk=13;
    public FileController(File file) {

        if(file.exists()){
            try {
                FileReader tempRead=new FileReader(file);
                BufferedReader buf=new BufferedReader(tempRead);
                String temp;
                while((temp=buf.readLine())!=null)
                {
                  s.append(temp);s.append(ps);s.append(vk);  
                  System.out.println(s);
                }
                tempRead.close();
                //FileViewer viewer=new FileViewer();
            } catch (FileNotFoundException e) {
               // e.printStackTrace();  //To change body of catch statement use MyFile | Settings | MyFile Templates.
                System.out.println("MyFile not found!");
            } catch (IOException e) {
                //e.printStackTrace();  //To change body of catch statement use MyFile | Settings | MyFile Templates.
                System.out.println("MyFile not readably!");
            }
        }
        initComponents();

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Oxana Nastasyuk

        textArea1 = new JTextArea(s.toString());
        scrollPane1 = new JScrollPane(textArea1);
        //======== this ========
        setMinimumSize(new Dimension(200, 200));
        this.setPreferredSize(new Dimension(500, 500));
        setMaximumSize(new Dimension(500, 500));
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //======== scrollPane1 ========
        {
            scrollPane1.setMinimumSize(new Dimension(200, 200));
            scrollPane1.setMaximumSize(new Dimension(500, 500));
            scrollPane1.setPreferredSize(new Dimension(400, 400));
            scrollPane1.setAutoscrolls(true);
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

            //---- textArea1 ----
            textArea1.setMinimumSize(new Dimension(200, 200));
            textArea1.setPreferredSize(new Dimension(300, 300));
            textArea1.setMaximumSize(new Dimension(500, 500));
            textArea1.setText(s.toString());
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    public void view()
    {

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Oxana Nastasyuk
    private JScrollPane scrollPane1;

    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
