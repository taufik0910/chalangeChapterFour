package com.example.chalangechapterfour

import androidx.appcompat.app.AppCompatActivity

class Controller(private val callback: Callback) : AppCompatActivity(), Callback {
    override fun playing(player: String, com: String) {

        if (player.equals(com)) {
            callback.callbackColor(R.string.draw, R.drawable.bg_blank, R.color.red)
        } else if (player.equals("batu")) {
            if (com.equals("gunting")) {
                callback.callbackColor(R.string.pemainmenang, R.drawable.bg_blank, R.color.green)
            } else {
                callback.callbackColor(R.string.comwin, R.drawable.bg_blank, R.color.red)
            }

        } else if (player.equals("gunting")) {
            if (com.equals("kertas")) {
                callback.callbackColor(R.string.pemainmenang, R.drawable.bg_blank, R.color.green)
            } else {
                callback.callbackColor(R.string.comwin, R.drawable.bg_blank, R.color.red)
            }
        } else if (player.equals("kertas")) {
            if (com.equals("batu")) {
                callback.callbackColor(R.string.pemainmenang, R.drawable.bg_blank, R.color.green)
            } else {
                callback.callbackColor(R.string.comwin, R.drawable.bg_blank, R.color.red)
            }
        } else {
            callback.callbackColor(R.string.comwin, R.drawable.bg_blank, R.color.red)
        }

    }

}