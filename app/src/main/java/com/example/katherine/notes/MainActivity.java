package com.example.katherine.notes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1p, n2p, n3p, n1i, n2i, n3i, n1m,n2m,n3m;
    private TextView defi,defm, defp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1p = (EditText)findViewById(R.id.nota1p);
        n2p = (EditText)findViewById(R.id.nota2p);
        n3p = (EditText)findViewById(R.id.nota3p);
        n1i = (EditText)findViewById(R.id.nota1i);
        n2i = (EditText)findViewById(R.id.nota2i);
        n3i = (EditText)findViewById(R.id.nota3i);
        n1m = (EditText)findViewById(R.id.nota1m);
        n2m = (EditText)findViewById(R.id.nota2m);
        n3m = (EditText)findViewById(R.id.nota3m);
        defi = (TextView)findViewById(R.id.defi);
        defm = (TextView)findViewById(R.id.defm);
        defp = (TextView)findViewById(R.id.defp);

        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);

        n1p.setText(prefe.getString("nota1p",""));
        n2p.setText(prefe.getString("nota2p",""));
        n3p.setText(prefe.getString("nota3p",""));
        n1i.setText(prefe.getString("nota1i",""));
        n2i.setText(prefe.getString("nota2i",""));
        n3i.setText(prefe.getString("nota3i",""));
        n1m.setText(prefe.getString("nota1m",""));
        n2m.setText(prefe.getString("nota2m",""));
        n3m.setText(prefe.getString("nota3m",""));

        //Cambios para los TextView de Programación
        n1p.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n1p);}

            @Override
            public void afterTextChanged(Editable editable) {

                defp.setText(calcular(n1p.getText().toString(),n2p.getText().toString(),n3p.getText().toString()));
                guardar();

            }
        });

        n2p.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n2p);}

            @Override
            public void afterTextChanged(Editable editable) {

                defp.setText(calcular(n1p.getText().toString(),n2p.getText().toString(),n3p.getText().toString()));
                guardar();

            }
        });

        n3p.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n3p);}

            @Override
            public void afterTextChanged(Editable editable) {

                defp.setText(calcular(n1p.getText().toString(),n2p.getText().toString(),n3p.getText().toString()));
                guardar();

            }
        });

        //Cambios para los TextView de Ingles
        n1i.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n1i);}

            @Override
            public void afterTextChanged(Editable editable) {

                defi.setText(calcular(n1i.getText().toString(),n2i.getText().toString(),n3i.getText().toString()));
                guardar();

            }
        });

        n2i.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n2i);}

            @Override
            public void afterTextChanged(Editable editable) {

                defi.setText(calcular(n1i.getText().toString(),n2i.getText().toString(),n3i.getText().toString()));
                guardar();

            }
        });

        n3i.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n3i);}

            @Override
            public void afterTextChanged(Editable editable) {

                defi.setText(calcular(n1i.getText().toString(),n2i.getText().toString(),n3i.getText().toString()));
                guardar();

            }
        });

        //Cambios para los TextView de Matematicas
        n1m.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n1m);}

            @Override
            public void afterTextChanged(Editable editable) {

                defm.setText(calcular(n1m.getText().toString(),n2m.getText().toString(),n3m.getText().toString()));
                guardar();

            }
        });

        n2m.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n2m);}

            @Override
            public void afterTextChanged(Editable editable) {

                defm.setText(calcular(n1m.getText().toString(),n2m.getText().toString(),n3m.getText().toString()));
                guardar();

            }
        });

        n3m.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {validar(n3m);}

            @Override
            public void afterTextChanged(Editable editable) {

                defm.setText(calcular(n1m.getText().toString(),n2m.getText().toString(),n3m.getText().toString()));
                guardar();

            }
        });

        ejecutar();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuabout, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.about) {
            about();
        }
        return super.onOptionsItemSelected(item);
    }

    public void about(){
        Intent i = new Intent(this,AboutActivity.class);
        startActivity(i);
    }

    public String calcular(String n1, String n2, String n3){
        String definitiva;
        if(n1.equals("") || n2.equals("") || n3.equals("")){
            definitiva = "";
            return definitiva;
        }

        Double nota1 = Double.valueOf(n1);
        Double nota2 = Double.valueOf(n2);
        Double nota3 = Double.valueOf(n3);
        Double def = Math.rint(((nota1*0.3)+(nota2*0.3)+(nota3*0.4))*1000)/1000;;

        definitiva = String.valueOf(def);
        return (definitiva);
    }

    public void ejecutar(){
        defp.setText(calcular(n1p.getText().toString(),n2p.getText().toString(),n3p.getText().toString()));
        defi.setText(calcular(n1i.getText().toString(),n2i.getText().toString(),n3i.getText().toString()));
        defm.setText(calcular(n1m.getText().toString(),n2m.getText().toString(),n3m.getText().toString()));

    }


    public void guardar(){
        SharedPreferences preferencias=getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();

        editor.putString("nota1p", n1p.getText().toString());
        editor.putString("nota2p", n2p.getText().toString());
        editor.putString("nota3p", n3p.getText().toString());

        editor.putString("nota1i", n1i.getText().toString());
        editor.putString("nota2i", n2i.getText().toString());
        editor.putString("nota3i", n3i.getText().toString());

        editor.putString("nota1m", n1m.getText().toString());
        editor.putString("nota2m", n2m.getText().toString());
        editor.putString("nota3m", n3m.getText().toString());
        editor.commit();

    }


    public abstract class TextValidator implements TextWatcher {
        private final EditText editText;

        public TextValidator(EditText editText) {
            this.editText = editText;
        }

        public abstract void validate(EditText editText, String text);

        @Override
        final public void afterTextChanged(Editable s) {
            String text = editText.getText().toString();
            validate(editText, text);
        }

        @Override
        final public void beforeTextChanged(CharSequence s, int start, int count, int after) { /* Don't care */ }

        @Override
        final public void onTextChanged(CharSequence s, int start, int before, int count) { /* Don't care */ }
    }

    public void validar (EditText editText){
        if(editText.getText().length()>0) {
            if (Double.valueOf(editText.getText().toString()) > 5) {
                editText.setError(getResources().getString(R.string.rango_alto));
            }
        }
    }

}
