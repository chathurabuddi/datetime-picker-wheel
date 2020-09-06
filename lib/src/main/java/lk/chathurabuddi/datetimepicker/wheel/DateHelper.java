/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lk.chathurabuddi.datetimepicker.wheel;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateHelper {

    private static TimeZone timeZone = TimeZone.getDefault();

    public static void setTimeZone(TimeZone timeZoneValue)  {
        timeZone = timeZoneValue;
    }

    public static TimeZone getTimeZone() {
        return timeZone;
    }

    public static Calendar getCalendarOfDate(Date date){
        final Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeZone(timeZone);
        calendar.setTime(date);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar;
    }

    public static int getHour(Date date){
        return getCalendarOfDate(date).get(Calendar.HOUR);
    }

    public static int getHourOfDay(Date date){
        return getCalendarOfDate(date).get(Calendar.HOUR);
    }

    public static int getHour(Date date, boolean isAmPm){
        if(isAmPm){
            return getHourOfDay(date);
        } else {
            return getHour(date);
        }
    }

    public static int getMinuteOf(Date date) {
        return getCalendarOfDate(date).get(Calendar.MINUTE);
    }

    public static Date today() {
        Calendar now  = Calendar.getInstance(Locale.getDefault());
        now.setTimeZone(timeZone);
        return now.getTime();
    }

    public static int getMonth(Date date) {
        return getCalendarOfDate(date).get(Calendar.MONTH);
    }

    public static int getDay(Date date){
        return getCalendarOfDate(date).get(Calendar.DAY_OF_MONTH);
    }
}
