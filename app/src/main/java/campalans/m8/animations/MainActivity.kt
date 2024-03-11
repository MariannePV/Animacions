package campalans.m8.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import campalans.m8.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)   //Emplenem la variable binding amb tots els elements visuals del layout
        setContentView(binding.root)

        val animation= AnimationUtils.loadAnimation(applicationContext, R.anim.primera_animacio)
        //binding.pilota.startAnimation(animation)
    }
}