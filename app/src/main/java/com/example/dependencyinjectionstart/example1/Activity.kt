package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    val monitor = Monitor()
    val mouse = Mouse()
    val keyboard = Keyboard()
    val computerTower = ComputerTower(Storage(), Memory(), Processor())

    val computer = Computer(monitor, mouse, keyboard, computerTower)

}