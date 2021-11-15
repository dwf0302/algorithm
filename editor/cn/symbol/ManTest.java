package editor.cn.symbol;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Objects;

/**
 * @author DWF
 */
public class ManTest {

    public static String CalculateUtil(BigDecimal a, BigDecimal b) {
        a = Objects.isNull(a) ? new BigDecimal(0) : a;
        b = Objects.isNull(b) ? new BigDecimal(0) : b;
        if (0 == b.intValue() && 0 != a.intValue()) {
            return "100%";
        } else if (0 == b.intValue()) {
            return "-";
        } else {
            return a.multiply(new BigDecimal(100)).divide(b, 2, BigDecimal.ROUND_HALF_UP) + "%";
        }
    }

    /**
     * 获取多少天前零点时间戳
     */
    public static long getDayOfMonthByTimestamp(long timestamp, int count) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - count);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }


    public static void main(String[] args) {
        System.out.println(3%8);
    }
}
