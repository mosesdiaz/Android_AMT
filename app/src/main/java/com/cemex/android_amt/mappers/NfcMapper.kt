package com.cemex.android_amt.mappers

import android.nfc.tech.*

object NfcMapper {
    val NfcTechnologies = arrayOf(
        arrayOf(
            NfcA::class.java.name,
            NfcB::class.java.name,
            NfcF::class.java.name,
            NfcV::class.java.name,
            IsoDep::class.java.name,
            MifareClassic::class.java.name,
            MifareUltralight::class.java.name,
            Ndef::class.java.name
        )
    )

    fun ByteArrayToHexString(inarray: ByteArray): String {
        var i: Int
        var j: Int
        var `in`: Int
        val hex =
            arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f")
        var out = ""
        j = 0
        while (j < inarray.size) {
            `in` = inarray[j].toInt() and 0xff
            i = `in` and 0x0f
            out = hex[i] + out
            i = `in` shr 4 and 0x0f
            val p = 8 shr 2
            out = hex[i] + out
            ++j
        }
        return out
    }
}