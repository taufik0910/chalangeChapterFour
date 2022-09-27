package com.example.chalangechapterfour

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.chalangechapterfour.databinding.ActivityMainBinding
import kotlin.collections.forEachIndexed as forEachIndexed1

class MainActivity : AppCompatActivity(), Callback {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val optPemain = arrayOf(
            binding.usrBatu,
            binding.usrKertas,
            binding.usrGunting,
        )

        val optCom = arrayOf(
            binding.comBatu,
            binding.comKertas,
            binding.comGunting,
        )

        val controller = Controller(this)

        optPemain.forEachIndexed1 { index, ImageView ->
            ImageView.setOnClickListener {
                val chosecom: ImageView = optCom.random()
                chosecom.setBackgroundResource(R.drawable.bg_rounded)
                controller.playingOption(
                    optPemain[index].contentDescription.toString().trim().lowercase(),
                    chosecom.contentDescription.toString().trim().lowercase()
                )
                optPemain.forEach {
                    it.setBackgroundResource(android.R.color.transparent)
                }
                optPemain[index].setBackgroundResource(R.drawable.bg_rounded)
            }

        }
        binding.btnRefresh.setOnClickListener {
            optPemain.forEach {
                it.setBackgroundResource(android.R.color.transparent)
            }
            optCom.forEach {
                it.setBackgroundResource(android.R.color.transparent)
            }
            hasil(R.string.vs, android.R.color.transparent, R.color.red,60f)

            Log.d("Refresh", "Masukkan Pilihan Lagi")
        }

    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun hasil(text: Int, bg: Int, textColor: Int, textSize: Float) {
        binding.txtResult.text = getString(text)
        binding.txtResult.setBackgroundColor(getColor(bg))
        binding.txtResult.setTextColor(getColor(textColor))
        binding.txtResult.setTextSize(textSize)
    }

}