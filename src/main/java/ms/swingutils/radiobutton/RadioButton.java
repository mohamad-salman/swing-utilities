package ms.swingutils.radiobutton;

import javax.swing.JRadioButton;

/**
 *
 * @author MS
 */
public class RadioButton {
     public static void selectRadioButton(JRadioButton radioButton) {
        radioButton.setSelected(true);
    }

    public static void unSelectRadioButton(JRadioButton radioButton) {
        radioButton.setSelected(false);
    }

    public static boolean isRadioButtonSelected(JRadioButton radioButton) {
        return radioButton.isSelected();
    }
}
