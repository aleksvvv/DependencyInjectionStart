package com.example.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.ExampleApp



import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

//    @Inject
//   lateinit var viewModel: ExampleViewModel
    private val viewModel by lazy{
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }
    private val viewModel2 by lazy{
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

   private val component by lazy {
//       DaggerApplicationComponent.builder()
//               .context(application)
//           .time(time)
//           .build()
//DaggerApplicationComponent.factory().create(application, System.currentTimeMillis())
       (application as ExampleApp).component.activityComponentFactory().create("MY_ID_2")

   }

//   private val component = DaggerApplicationComponent
//       .builder()
//       .dataModule(DataModule(this))
//       .build()

    override fun onCreate(savedInstanceState: Bundle?) {

//        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Log.d("MainActivity","$component.getViewModel()")
//Log.d("MainActivity","$component.getDataBase()")
        viewModel.method()
viewModel2.method()
    }
}