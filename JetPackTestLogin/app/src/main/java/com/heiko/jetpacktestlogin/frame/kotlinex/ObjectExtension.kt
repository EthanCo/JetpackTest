package com.heiko.jetpacktestlogin.frame.kotlinex


/**
 * Object 扩展
 *
 * @author EthanCo
 * @since 2017/6/30
 */
fun Any.getString(stringId: Int): String {
    return KotlinGlobal.context.getString(stringId)
}

fun Any.getString(stringId: Int, formatArg: Any): String {
    return KotlinGlobal.context.getString(stringId, formatArg)
}

fun Any.getString(stringId: Int, formatArg: Any, formatArg2: Any): String {
    return KotlinGlobal.context.getString(stringId, formatArg, formatArg2)
}

fun Any.getString(stringId: Int, formatArg: Any, formatArg2: Any, formatArg3: Any): String {
    return KotlinGlobal.context.getString(stringId, formatArg, formatArg2, formatArg3)
}