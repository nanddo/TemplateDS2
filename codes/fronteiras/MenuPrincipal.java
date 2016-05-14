package fronteiras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import controles.ControleDeFornecedor;
import controles.ControleDeImpressao;
import modelos.Fornecedor;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        findViewById(R.id.menu_fornecedores).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open(MenuFornecedores.class);
            }
        });
    }
}
