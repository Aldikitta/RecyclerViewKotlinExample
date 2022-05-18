package com.aldikitta.recyclerviewkotlinexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitList = listOf<Fruit>(
        Fruit("Mango", "Joe"),
        Fruit("Banana", "Andi"),
        Fruit("Guava", "Kevin"),
        Fruit("Pear", "Peter"),
        Fruit("Apple", "Stewie")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitList,
        ) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(
            this@MainActivity, "Selected Fruit is: ${fruit.supplier}", Toast.LENGTH_LONG
        ).show()
    }
}