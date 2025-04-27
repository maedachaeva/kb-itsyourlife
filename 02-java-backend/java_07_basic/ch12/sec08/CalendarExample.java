package java_07_basic.ch12.sec08;

import java.time.Year;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // 년월일
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // 0부터 시작
        int day = calendar.get(Calendar.DAY_OF_MONTH); // 1부터 시작

        // 요일
        int week = calendar.get(Calendar.DAY_OF_WEEK); // 일(1), 월(2), ...
        String strWeek = null;
        switch (week) {
            case Calendar.MONDAY:
                strWeek = "월요일";
                break; 
            case Calendar.TUESDAY:
                strWeek = "화요일";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "수요일";
                break;
            case Calendar.THURSDAY:
                strWeek = "목요일";
                break;
            case Calendar.FRIDAY:
                strWeek = "금요일";
                break;
            case Calendar.SATURDAY:
                strWeek = "토요일";
                break;
            default:
                strWeek = "일요일";
                break;
        }

        // 오전오후
        int amPm = calendar.get(Calendar.AM_PM); // 오전(0), 오후(1)
        String strAmPm = null;
        if (amPm == Calendar.AM) {
            strAmPm = "오전";
        } else {
            strAmPm = "오후";
        }

        // 시간
        int hour = calendar.get(Calendar.HOUR); // HOUR(12시간제), HOUR_OF_DAY(24시간제)
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.printf("%d년 %d월 %d일\n", year, month, day);
        System.out.println(strWeek + " " + strAmPm);
        System.out.printf("%d시 %d분 %d초", hour, minute, second);
    }
}
