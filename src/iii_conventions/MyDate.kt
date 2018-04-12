package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) {

    operator fun compareTo(other: MyDate): Int {
        if (year != other.year) {
            return Integer.compare(year, other.year)
        } else if (month != other.month) {
            return Integer.compare(month, other.month)
        } else {
            return Integer.compare(dayOfMonth, other.dayOfMonth)
        }
    }
}

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(candidate: MyDate): Boolean {
        return start <= candidate && candidate <= endInclusive
    }
}
