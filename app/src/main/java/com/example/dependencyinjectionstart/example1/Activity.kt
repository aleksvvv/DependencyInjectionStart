package com.example.dependencyinjectionstart.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectionstart.R

class Activity  {

    lateinit var computer:Computer
    lateinit var mouse: Mouse

    init {
        Component().inject(this)
    }
}