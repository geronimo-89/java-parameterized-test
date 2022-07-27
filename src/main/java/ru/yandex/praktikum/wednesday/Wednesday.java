package ru.yandex.praktikum.wednesday;
import java.util.Calendar;
public class Wednesday {
    public static void itIsWednesday() {
        Calendar calendar = Calendar.getInstance();
        int today = calendar.get(Calendar.DAY_OF_WEEK);
        if (today == 4)
            System.out.println("It is Wednesday, my dudes!");
    }
}
