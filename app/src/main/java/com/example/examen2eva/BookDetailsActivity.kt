package com.example.examen2eva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookDetailsActivity : AppCompatActivity() {
    private lateinit var nombre:EditText
    private lateinit var año:EditText
    private lateinit var boton: Button
    private lateinit var titulo_paginas : Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        nombre = findViewById(R.id.editText1)
        año = findViewById(R.id.editText2)
        boton = findViewById(R.id.button)

        val texto = titulo_paginas.getStringExtra("tituloYpaginas")


        boton.setOnClickListener {
            if (nombre.text.toString().isNotBlank() && año.text.toString()
                    .toInt() > 0 && año.text.toString().isNotBlank()
            ) {
                val intent = Intent(this@BookDetailsActivity,BookDisplayActivity::class.java)
                intent.putExtra(
                    "tituloYpaginasYautorYaño",
                    "$texto Nombre:${nombre.text.toString()} Año:${año.text.toString()} _"
                )
                startActivity(intent)
            }
        }
    }

}