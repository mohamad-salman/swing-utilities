package ms.swingutils.textfield;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author MS
 */
public class Date {

    public static String localDateToString(LocalDate tanggal, String pattern) {
        return tanggal.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate stringToLocalDate(String tanggal, String pattern) {
        return LocalDate.parse(tanggal, DateTimeFormatter.ofPattern(pattern));
    }
}
