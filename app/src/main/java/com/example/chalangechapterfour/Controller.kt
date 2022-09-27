package com.example.chalangechapterfour

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Controller(private val callback: Callback) : AppCompatActivity(), CallbackFunsi {

    override fun playingOption(pemain: CharSequence, computer: CharSequence) {

        when {
            pemain == "batu" && computer == "gunting" || pemain == "gunting" && computer == "kertas" || pemain == "kertas" && computer == "batu" -> {
                callback.uiResult(R.string.pemainmenang, R.color.green, R.color.white, 25f)
                Log.d("Hasil", "Pemain Menang!!")

            }
            pemain == "gunting" && computer == "batu" || pemain == "kertas" && computer == "gunting" || pemain == "batu" && computer == "kertas" -> {
                Log.d("Hasil", "Computer Menang!!")
                callback.uiResult(R.string.comwin, R.color.green, R.color.white, 25f)
            }

            else -> {
                Log.d("Hasil", "Draw")
                callback.uiResult(R.string.draw, R.color.purple_700, R.color.white, 40f)

            }
        }
        Log.d("Pilihan", "$pemain VS $computer")

    }
}