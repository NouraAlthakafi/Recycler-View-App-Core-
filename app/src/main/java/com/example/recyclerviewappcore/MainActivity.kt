package com.example.recyclerviewappcore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var rvCapital: RecyclerView
    var cities = ArrayList<String>()
    lateinit var nameCity: EditText
    lateinit var Ent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvCapital = findViewById (R.id.rvCapitalCity)
        nameCity = findViewById (R.id.Acity)
        Ent = findViewById (R.id.button)
        cities = ArrayList()
        cities.add("Capital Cities")
        cities.add("Riyadh")
        cities.add("Jerusalem")
        rvCapital.adapter = RecyclerViewAdapter(cities)
        rvCapital.layoutManager = LinearLayoutManager(this)
        Ent.setOnClickListener{
            cities.add(nameCity.text.toString())
            nameCity.text.clear()
            nameCity.clearFocus()
            rvCapital.adapter?.notifyDataSetChanged()
        }
    }
}
