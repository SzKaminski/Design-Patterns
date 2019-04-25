package singleton.zadanie;


import java.io.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    public void Log(String log) {
        ZonedDateTime timestamp = ZonedDateTime.now();
        DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String format = isoLocalDate.format(timestamp);
        System.out.printf("<%s> : <%s>", format, log);

        try (FileWriter fileWriter = new FileWriter("messages.log", true)){
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter writer = new PrintWriter(bufferedWriter);
            writer.printf("<%s> : <%s>\n", format, log);
         //   writer.write(timestamp + log + "\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
