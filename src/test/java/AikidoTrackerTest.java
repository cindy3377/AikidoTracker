import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AikidoTrackerTest {
    @Test
    void testAddPracticeSession() {
        AikidoTracker tracker = new AikidoTracker();
        tracker.addSession("2024-02-01", 90);
        assertEquals(90, tracker.getTotalPracticeTime());
    }

    @Test
    void testGraduationEligibility() {
        AikidoTracker tracker = new AikidoTracker();
        tracker.addSession("2023-08-01", 90); // More than 6 months ago
        assertTrue(tracker.isEligibleForGraduation());
    }
}