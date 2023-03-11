package com.gmproduction.match3poc.repository

import android.content.Context
import com.gmproduction.match3poc.domain.Tile
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

const val KEY_SHARED_PREFS = "Key_shared_prefs"
const val KEY_GRID = "Key_grid"
const val KEY_CURRENT_SCORE = "Key_current_score"
const val KEY_BEST_SCORE = "Key_best_score"

class GameRepository(context: Context) {

    private val sharedPrefs = context.getSharedPreferences(KEY_SHARED_PREFS, Context.MODE_PRIVATE)

    var grid: List<List<Int?>>? = sharedPrefs.getString(KEY_GRID, null)?.let { Gson().fromJson(it) }
        private set

    var currentScore: Int = sharedPrefs.getInt(KEY_CURRENT_SCORE, 0)
        private set

    var bestScore: Int = sharedPrefs.getInt(KEY_BEST_SCORE, 0)
        private set

    fun saveState(grid: List<List<Tile?>>, currentScore: Int, bestScore: Int) {
        this.grid = grid.map { tiles -> tiles.map { it?.num } }
        this.currentScore = currentScore
        this.bestScore = bestScore
        sharedPrefs.edit()
            .putString(KEY_GRID, Gson().toJson(this.grid))
            .putInt(KEY_CURRENT_SCORE, currentScore)
            .putInt(KEY_BEST_SCORE, bestScore)
            .apply()
    }
}

private inline fun <reified T> Gson.fromJson(json: String) = fromJson<T>(json, object : TypeToken<T>() {}.type)
