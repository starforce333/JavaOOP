package lesson03.school;

import lesson03.school.exception.NegativeException;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double a;
        for (; ; ) {

            try {
                a = Double.valueOf(JOptionPane.showInputDialog("Input double number"));
                if (a < 0) {
                    throw new NegativeException();
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error number format");
            } catch (NullPointerException e) {
                a = 0;
                JOptionPane.showMessageDialog(null, "Cancel");
                break;
            } catch (NegativeException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println(a);
    }
}

