package campalans.m8.animations

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import campalans.m8.animations.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView((binding.root))

        //L'animació amb la qual treballem
        val animation= AnimationUtils.loadAnimation(applicationContext, R.anim.primera_animacio)

        //Definim l'animació entre opacitats per canviar entre activities
        val options = ActivityOptions.makeCustomAnimation(
            this,  // Context
            R.anim.opacitat_out,  // Enter animation
            R.anim.opacitat_in,  // Exit animation
        )

        //Començem l'animació de la pilota
        binding.pilota.startAnimation(animation)

        //Declarem l'intent per així carregar l'activity main
        var intent = Intent(applicationContext, MainActivity::class.java)

        //Assignem un click listener a la pilota
        binding.pilota.setOnClickListener()
        {
            if (animation.hasEnded())   //Controlem que l'animació hagi acabat
            {
                startActivity(intent, options.toBundle())   //Canviem a l'activity indicada amb la transició d'opacitat
            }
        }
    }
}