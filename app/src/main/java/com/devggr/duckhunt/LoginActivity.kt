package com.devggr.duckhunt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.devggr.duckhunt.common.Constantes
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    private lateinit var comenzar: Button
    private lateinit var nickname: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        comenzar = findViewById(R.id.btnStart)
        nickname = findViewById(R.id.edtNickname)


        comenzar.setOnClickListener {
            var i = Intent(applicationContext, GameActivity::class.java)
            i.putExtra(Constantes::EXTRA_NICK.toString(), edtNickname.text)
            startActivity(i)
        }
    }
}
