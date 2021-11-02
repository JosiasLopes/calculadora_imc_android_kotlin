package frase_do_dia.adriano.calculadora_imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("LyfeCicle","onCreate a tela é criada")
        //o metodo finish() chama o metodo onDestroy que encerra uma activity
    }

    override fun onStart() {
        super.onStart()
        Log.w("LyfeCicle","onStart a tela é configurad e iniciada")
    }

    override fun onResume() {
        super.onResume()
        Log.w("LyfeCicle","onResume a tea volta a ser exibida deposi da pausa")
    }

    override fun onPause() {
        super.onPause()
        Log.w("LyfeCicle","onPause é eexecutado quando a aplicação é minimizada")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("LyfeCicle","onPause é executado depois do onStop")
    }


    override fun onStop(){
        super.onStop()
        Log.w("LyfeCicle","onStop é executado quando a aplicação fica um tempo parada")
    }
}
