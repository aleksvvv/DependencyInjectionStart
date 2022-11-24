package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Computer (
    val storage: Storage,
    val mouse: Mouse,
    val keyboard: Keyboard,
    val computerTower: ComputerTower
)