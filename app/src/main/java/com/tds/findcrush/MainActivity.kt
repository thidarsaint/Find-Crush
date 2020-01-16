package com.tds.findcrush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tds.findcrush.Adapter.PersonAdapter
import com.tds.findcrush.model.Person

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.recycle_crush)
        val personDetails = ArrayList<Person>()
        personDetails.add(Person("Dilraba", R.drawable.dilraba_two,R.drawable.dilraba_four))
        personDetails.add(Person("Yang Yang", R.drawable.yangyang_one, R.drawable.yangyang_two))

        personDetails.add(Person("Li Xian", R.drawable.lixian_three, R.drawable.lixian_three))

        val personAdapter = PersonAdapter(personDetails)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = personAdapter
    }
}
