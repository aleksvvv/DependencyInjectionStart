package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    val mouse = DaggerNewComponent.create().getMouse()
    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }
}