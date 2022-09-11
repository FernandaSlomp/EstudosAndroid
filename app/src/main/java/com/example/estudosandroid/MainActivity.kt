package com.example.estudosandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // o primero é o CONTEXTO É A ORIGEM
        // o segundo é a referencia
        var alterarIntentproAbout1 = Intent(this, AboutActivity1::class.java)
        var alterarIntentproAbout2 = Intent(this, AboutActivity2::class.java)

        findViewById<Button>(R.id.btn_que_vai_pro_About_1)
             .setOnClickListener{
            startActivity(alterarIntentproAbout1)
        }

        findViewById<Button>(R.id.btn_que_vai_pro_About_2)
            .setOnClickListener{
            startActivity(alterarIntentproAbout2)
        }

        var intentComExtra = Intent(this, SettingsActivity::class.java) //criando a intenção

        intentComExtra.putExtra("nome", "Alan") //passa chave e valor - chave é string tipo uma label

        startActivity(intentComExtra)
    }
}