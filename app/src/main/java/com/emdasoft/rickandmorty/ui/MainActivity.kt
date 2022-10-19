package com.emdasoft.rickandmorty.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.emdasoft.rickandmorty.R
import com.emdasoft.rickandmorty.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: PersonListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[PersonListViewModel::class.java]

        viewModel.getPersonList()

        viewModel.personList.observe(this) {
            println(it.body()?.results)
        }

    }
}