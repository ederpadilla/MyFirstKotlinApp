package androiddeveloper.eder.padilla.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class Main2Activity : AppCompatActivity() {

    var size : Float? = null

    lateinit var cahrsequ : String //nunca va a ser nulo y en algun momento va a reibir un valor



    val TAG : String = "TAG_ACTIVITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment : Fragment? = supportFragmentManager
                .findFragmentById(R.id.fragment_container)

        if (fragment == null){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, FragmentTalks())
                    .commit()
        }
    }
}
