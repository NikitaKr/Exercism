import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;

public class Gigasecond {

    LocalDateTime dateTime;
    
    public Gigasecond(LocalDate moment) {
        dateTime = moment.atStartOfDay().plusSeconds(1000000000);

    }
    public Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
        
    }
}
