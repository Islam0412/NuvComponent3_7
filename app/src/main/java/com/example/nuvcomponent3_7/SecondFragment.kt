package com.example.nuvcomponent3_7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nuvcomponent3_7.databinding.FragmentMainBinding
import com.example.nuvcomponent3_7.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

lateinit var binding: FragmentSecondBinding
lateinit var result: Madel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        result = arguments?.getSerializable(MainFragment.KEY)as Madel
    binding.tvAliv.text = result.alive
    binding.tvNem.text = result.name
    binding.imgFr.setImageResource(result.image)}

}