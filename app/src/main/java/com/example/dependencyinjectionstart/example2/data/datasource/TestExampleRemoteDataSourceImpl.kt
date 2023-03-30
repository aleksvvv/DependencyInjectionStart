package com.example.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import com.example.dependencyinjectionstart.example2.data.database.ExampleDatabase
import com.example.dependencyinjectionstart.example2.data.network.ExampleApiService
import javax.inject.Inject

class TestExampleRemoteDataSourceImpl @Inject constructor()
    :ExampleRemoteDataSource {

    override fun method() {
        Log.d("TestExampleRemoteData", "Test")
    }
}