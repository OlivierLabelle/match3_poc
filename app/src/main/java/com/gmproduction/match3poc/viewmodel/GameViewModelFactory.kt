package com.gmproduction.match3poc.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gmproduction.match3poc.repository.GameRepository

class GameViewModelFactory(context: Context) : ViewModelProvider.Factory {
    private val context = context.applicationContext

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return GameViewModel(GameRepository(context)) as T
    }
}
