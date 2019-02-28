package br.edu.yasuda.loginkot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_login.setOnClickListener{
            if(tf_login.text.toString().equals("Admin") && pf_senha.text.toString().equals("123"))
                logado()
            else
                Toast.makeText(this, "Login ou Senha Invalidos", Toast.LENGTH_SHORT).show()
        }
    }

    private fun logado() {
        val intent = Intent (this, LogadoActivity::class.java)
        startActivity(intent)
    }
}