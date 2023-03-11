package com.gmproduction.match3poc.viewmodel

import androidx.lifecycle.ViewModel
import com.gmproduction.match3poc.repository.GameRepository

const val GRID_SIZE = 4

class GameViewModel(private val gameRepository: GameRepository) : ViewModel() {

    init {

    }
}
