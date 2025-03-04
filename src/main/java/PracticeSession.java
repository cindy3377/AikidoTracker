import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeSession {
    private LocalDate date;
    private int duration;

    public PracticeSession(LocalDate date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }
}

class AikidoTracker {
    private List<PracticeSession> sessions = new ArrayList<>();

    public void addSession(String date, int duration) {
        sessions.add(new PracticeSession(LocalDate.parse(date), duration));
    }

    public int getTotalPracticeTime() {
        return sessions.stream().mapToInt(PracticeSession::getDuration).sum();
    }

    public boolean isEligibleForGraduation() {
        if (sessions.isEmpty()) return false;
        LocalDate firstSessionDate = sessions.get(0).getDate();
        LocalDate currentDate = LocalDate.now();
        long monthsElapsed = ChronoUnit.MONTHS.between(firstSessionDate, currentDate);
        return monthsElapsed >= 6 || sessions.size() >= 100;
    }
}
