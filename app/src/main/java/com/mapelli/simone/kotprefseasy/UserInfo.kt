package com.mapelli.simone.kotprefseasy

import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.enumpref.enumValuePref
import com.chibatching.kotpref.gsonpref.gsonPref
import java.util.*

object UserInfo: KotprefModel() {
    var gameLevel by enumValuePref(GameLevel.NORMAL)
    var name by stringPref()
    var code by nullableStringPref()
    var age by intPref()
    var highScore by longPref()
    var rate by floatPref()
    val prizes by stringSetPref {
        val set = TreeSet<String>()
        set.add("Beginner")
        return@stringSetPref set
    }
    // var avatar by gsonPref(Avatar())
}

enum class GameLevel {
    EASY,
    NORMAL,
    HARD
}