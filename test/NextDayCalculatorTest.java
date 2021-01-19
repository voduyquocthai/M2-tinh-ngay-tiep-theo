import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

public class NextDayCalculatorTest {

    @Test
    public void testFindNextDay01() throws ParseException {
        String date = "2018/01/01";
        String expected = "2018/01/02";
        String result = NextDayCalculator.findNextDay(date);
        assertEquals(result,expected);
    }

    @Test
    public void testFindNextDay02() throws ParseException {
        String date = "2018/01/31";
        String expected = "2018/02/01";
        String result = NextDayCalculator.findNextDay(date);
        assertEquals(result,expected);
    }

    @Test
    public void testFindNextDay03() throws ParseException {
        String date = "2018/04/30";
        String expected = "2018/05/01";
        String result = NextDayCalculator.findNextDay(date);
        assertEquals(result,expected);
    }

    @Test
    public void testFindNextDay04() throws ParseException {
        String date = "2018/02/28";
        String expected = "2018/03/01";
        String result = NextDayCalculator.findNextDay(date);
        assertEquals(result,expected);
    }

    @Test
    public void testFindNextDay05() throws ParseException {
        String date = "2020/02/29";
        String expected = "2020/03/01";
        String result = NextDayCalculator.findNextDay(date);
        assertEquals(result,expected);
    }

    @Test
    public void testFindNextDay06() throws ParseException {
        String date = "2018/12/31";
        String expected = "2019/01/01";
        String result = NextDayCalculator.findNextDay(date);
        assertEquals(result,expected);
    }
}