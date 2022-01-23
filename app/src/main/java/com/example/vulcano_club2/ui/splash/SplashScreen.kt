package com.example.vulcano_club2.ui.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.vulcano_club2.R
import com.example.vulcano_club2.base.BaseFragment
import com.example.vulcano_club2.databinding.ActivityMainBinding.bind
import com.example.vulcano_club2.databinding.SplashSceenBinding
import com.example.vulcano_club2.extensions.transparentStatusBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashScreen : BaseFragment(R.layout.splash_sceen) {

    override val viewModel: SplashViewModel by viewModels()
    private val binding by viewBinding(SplashSceenBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().window.transparentStatusBar()
        viewModel.apply {
            homeSceenLiveData.observe(viewLifecycleOwner, homeScreenObserver)
        }
        binding.imageLogo.animate()
            .translationX(0F)
            .alpha(1F)
            .setDuration(1000)
            .start()

        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)
            findNavController().navigate(R.id.action_splashScreen_to_onBoarding)
        }
    }

    private val homeScreenObserver = Observer<Unit> {

        //findNavController().navigate(R.id.action_splashScreen_to_homeScreen)
    }

}