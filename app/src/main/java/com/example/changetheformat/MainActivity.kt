package com.example.changetheformat

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView: EditText
    private lateinit var changeFormat: ImageView
    private lateinit var done: ImageView
    private lateinit var finalResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<EditText>(R.id.edData)
        changeFormat = findViewById<ImageView>(R.id.changeFormat)
        finalResult = findViewById<TextView>(R.id.finalResult)
        done = findViewById<ImageView>(R.id.done)
        init()
        finalResult.text = textView.text.toString()
    }

    private fun init() {
        isViewEnable(false)
        changeFormat.setOnClickListener {
            isViewEnable(true)
            done.visibility = View.VISIBLE
        }

        done.setOnClickListener {
            isViewEnable(false)
            it.visibility = View.GONE
            finalResult.text = textView.text.toString()
        }
    }

    private fun isViewEnable(isEnable: Boolean) {
        textView.isEnabled = isEnable
    }
}
