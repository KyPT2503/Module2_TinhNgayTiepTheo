import java.time.chrono.IsoChronology;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] days = {{1, 1, 2018}, {31, 1, 2018}, {30, 4, 2018}, {28, 2, 2018}, {29, 2, 2020}, {31, 12, 2018}};
        int[][] expected = {{2, 1, 2018}, {1, 2, 2018}, {1, 5, 2018}, {1, 3, 2018}, {1, 3, 2020}, {1, 1, 2020}};
        System.out.println(IsoChronology.INSTANCE.isLeapYear(2019));
    }
}
