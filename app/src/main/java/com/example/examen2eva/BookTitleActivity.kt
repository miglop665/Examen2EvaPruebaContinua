package com.example.examen2eva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookTitleActivity : AppCompatActivity() {
    private lateinit var titulo:EditText
    private lateinit var numpaginas:EditText
    private lateinit var boton: Button
    private lateinit var titulo_paginas_nombre_año : Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.booky_title_activity)

        titulo = findViewById(R.id.editText1)
        numpaginas = findViewById(R.id.editText2)
        boton = findViewById(R.id.button)

        val texto = titulo_paginas_nombre_año.getStringExtra("tituloYpaginasYautorYaño")

        boton.setOnClickListener {
            if (titulo.text.toString().isNotBlank() && numpaginas.text.toString()
                    .toInt() > 0 && numpaginas.text.toString().isNotBlank()
            ) {
                val intent = Intent(this@BookTitleActivity,BookDetailsActivity::class.java)
                intent.putExtra(
                    "tituloYpaginas",
                    "$texto Titulo: ${titulo.text.toString()} Paginas: ${numpaginas.text.toString()}"
                )
                startActivity(intent)
            }
        }
    }

}