package com.capstone.goloak.helper

import java.text.DateFormat
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

fun String.withNumberingFormat(): String {
    return NumberFormat.getNumberInstance(Locale("in", "ID")).format(this.toDouble())
}

fun String.withDateFormat(): String {
    val format = SimpleDateFormat("dd/MM/yyyy", Locale.US)
    val date = format.parse(this) as Date
    return DateFormat.getDateInstance(DateFormat.FULL).format(date)
}