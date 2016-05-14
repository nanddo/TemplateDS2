package modelos;

import android.content.Context;

public class Endereco extends Model<Endereco> {
    private String logradouro;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(Context context){
        super(context);
    }

    public Endereco(Context context, String logradouro, String rua, int numero, String bairro, String cidade, String estado, String cep) {
        super(context);
        this.logradouro = logradouro;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }
}
