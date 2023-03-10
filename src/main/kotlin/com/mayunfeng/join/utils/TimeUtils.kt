package com.mayunfeng.join.utils

import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs


object TimeUtils {

    fun getCurrentTime(
        format: String = "yyyy-MM-dd HH:mm:ss",
        date: Date = Date()
    ): String = SimpleDateFormat(format, Locale.CHINA).format(date)


    /**
     * 获得两个日期间差
     *
     * @param beginDate
     * @param endDate
     * @return long 单位 秒
     */
    fun getTimeDistance(beginDate: Date, endDate: Date): Long {
        val time = (Calendar.getInstance().apply {
            time = endDate
        }.timeInMillis - Calendar.getInstance().apply {
            time = beginDate
        }.timeInMillis) / 1000
        return abs(time)
    }


    fun getTimeDistance(beginDate: String, endDate: String, format: String = "yyyy-MM-dd HH:mm:ss"): Long {
        val format = SimpleDateFormat(format, Locale.CHINA)
        return getTimeDistance(format.parse(beginDate), format.parse(endDate))

    }



    fun getDateDistanceYear(statrDate: String, endDate: String, dateType: String = "yyyy-MM-dd"): Int {
        val sdf = SimpleDateFormat(dateType, Locale.CHINA)
        val bef = Calendar.getInstance()
        val aft = Calendar.getInstance()
        bef.time = sdf.parse(statrDate)
        aft.time = sdf.parse(endDate)
        val surplus = aft[Calendar.DATE] - bef[Calendar.DATE]
        var result = aft[Calendar.MONTH] - bef[Calendar.MONTH]
        val year = aft[Calendar.YEAR] - bef[Calendar.YEAR]
        println(result)
        result = if (result > 0) {
            1
        } else if (result == 0) {
            if (surplus <= 0) 0 else 1
        } else {
            0
        }
        return year + result
    }


}