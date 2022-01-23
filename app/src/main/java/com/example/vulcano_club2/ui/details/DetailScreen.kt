package com.example.vulcano_club2.ui.details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.vulcano_club2.R
import com.example.vulcano_club2.base.BaseFragment
import com.example.vulcano_club2.databinding.DetailScreenBinding

class DetailScreen : BaseFragment(R.layout.detail_screen) {

    override val viewModel: DetailScreenVM by viewModels()
    private val binding by viewBinding(DetailScreenBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}