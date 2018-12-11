package lesson10.home.translate;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class DicUpdate {
    private Map<String, String> myMap = new HashMap<>();


    public DicUpdate() {
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void update(String word) {
        try {
            myMap.put(word, String.valueOf(JOptionPane.showInputDialog("Input translation of word " + word)));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Cancel");
        }
        System.out.println("Dictionary updated");

    }

}
