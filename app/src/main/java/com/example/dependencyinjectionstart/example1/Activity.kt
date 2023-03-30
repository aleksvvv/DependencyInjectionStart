package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

//    val comp = Component().getComp()
    lateinit var comp:Computer
    init {
        Component().injectComp(this)
    }



    }