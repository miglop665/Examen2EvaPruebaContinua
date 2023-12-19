package com.example.examen2eva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {
    private lateinit var libros:TextView
    private lateinit var boton:Button
    private lateinit var titulo_paginas_nombre_año : Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)

        libros = findViewById(R.id.textView)
        boton = findViewById(R.id.button)

        val texto = titulo_paginas_nombre_año.getStringExtra("tituloYpaginasYautorYaño")
        var listaLibros = listOf<String>()
        var textoLibros:String = ""
        if (texto != null) {
            listaLibros = texto.split('_')
            for(i in 1..listaLibros.size){
                textoLibros=listaLibros[i].toString()
            }
        }
        libros.text= textoLibros

        boton.setOnClickListener {
            val intent = Intent(this@BookDisplayActivity,BookTitleActivity::class.java)
            intent.putExtra(
                    "tituloYpaginasYautorYaño",
                    "titulo_paginas_nombre_año"
            )
            startActivity(intent)
            }
        }
    }

