// Generated by view binder compiler. Do not edit!
package app.example.pruebagit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import app.example.pruebagit.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPrincipalCuentaBancoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnBuscarUsuario;

  @NonNull
  public final Button btnTranfesrir;

  @NonNull
  public final CardView cardRetirar;

  @NonNull
  public final CardView cardTransferir;

  @NonNull
  public final EditText etCantidadDepositar;

  @NonNull
  public final EditText etUsuarioEncontrado;

  @NonNull
  public final ImageView imageSalir;

  @NonNull
  public final CircleImageView imageViewC;

  @NonNull
  public final ConstraintLayout imagenNombreLayout;

  @NonNull
  public final CircleImageView imagenUsuarioBuscado;

  @NonNull
  public final LinearLayout layoutContenidoCantidad;

  @NonNull
  public final ConstraintLayout layoutTransferir;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView title;

  @NonNull
  public final TextView tvCantidadTitle;

  @NonNull
  public final TextView tvNombreUsuarioB;

  @NonNull
  public final TextView tvSaldoUsuario;

  @NonNull
  public final TextView tvTitleNumeroCuenta;

  private ActivityPrincipalCuentaBancoBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnBuscarUsuario, @NonNull Button btnTranfesrir,
      @NonNull CardView cardRetirar, @NonNull CardView cardTransferir,
      @NonNull EditText etCantidadDepositar, @NonNull EditText etUsuarioEncontrado,
      @NonNull ImageView imageSalir, @NonNull CircleImageView imageViewC,
      @NonNull ConstraintLayout imagenNombreLayout, @NonNull CircleImageView imagenUsuarioBuscado,
      @NonNull LinearLayout layoutContenidoCantidad, @NonNull ConstraintLayout layoutTransferir,
      @NonNull ConstraintLayout main, @NonNull TextView title, @NonNull TextView tvCantidadTitle,
      @NonNull TextView tvNombreUsuarioB, @NonNull TextView tvSaldoUsuario,
      @NonNull TextView tvTitleNumeroCuenta) {
    this.rootView = rootView;
    this.btnBuscarUsuario = btnBuscarUsuario;
    this.btnTranfesrir = btnTranfesrir;
    this.cardRetirar = cardRetirar;
    this.cardTransferir = cardTransferir;
    this.etCantidadDepositar = etCantidadDepositar;
    this.etUsuarioEncontrado = etUsuarioEncontrado;
    this.imageSalir = imageSalir;
    this.imageViewC = imageViewC;
    this.imagenNombreLayout = imagenNombreLayout;
    this.imagenUsuarioBuscado = imagenUsuarioBuscado;
    this.layoutContenidoCantidad = layoutContenidoCantidad;
    this.layoutTransferir = layoutTransferir;
    this.main = main;
    this.title = title;
    this.tvCantidadTitle = tvCantidadTitle;
    this.tvNombreUsuarioB = tvNombreUsuarioB;
    this.tvSaldoUsuario = tvSaldoUsuario;
    this.tvTitleNumeroCuenta = tvTitleNumeroCuenta;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPrincipalCuentaBancoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPrincipalCuentaBancoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_principal_cuenta_banco, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPrincipalCuentaBancoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBuscarUsuario;
      Button btnBuscarUsuario = ViewBindings.findChildViewById(rootView, id);
      if (btnBuscarUsuario == null) {
        break missingId;
      }

      id = R.id.btnTranfesrir;
      Button btnTranfesrir = ViewBindings.findChildViewById(rootView, id);
      if (btnTranfesrir == null) {
        break missingId;
      }

      id = R.id.cardRetirar;
      CardView cardRetirar = ViewBindings.findChildViewById(rootView, id);
      if (cardRetirar == null) {
        break missingId;
      }

      id = R.id.cardTransferir;
      CardView cardTransferir = ViewBindings.findChildViewById(rootView, id);
      if (cardTransferir == null) {
        break missingId;
      }

      id = R.id.etCantidadDepositar;
      EditText etCantidadDepositar = ViewBindings.findChildViewById(rootView, id);
      if (etCantidadDepositar == null) {
        break missingId;
      }

      id = R.id.etUsuarioEncontrado;
      EditText etUsuarioEncontrado = ViewBindings.findChildViewById(rootView, id);
      if (etUsuarioEncontrado == null) {
        break missingId;
      }

      id = R.id.imageSalir;
      ImageView imageSalir = ViewBindings.findChildViewById(rootView, id);
      if (imageSalir == null) {
        break missingId;
      }

      id = R.id.imageViewC;
      CircleImageView imageViewC = ViewBindings.findChildViewById(rootView, id);
      if (imageViewC == null) {
        break missingId;
      }

      id = R.id.imagenNombreLayout;
      ConstraintLayout imagenNombreLayout = ViewBindings.findChildViewById(rootView, id);
      if (imagenNombreLayout == null) {
        break missingId;
      }

      id = R.id.imagenUsuarioBuscado;
      CircleImageView imagenUsuarioBuscado = ViewBindings.findChildViewById(rootView, id);
      if (imagenUsuarioBuscado == null) {
        break missingId;
      }

      id = R.id.layoutContenidoCantidad;
      LinearLayout layoutContenidoCantidad = ViewBindings.findChildViewById(rootView, id);
      if (layoutContenidoCantidad == null) {
        break missingId;
      }

      id = R.id.layoutTransferir;
      ConstraintLayout layoutTransferir = ViewBindings.findChildViewById(rootView, id);
      if (layoutTransferir == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.tvCantidadTitle;
      TextView tvCantidadTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvCantidadTitle == null) {
        break missingId;
      }

      id = R.id.tvNombreUsuarioB;
      TextView tvNombreUsuarioB = ViewBindings.findChildViewById(rootView, id);
      if (tvNombreUsuarioB == null) {
        break missingId;
      }

      id = R.id.tvSaldoUsuario;
      TextView tvSaldoUsuario = ViewBindings.findChildViewById(rootView, id);
      if (tvSaldoUsuario == null) {
        break missingId;
      }

      id = R.id.tvTitleNumeroCuenta;
      TextView tvTitleNumeroCuenta = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleNumeroCuenta == null) {
        break missingId;
      }

      return new ActivityPrincipalCuentaBancoBinding((ConstraintLayout) rootView, btnBuscarUsuario,
          btnTranfesrir, cardRetirar, cardTransferir, etCantidadDepositar, etUsuarioEncontrado,
          imageSalir, imageViewC, imagenNombreLayout, imagenUsuarioBuscado, layoutContenidoCantidad,
          layoutTransferir, main, title, tvCantidadTitle, tvNombreUsuarioB, tvSaldoUsuario,
          tvTitleNumeroCuenta);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}