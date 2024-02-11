package com.amanpathak.toasty

import android.content.Context
import android.widget.Toast
import java.time.Duration

class Toasty {


    companion object {

        fun showToast(context : Context?, longDuration: Boolean){
            context?.let {
                Toast.makeText(context, "Hey! This is Aman", if(longDuration) Toast.LENGTH_LONG else Toast.LENGTH_SHORT).show()
            }

        }
    }


}