package com.solidlucho.tennis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val luckyplayer1: Int = (1..100).random()
        val luckyplayer2: Int = (1..100).random()
        val luckyplayer3: Int = (1..100).random()
        val luckyplayer4: Int = (1..100).random()


        val player1 = Player("Jorge", 10+ luckyplayer1)
        val player2 = Player("Luis", 10+ luckyplayer2)
        val player3 = Player("Marisa", 10+ luckyplayer3)
        val player4 = Player("Mario", 10+ luckyplayer4)

        fun ronda(){
            val Ganador = arrayOf(player1.level , player2.level, player3.level , player4.level)

            if(Ganador.maxOrNull() == player1.level){
                println("Jorge Ganó el Torneo ")
        }
            if(Ganador.maxOrNull() == player2.level){
                println(" Luis Ganó el Torneo")
            }
            if(Ganador.maxOrNull() == player3.level){
                println("Marisa Ganó el Torneo")
            }
            if(Ganador.maxOrNull() == player4.level){
                println("Mario Ganó el Torneo")
            }

             }

        ronda();

    }


}


data class Player( val nombre: String,
                   val level: Int)