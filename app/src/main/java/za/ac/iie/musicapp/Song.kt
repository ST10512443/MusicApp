package za.ac.iie.musicapp

import android.util.Log
import kotlin.math.log

//created placeholders
class Song(songName: String, songArtist:String,songYear:Int,songDuration:String) {

    //adding variables for name objects attributes
    var name : String = ""
    var artist : String = ""
    var year : Int = 0
    var duration : String = ""

    //added secondary constructor
    constructor(songName: String, songArtist:String) : this(songName,songArtist,0,""){

    }
    //initialising the varaibles/attributes for the song objects
    init{
        name = songName
        artist = songArtist
        year = songYear
        duration = songDuration
    }

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