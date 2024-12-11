// Generated by view binder compiler. Do not edit!
package app.example.pruebagit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import app.example.pruebagit.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistroUsuarioBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final AppCompatButton btnRegistrar;

  @NonNull
  public final TextInputEditText cedulaUsuario;

  @NonNull
  public final ImageView imageSearch;

  @NonNull
  public final ImageView imageUser;

  @NonNull
  public final ScrollView main;

  @NonNull
  public final TextInputEditText nombreUsuario;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final TextInputEditText saldo;

  @NonNull
  public final Spinner tipoCuentaSpinner;

  @NonNull
  public final TextView tvTengoCuenta;

  private ActivityRegistroUsuarioBinding(@NonNull ScrollView rootView,
      @NonNull AppCompatButton btnRegistrar, @NonNull TextInputEditText cedulaUsuario,
      @NonNull ImageView imageSearch, @NonNull ImageView imageUser, @NonNull ScrollView main,
      @NonNull TextInputEditText nombreUsuario, @NonNull TextInputEditText password,
      @NonNull TextInputEditText saldo, @NonNull Spinner tipoCuentaSpinner,
      @NonNull TextView tvTengoCuenta) {
    this.rootView = rootView;
    this.btnRegistrar = btnRegistrar;
    this.cedulaUsuario = cedulaUsuario;
    this.imageSearch = imageSearch;
    this.imageUser = imageUser;
    this.main = main;
    this.nombreUsuario = nombreUsuario;
    this.password = password;
    this.saldo = saldo;
    this.tipoCuentaSpinner = tipoCuentaSpinner;
    this.tvTengoCuenta = tvTengoCuenta;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistroUsuarioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistroUsuarioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registro_usuario, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistroUsuarioBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRegistrar;
      AppCompatButton btnRegistrar = ViewBindings.findChildViewById(rootView, id);
      if (btnRegistrar == null) {
        break missingId;
      }

      id = R.id.cedulaUsuario;
      TextInputEditText cedulaUsuario = ViewBindings.findChildViewById(rootView, id);
      if (cedulaUsuario == null) {
        break missingId;
      }

      id = R.id.imageSearch;
      ImageView imageSearch = ViewBindings.findChildViewById(rootView, id);
      if (imageSearch == null) {
        break missingId;
      }

      id = R.id.imageUser;
      ImageView imageUser = ViewBindings.findChildViewById(rootView, id);
      if (imageUser == null) {
        break missingId;
      }

      ScrollView main = (ScrollView) rootView;

      id = R.id.nombreUsuario;
      TextInputEditText nombreUsuario = ViewBindings.findChildViewById(rootView, id);
      if (nombreUsuario == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.saldo;
      TextInputEditText saldo = ViewBindings.findChildViewById(rootView, id);
      if (saldo == null) {
        break missingId;
      }

      id = R.id.tipoCuentaSpinner;
      Spinner tipoCuentaSpinner = ViewBindings.findChildViewById(rootView, id);
      if (tipoCuentaSpinner == null) {
        break missingId;
      }

      id = R.id.tvTengoCuenta;
      TextView tvTengoCuenta = ViewBindings.findChildViewById(rootView, id);
      if (tvTengoCuenta == null) {
        break missingId;
      }

      return new ActivityRegistroUsuarioBinding((ScrollView) rootView, btnRegistrar, cedulaUsuario,
          imageSearch, imageUser, main, nombreUsuario, password, saldo, tipoCuentaSpinner,
          tvTengoCuenta);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
