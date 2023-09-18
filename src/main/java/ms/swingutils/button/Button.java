package ms.swingutils.button;

import java.util.Arrays;
import javax.swing.JButton;

/**
 *
 * @author MS
 */
public class Button {

    public static void enableButtons(JButton... buttons) {
        Arrays.asList(buttons)
                .forEach(btn -> btn.setEnabled(true));
    }

    public static void disableButtons(JButton... buttons) {
        Arrays.asList(buttons)
                .forEach(btn -> btn.setEnabled(false));
    }
}
