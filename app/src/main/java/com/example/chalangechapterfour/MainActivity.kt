package com.example.chalangechapterfour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.chalangechapterfour.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), Callback {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val controller = Controller(this)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val optUser = arrayListOf(
            binding.usrBatu, binding.usrGunting, binding.usrKertas
        )

        val optCom = arrayListOf(
            binding.comBatu, binding.comGunting, binding.comKertas
        )

        optUser.forEachIndexed { index, ImageView ->
            ImageView.setOnClickListener {
                val choseCom: ImageView = optCom.random()
                choseCom.setBackgroundResource(R.drawable.bg_rounded)
                controller.playing(
                    optUser[index].contentDescription.toString().trim().lowercase(),
                    choseCom.contentDescription.toString().trim().lowercase()
                )
                optUser.forEach {
                    it.setBackgroundResource(android.R.color.transparent)
                }
                optUser[index].setBackgroundResource(R.drawable.bg_rounded)
            }
        }

        binding.btnRefresh.setOnClickListener {
            optUser.forEach {
                it.setBackgroundResource(android.R.color.transparent)
            }
            optCom.forEach {
                it.setBackgroundResource(android.R.color.transparent)
            }
        }

    }


}