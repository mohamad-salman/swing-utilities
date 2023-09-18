package ms.swingutils.checkbox;

import java.util.Arrays;
import javax.swing.JCheckBox;

/**
 *
 * @author MS
 */
public class CheckBox {
    public static void uncheckCheckBoxes(JCheckBox... checkBoxes) {
        Arrays.asList(checkBoxes)
                .forEach(cb -> cb.setSelected(false));
    }
}
