package ua.edu.objects.graph.model;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Asya
 * Date: 5/2/12
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListComboBoxModel extends AbstractListModel implements ComboBoxModel {

        private Object selectedItem;

        private ArrayList anArrayList;

        public ArrayListComboBoxModel(ArrayList arrayList) {
            anArrayList = arrayList;
        }

        public Object getSelectedItem() {
            return selectedItem;
        }

        public void setSelectedItem(Object newValue) {
            selectedItem = newValue;
        }

        public int getSize() {
            return anArrayList.size();
        }

        public Object getElementAt(int i) {
            return anArrayList.get(i);
        }

}
