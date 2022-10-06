package com.psicoamerican.aula08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.psicoamerican.aula08.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFrag1.setOnClickListener {
            val fragment = Teste01Fragment()
            supportFragmentManager.beginTransaction()
                                  .replace(R.id.container, fragment)
                                  .commit()
        }

        binding.buttonFrag2.setOnClickListener {
            val fragment = Teste02Fragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
        }

    }
}