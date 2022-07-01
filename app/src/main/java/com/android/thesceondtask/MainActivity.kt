package com.android.thesceondtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.graphics.toColor
import com.android.thesceondtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var num : Int = 1
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickBtnAddOrder()
        clickBtnMinusOrder()
        clickOnBtnSize()
        clickOnBtnSizeSecond()
        clickOnBtnSizeThird()
        clickOnBtnSizeForth()
    }
    private fun clickBtnAddOrder(){
        binding.appCompatButton.setOnClickListener {
            ++num
            binding.defaultOrders.text = num.toString()
        }
    }
    private fun clickBtnMinusOrder(){
        binding.minus.setOnClickListener {
            if (num >= 1)
            --num
            binding.defaultOrders.text = num.toString()
        }
    }
    private fun clickOnBtnSize(){
        binding.imageButton.setOnClickListener {
            binding.imageButton.setImageResource(R.drawable.white_text)
            binding.imageButton.setBackgroundResource(R.drawable.back_click)
        }
    }
    private fun clickOnBtnSizeForth(){
            binding.imageButton4.setOnClickListener {
                binding.imageButton4.setImageResource(R.drawable.white_text)
                binding.imageButton4.setBackgroundResource(R.drawable.back_click)
        }
    }
    private fun clickOnBtnSizeSecond(){
        binding.imageButton2.setOnClickListener {
            binding.imageButton2.setImageResource(R.drawable.white_text)
            binding.imageButton2.setBackgroundResource(R.drawable.back_click)
        }
    }
    private fun clickOnBtnSizeThird(){
        binding.imageButton3.setOnClickListener {
            binding.imageButton3.setImageResource(R.drawable.white_text)
            binding.imageButton3.setBackgroundResource(R.drawable.back_click)
        }
    }
}