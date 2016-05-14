package fronteiras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuFornecedores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fornecedores);


        findViewById(R.id.menu_cadastrar_fornecedor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open(CadastroFornecedor.class);
            }
        });

        findViewById(R.id.menu_buscar_fornecedor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open(BuscaFornecedor.class);
            }
        });
    }

    public void open(Class activity){
        startActivity(new Intent(this, activity));
    }
}
