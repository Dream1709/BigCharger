import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTest {

    GradeCalculator calculator = new GradeCalculator();

    @Test
    public void tc001_score100_isA() {
        assertEquals("A", calculator.gradeOf(100));
    }

    @Test
    public void tc002_score80_isA() {
        assertEquals("A", calculator.gradeOf(80));
    }

    @Test
    public void tc003_score79_isBPlus() {
        assertEquals("B+", calculator.gradeOf(79));
    }

    @Test
    public void tc004_score75_isBPlus() {
        assertEquals("B+", calculator.gradeOf(75));
    }

    @Test
    public void tc005_score74_isB() {
        assertEquals("B", calculator.gradeOf(74));
    }

    @Test
    public void tc006_score70_isB() {
        assertEquals("B", calculator.gradeOf(70));
    }

    @Test
    public void tc007_score69_isCPlus() {
        assertEquals("C+", calculator.gradeOf(69));
    }

    @Test
    public void tc008_score65_isCPlus() {
        assertEquals("C+", calculator.gradeOf(65));
    }

    @Test
    public void tc009_score64_isC() {
        assertEquals("C", calculator.gradeOf(64));
    }

    @Test
    public void tc010_score60_isC() {
        assertEquals("C", calculator.gradeOf(60));
    }

    @Test
    public void tc011_score59_isDPlus() {
        assertEquals("D+", calculator.gradeOf(59));
    }

    @Test
    public void tc012_score55_isDPlus() {
        assertEquals("D+", calculator.gradeOf(55));
    }

    @Test
    public void tc013_score54_isD() {
        assertEquals("D", calculator.gradeOf(54));
    }

    @Test
    public void tc014_score50_isD() {
        assertEquals("D", calculator.gradeOf(50));
    }

    @Test
    public void tc015_score49_isF() {
        assertEquals("F", calculator.gradeOf(49));
    }

    @Test
    public void tc016_score0_isF() {
        assertEquals("F", calculator.gradeOf(0));
    }

    @Test
    public void tc017_score90_isA() {
        assertEquals("A", calculator.gradeOf(90));
    }

    @Test
    public void tc018_score77_isBPlus() {
        assertEquals("B+", calculator.gradeOf(77));
    }

    @Test
    public void tc019_score72_isB() {
        assertEquals("B", calculator.gradeOf(72));
    }

    @Test
    public void tc020_score67_isCPlus() {
        assertEquals("C+", calculator.gradeOf(67));
    }

    @Test
    public void tc021_score62_isC() {
        assertEquals("C", calculator.gradeOf(62));
    }

    @Test
    public void tc022_score57_isDPlus() {
        assertEquals("D+", calculator.gradeOf(57));
    }

    @Test
    public void tc023_score52_isD() {
        assertEquals("D", calculator.gradeOf(52));
    }

    @Test
    public void tc024_score25_isF() {
        assertEquals("F", calculator.gradeOf(25));
    }


    @Test
    public void tc025_scoreMinus1_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gradeOf(-1));
    }

    @Test
    public void tc026_scoreMinus100_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gradeOf(-100));
    }


    @Test
    public void tc027_score101_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gradeOf(101));
    }

    @Test
    public void tc028_score1000_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gradeOf(1000));
    }
}