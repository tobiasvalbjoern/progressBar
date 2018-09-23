package dk.tobias.activities.activityressourcesexercises

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickListener = View.OnClickListener { view ->
            when (view.id){
                R.id.plusBut ->progressBar.incrementProgressBy(1)
                R.id.minusBut->progressBar.incrementProgressBy(-1)
            }
        }

        plusBut.setOnClickListener(buttonClickListener)
        minusBut.setOnClickListener(buttonClickListener)
    }
    }

