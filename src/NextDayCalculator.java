import java.time.chrono.IsoChronology;

public class NextDayCalculator {
    public static int[] nextDayCalculator(int[] day) {
        if (day[0] == 30 && (day[1] == 4 || day[1] == 6 || day[1] == 9 || day[1] == 11)) {
            return new int[]{1, day[1] + 1, day[2]};
        }
        if (day[0] == 31) {
            if (day[1] == 12) return new int[]{1, 1, day[2] + 1};
            return new int[]{1, day[1] + 1, day[2]};
        }
        if (day[1] == 2) {
            if (day[0] == 29) return new int[]{1, 3, day[2]};
            if (day[0] == 28) {
                if (IsoChronology.INSTANCE.isLeapYear(day[2])) return new int[]{29, 2, day[2]};
                return new int[]{1, 3, day[2]};
            }
        }
        return new int[]{day[0] + 1, day[1], day[2]};
    }
}
