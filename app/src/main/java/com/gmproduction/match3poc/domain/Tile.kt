package com.gmproduction.match3poc.domain

data class Tile constructor(val num: Int, val id:Int) {
    companion object {
        //Each tile use a unique ID for tracking
        private var tileIdCounter = 0
    }

    constructor(num: Int) : this(num, tileIdCounter++)

    operator fun times(operand: Int): Tile = Tile(num * operand)
}
