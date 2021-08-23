package com.example.buttongame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var score : TextView
    var scoreInt : Int = 0
    var rndm1 : Int = Random.nextInt(1,100)
    var rndm2 : Int = Random.nextInt(1,100)
    var rndm3 : Int = Random.nextInt(1,100)
    var rndm4 : Int = Random.nextInt(1,100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1_main)
        button2 = findViewById(R.id.button2_main)
        score = findViewById(R.id.text_main)
        score.text = "SCORE: "

        button1.setOnClickListener {
            if(score.equals("SCORE: ")) {
                if(rndm1 == rndm2) {
                    rndm1++
                }
                button1.text = "Number: " + rndm1
                button2.text = "Number: " + rndm2
            }
            else {
                if(rndm1 == rndm2) {
                    rndm1++
                }
                button1.text = "Number: " + rndm1
                button2.text = "Number: " + rndm2

                if((rndm1 < rndm2) && scoreInt == 0) {

                } else if(rndm1 < rndm2) {
                    scoreInt--
                } else {
                    scoreInt++
                }
                score.text = "SCORE: " + scoreInt
                rndm1 = Random.nextInt(1,100)
                rndm2 = Random.nextInt(1,100)
            }

        }

        button2.setOnClickListener {
            if(score.equals("SCORE: ")) {
                if(rndm3 == rndm4) {
                    rndm3++
                }
                button1.text = "Number: " + rndm3
                button2.text = "Number: " + rndm4
            }
            else {
                if (rndm3 == rndm4) {
                    rndm3++
                }
                button1.text = "Number: " + rndm3
                button2.text = "Number: " + rndm4

                if ((rndm4 < rndm3) && scoreInt == 0) {

                } else if (rndm4 < rndm3) {
                    scoreInt--
                } else {
                    scoreInt++
                }
                score.text = "SCORE: " + scoreInt

                rndm3 = Random.nextInt(1, 100)
                rndm4 = Random.nextInt(1, 100)
            }
        }
    }
}