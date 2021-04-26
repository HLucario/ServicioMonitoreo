package com.example.serviciomonitoreo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SeleccionHijo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_hijo)
        val btnAceptar=findViewById<Button>(R.id.btnAceptar)
        val btnFinalizar=findViewById<Button>(R.id.btnFinalizar)
        btnAceptar.setOnClickListener {
            Intent(this, MonitoreoService::class.java).also {
                startService(it)

            }
        }
        btnFinalizar.setOnClickListener {
            Intent(this, MonitoreoService::class.java).also {
                stopService(it)
            }
        }


    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MiServicio","onDestroyActivity...")
    }
}