package com.naio.mmeteopersistence.common;


import java.util.Calendar;


/**
 * Class DateUtil Astrium (c), 2013
 */
public final class DateUtil
{

    /**
     * default constructor.
     * 
     */
    private DateUtil()
    {
    }

    /**
     * static method to get current time in UTC standard
     * 
     * @return {@link long}
     */
    public static long getCurrentUTCTime()
    {
        final Calendar c = Calendar.getInstance();
        return c.getTimeInMillis() + c.get(Calendar.ZONE_OFFSET) + c.get(Calendar.DST_OFFSET);
    }
}
