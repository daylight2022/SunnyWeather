package com.example.sunnyweather.util

import android.content.Context
import android.widget.Toast

class util {
}

fun String.showToast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context,  this, duration).show()
}
