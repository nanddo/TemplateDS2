package controles;

import android.content.Context;

import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import modelos.Compra;

public class ControleDeCompra {
	private ArrayList<Compra> compras = new ArrayList<>();
	private Context context;
	private static Compra selecionada;

	public ControleDeCompra(Context context){
		this.context = context;
	}

	public static void salvarCompra(Compra compra) {
		compra.save();
	}

	public static void excluirCompra(Compra compra) {
		compra.delete();
	}
}
