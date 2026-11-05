package com.joaopedrodossi.atividade5.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joaopedrodossi.atividade5.R
import com.joaopedrodossi.atividade5.databinding.FragmentDoneBinding
import com.joaopedrodossi.atividade5.databinding.FragmentHomeBinding

class DoneFragment : Fragment() {

    private var _binding: FragmentDoneBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDoneBinding.inflate(inflater,container,false)
        return binding.root
    }

}