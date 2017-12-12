package br.com.fiap.pizzaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import br.com.fiap.pizzaria.model.Pedido;
import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.cbBacon)
    CheckBox cbBacon;

    @BindView(R.id.cbAtum)
    CheckBox cbAtum;

    @BindView(R.id.rgTamanho)
    RadioGroup rgTamanho;

    @BindView(R.id.spPagamentos)
    Spinner spPagamentos;

    @BindView(R.id.username)
    TextView username;

    Pedido pedido = new Pedido();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getIntent() != null) {
            nomeUsuario = getIntent().getStringExtra("USUARIO");
        }

        username.setText(nomeUsuario);

        setListenerCheckbox(cbAtum);
        setListenerCheckbox(cbBacon);

    }

    private void setListenerCheckbox(final Checbox checkbox){
        checkbox
    }

    @OnClick(R.id.btFecharPedido)
    public void fecharPedido(){
        pedido.setClient.(username);
        pedido.setTamanho(getTamnhoSelecionado());
        pedido.setFormaPagamento(spPagamentos.getSelectedItem().toString());

        Intent i = new Intent(this, ConfirmarPedidoActivity.clas);
        i.putExtra("PEDIDO", pedido);
        startActivity(i);
    }

    public String getTamnhoSelecionado(){
        switch (rgTamanho.getCheckedRadioButtonId()){
            case R.id.rbBroto:
                return ((RadioButton)findViewById(R.id.rbBroto)).getText().toString();
        }
    }
}
