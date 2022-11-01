package com.example.nuvcomponent3_7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nuvcomponent3_7.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var list = arrayListOf<Madel>()

    companion object {
        const val KEY = "key"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadDatata()
        var adaptor = AdaptorKt(list, this::onClick)
        binding.resalcler.adapter = adaptor
    }


    private fun loadDatata() {
        list.add(Madel("rici","alive",R.drawable.ic_rick))
        list.add(Madel("rici","alive",R.drawable.img))
        list.add(Madel("rici","alive",R.drawable.img_1))
        list.add(Madel("rici","alive",R.drawable.img_2))
    }

    private fun onClick(position: Int) {
        findNavController().navigate(R.id.secondFragment, bundleOf(KEY to list [position]))
    }

}