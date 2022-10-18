package com.example.hamahama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hamahama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mbinding : ActivityMainBinding? = null
    private val binding get() = mbinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //일기 추가 버튼을 누르면 일기 추가 팝업으로 이동
       binding.addDiary.setOnClickListener{
           val intent = Intent(this, AddDiaryActivity::class.java)
           startActivity(intent)
       }
    }
}