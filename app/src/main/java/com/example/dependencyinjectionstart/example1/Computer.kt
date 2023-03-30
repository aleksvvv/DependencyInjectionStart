package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Computer (
    val monitor: Monitor,
    val mouse: Mouse,
    val keyboard: Keyboard,
    val computerTower: ComputerTower
)