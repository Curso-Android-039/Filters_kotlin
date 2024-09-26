package com.example.kotlin_039

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.kotlin_039.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    private val numbersList = listOf("one", "five", "two", "three", "four")
    private val instanceList = listOf(null, 1, "two", 3.0, "four")
    private val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    private val unsortedList = listOf(7, 8, 5, 3, 2, 4)





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


     // Botón 1: Filtrar y mostrar solo elementos no nulos de instanceList

        binding.buttonFilter1.setOnClickListener {

             val filteredList = instanceList.filterNotNull().toString()
            binding.textViewResult.text = "Filter 1 $filteredList"
        }

         // Botón 2: Ordenar y mostrar unsortedList

          binding.buttonFilter2.setOnClickListener {

              val sortedList = unsortedList.sorted().toString()
              binding.textViewResult.text = "Filter 2: $sortedList"
          }


           // Botón 3: Mostrar las claves del numbersMap

        binding.buttonFilter3.setOnClickListener {

            val keyList = numbersMap.keys.toString()
            binding.textViewResult.text = "Filter 3  $keyList"
        }




    }






}