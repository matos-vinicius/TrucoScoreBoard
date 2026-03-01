package br.edu.ifsp.scl.sc3039056.trucoscoreboard

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.ifsp.scl.sc3039056.trucoscoreboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val amb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private var scoreA = 0
    private var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(amb.root)

        with(amb) {
            increment1ScoreABt.setOnClickListener {
                if (scoreA < 12) {
                    scoreA++
                    scoreATv.text = scoreA.toString()
                    if (scoreA == 11) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time A chegou na mão de onze!",
                            Toast.LENGTH_SHORT
                        ).show()
                        increment3ScoreABt.visibility = View.INVISIBLE
                    }
                    if (scoreA == 12) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time A ganhou a rodada!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
            increment3ScoreABt.setOnClickListener {
                if ((scoreA < 12) and ((scoreA + 3) < 12)) {
                    scoreA += 3
                    scoreATv.text = scoreA.toString()
                    if (scoreA == 11) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time A chegou na mão de onze!",
                            Toast.LENGTH_SHORT
                        ).show()
                        increment3ScoreABt.visibility = View.INVISIBLE
                    }
                    if (scoreA == 12) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time A ganhou a rodada!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    scoreA = 12
                    scoreATv.text = scoreA.toString()
                    Toast.makeText(
                        this@MainActivity,
                        "Time A ganhou a rodada!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            increment1ScoreBBt.setOnClickListener {
                if (scoreB < 12) {
                    scoreB++
                    scoreBTv.text = scoreB.toString()
                    if (scoreB == 11) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time B chegou na mão de onze!",
                            Toast.LENGTH_SHORT
                        ).show()
                        increment3ScoreBBt.visibility = View.INVISIBLE
                    }
                    if (scoreB == 12) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time B ganhou a rodada!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
            increment3ScoreBBt.setOnClickListener {
                if ((scoreB < 12) and ((scoreB + 3) < 12)) {
                    scoreB += 3
                    scoreBTv.text = scoreB.toString()
                    if (scoreB == 11) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time B chegou na mão de onze!",
                            Toast.LENGTH_SHORT
                        ).show()
                        increment3ScoreBBt.visibility = View.INVISIBLE
                    }
                    if (scoreB == 12) {
                        Toast.makeText(
                            this@MainActivity,
                            "Time B ganhou a rodada!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    scoreB = 12
                    scoreBTv.text = scoreB.toString()
                    Toast.makeText(
                        this@MainActivity,
                        "Time B ganhou a rodada!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            resetScoresBt.setOnClickListener {
                scoreA = 0
                scoreB = 0
                scoreATv.text = scoreA.toString()
                scoreBTv.text = scoreB.toString()
                increment3ScoreABt.visibility = View.VISIBLE
                increment3ScoreBBt.visibility = View.VISIBLE
            }
        }
    }
}