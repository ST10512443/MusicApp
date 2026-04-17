package za.ac.iie.musicapp

import android.util.Log
import kotlin.math.log

class Song {
    //adding variables for name objects attributes
    var name : String = ""
    var artist : String = ""
    var year : Int = 0
    var duration : String = ""

    //function to play the song
    fun Play(){
        Log.v("Song","$name playing now")

    }

    //function to pause the song
    fun Pause(){
        Log.v("Song","$name is paused")

    }

    //function to stop the song
    fun stop(){
        Log.v("Song","$name is stopped")

    }

    //function to favourite the song
    fun Favourite(): Boolean{
        Log.v("Song","$name is favourited")
        return true
    }





} //class