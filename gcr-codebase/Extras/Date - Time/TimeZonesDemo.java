import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesDemo {
    public static void main(String[] args) {
        // Formatter for readable output
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Current times in different zones
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));      // IST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));// PST/PDT

        // Display
        System.out.println("GMT: " + gmt.format(fmt));
        System.out.println("IST: " + ist.format(fmt));
        System.out.println("PST: " + pst.format(fmt));
    }
}