package com.psicoamerican.aula08

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.psicoamerican.aula08.databinding.FragmentTeste01Binding

class Teste01Fragment : Fragment() {
    lateinit var binding: FragmentTeste01Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTeste01Binding.inflate(inflater)

        binding.button.setOnClickListener {
            AlertDialog.Builder(requireContext())
                .setMessage("Olá, mundo")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }

        return binding.root
    }
}