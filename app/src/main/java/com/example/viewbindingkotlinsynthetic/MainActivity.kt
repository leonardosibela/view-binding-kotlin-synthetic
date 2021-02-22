package com.example.viewbindingkotlinsynthetic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoImage.setBackgroundResource(R.drawable.android)

        nameText.text = "Felix Arvid Ulf Kjellberg"
        nicknameText.text = "PewDiePie"
        countryText.text = "Sweden"

        styleOneText.text = "Games"
        styleTwoText.text = "Comedy"
        styleThreeText.text = "React"
        styleFourText.text = "Terror"

        clickmeButton.setOnClickListener {
            Log.e("TAG", "Hello!")
        }
    }
}