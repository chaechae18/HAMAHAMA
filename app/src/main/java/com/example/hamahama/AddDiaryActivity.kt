package com.example.hamahama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class AddDiaryActivity : AppCompatActivity() {

    //파이어베이스
    val fbdb = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_diary)

        //Spinner 에 들어갈 데이터
        val member = listOf("1명", "2명", "3명", "4명")

        //Spinner 객체 생성
        val memberSpinner: Spinner = findViewById(R.id.memberSpinner)

        //어댑터 생성
        val adapter: ArrayAdapter<String> = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, member)

        //어댑터 설정
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)

        //Spinner 에 어댑터 적용
        memberSpinner.adapter = adapter
    }
}