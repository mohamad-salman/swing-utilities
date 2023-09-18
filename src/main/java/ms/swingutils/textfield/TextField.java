package ms.swingutils.textfield;

import java.time.LocalDate;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author MS
 */
public class TextField {

// get value
    public static String getString(JTextField textField) {
        return textField.getText();
    }

    public static String getString(JComboBox comboBox) {
        return comboBox.getSelectedItem().toString();
    }

    public static LocalDate getDate(JTextField textField, String datePattern) {
        return Date.stringToLocalDate(getString(textField), datePattern);
    }

    public static int getInt(JTextField textField) {
        return Integer.valueOf(getString(textField));
    }

    public static double getDouble(JTextField textField) {
        return Double.valueOf(getString(textField));
    }

// state
    public static void enableTextFields(JTextField... textFields) {
        Arrays.asList(textFields)
                .forEach(txtField -> txtField.setEnabled(true));
    }

    public static void disableTextFields(JTextField... textFields) {
        Arrays.asList(textFields)
                .forEach(txtField -> txtField.setEnabled(false));
    }

    // set value
    public static void clearTextFields(JTextField... textFields) {
        Arrays.asList(textFields)
                .forEach(txtField -> setTextFieldValue(txtField, ""));
    }

    public static void setTextFieldValue(JTextField textField, String string) {
        textField.setText(string);
    }

    public static void setTextFieldValue(JTextField textField, LocalDate date, String datePattern) {
        setTextFieldValue(textField, Date.localDateToString(date, datePattern));
    }

    public static void setTextFieldValue(JTextField textField, int num) {
        setTextFieldValue(textField, String.valueOf(num));
    }
    
    public static void setTextFieldValue(JTextField textField, double num) {
        setTextFieldValue(textField, String.valueOf(num));
    }

// focus
    public static void setFocusToTextField(JTextField textField) {
        textField.requestFocus();
    }

}
