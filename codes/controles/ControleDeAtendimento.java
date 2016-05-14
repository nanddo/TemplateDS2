package controles;

import android.content.Context;

import java.util.ArrayList;

import modelos.Comanda;
import modelos.Mesa;

public class ControleDeAtendimento {
    private Context context;
    private ControleDeImpressao controleDeImpressao;

    private ArrayList<Mesa> mesas = new ArrayList<Mesa>();

    public ControleDeAtendimento(Context context){
        this.context = context;
        this.controleDeImpressao = new ControleDeImpressao(context);
        int numeroDeMesas = 20;
        for(int i = 1; i <= numeroDeMesas; i++) {
            mesas.add(new Mesa(context, i));
        }
    }
}
