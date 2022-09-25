package com.example.chalangechapterfour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.example.chalangechapterfour.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), Callback {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val optUser = arrayListOf(
            binding.usrBatu,
            binding.usrGunting,
            binding.usrKertas
        )

        val optCom = arrayListOf(
            binding.comBatu,
            binding.comGunting,
            binding.comKertas
        )

        val controller = Controller(this)

        binding.btnRefresh.setOnClickListener {
            optCom.forEach {

            }
        }




    }

}