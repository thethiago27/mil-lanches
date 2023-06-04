package tech.thiagorsouza.utils;

import javax.swing.JOptionPane;

public class DialogMessage {

  public static void showMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
  }

  public static String showInput(String message) {
    return JOptionPane.showInputDialog(message);
  }

  public static int showIntegerInput(String message) {
    String input = JOptionPane.showInputDialog(message);
    return Integer.parseInt(input);
  }

  public static int showConfirm(String message) {
    return JOptionPane.showConfirmDialog(null, message);
  }

}
