package com.example.vulcano_club2.ui.onboard

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.vulcano_club2.R
import com.example.vulcano_club2.base.BaseFragment
import com.example.vulcano_club2.databinding.OnBoardFragmentBinding

class OnBoarding : BaseFragment(R.layout.on_board_fragment) {
    override val viewModel: OnBoardingVM by viewModels()

    private val binding by viewBinding(OnBoardFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextBtn.setOnClickListener {
            viewModel.navController()
        }
        viewModel.apply {
            onBoardingLiveData.observe(viewLifecycleOwner, onBoardingSceenObserver)
        }

    }

    private val onBoardingSceenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_onBoarding_to_homeScreen)
    }

}