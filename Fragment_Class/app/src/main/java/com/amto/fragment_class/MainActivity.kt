package com.amto.fragment_class

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn_Fragmento: Button

    private lateinit var fragment1: Fragmento_1
    private lateinit var fragment2: Fragmento_2
    private lateinit var fragment3: Fragmento_3

    private var decicion = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Fragmento = findViewById(R.id.btnFragmento)
        btn_Fragmento.setOnClickListener{
            insertarFragmento(it)
        }

    }

    private fun insertarFragmento(view: View){
        //Toast.makeText(this, "Changing Fragments", Toast.LENGTH_LONG).show()
        fragment1 = Fragmento_1()
        fragment2 = Fragmento_2()
        fragment3 = Fragmento_3()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        if (decicion == 0){
            transaction.replace(R.id.container, fragment1)
            transaction.addToBackStack(null)
            transaction.commit()
            decicion++
        }

        else if (decicion == 1){
            transaction.replace(R.id.container, fragment2)
            transaction.addToBackStack(null)
            transaction.commit()
            decicion++
        }

        else if (decicion == 2){
            transaction.replace(R.id.container, fragment3)
            transaction.addToBackStack(null)
            transaction.commit()
            decicion = 0
        }

    }

}
