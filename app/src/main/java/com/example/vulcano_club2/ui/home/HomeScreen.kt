package com.example.vulcano_club2.ui.home

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.vulcano_club2.R
import com.example.vulcano_club2.base.BaseFragment
import com.example.vulcano_club2.databinding.HomeScreenBinding

class HomeScreen : BaseFragment(R.layout.home_screen) {

    override val viewModel: HomeScreenVM by viewModels()
    private val binding by viewBinding(HomeScreenBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.etna.setOnClickListener {
            viewModel.navController()
        }
        setUp()
        viewModel.apply {
            homeLiveData.observe(viewLifecycleOwner, homeScreenObserver)
        }
    }

    private fun setUp() {
        binding.eraiv.setOnClickListener {
            val bundle = bundleOf("eraiv" to "Eraivajokull (Hvannadalshnukur Peak)")
            findNavController().navigate(R.id.action_homeScreen_to_detailScreen)
        }
    }

    private val homeScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_homeScreen_to_detailScreen)
    }

}