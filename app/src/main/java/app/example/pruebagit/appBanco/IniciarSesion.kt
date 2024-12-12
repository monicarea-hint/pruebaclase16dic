package app.example.pruebagit.appBanco

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import app.example.pruebagit.R
import app.example.pruebagit.appBanco.data.Data
import app.example.pruebagit.databinding.ActivityIniciarSesionBinding

class IniciarSesion : AppCompatActivity() {
    private lateinit var binding: ActivityIniciarSesionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.tvNoTengoCuenta.setOnClickListener {
            startActivity(Intent(this, RegistrarUsuario::class.java))

        }
        binding.btnInciarSesion.setOnClickListener {
            incioSesion()
        }


    }//llave cierre metodo onCreate

    private fun incioSesion() {
        val usuario = binding.usuarioInico.text.toString().trim()
        val password = binding.passwordInicio.text.toString().trim()

        val usuarioActual = Data.data.find {
            it.nombre.equals(usuario) && it.password.equals(password)

        }




        if(usuarioActual != null){
            Toast.makeText(this, "hola ${usuarioActual.nombre} y tu contrase;a es ${usuarioActual.password}", Toast.LENGTH_SHORT).show()
        }else
            Toast.makeText(this, "usuario no registrado", Toast.LENGTH_SHORT).show()

    }


}