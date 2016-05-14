package modelos;

import android.content.Context;

import java.util.ArrayList;

public class Model<T> {
    protected Integer id;
    protected transient Context context;

    public Model(Context context){
        this.context = context;
    }

    public void setContext(Context context){
        this.context = context;
    }

    public void save(){
        save(null);
    }

    public void save(final RequestCallback<Model> callback){
        new ServerRequest(context).sendRequest(getControllerName(), ServerRequest.Action.SAVE, new Gson().toJson(this), new RequestCallback<JSONObject>() {
            @Override
            public void execute(JSONObject json) throws Exception {
                setId(json.getInt("id"));
                if (callback != null){
                    callback.execute(Model.this);
                }

                super.execute(json);
            }
        });
    }
}
