package com.example.eliacerfernandez.listimage;

import android.app.ListActivity;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Simulamos que estraemos los daro de la base de datos
        /*String [] columnasBD = new String[]{"id","imagen","textosuperior","textoinferior"};
        MatrixCursor cursor = new MatrixCursor(columnasBD);

        cursor.addRow(new Object[] {"0",R.drawable.abc_btn_check_material,"ESFERA","Es la esfera del dragon"});
        cursor.addRow(new Object[] {"1",R.drawable.abc_btn_check_material,"ESFERA","Es la esfera del dragon"});

        //Añadimos los daros al Adapter y le indicamos donde dibujar cada dato de la la fila
        String[] desdeEstasColumnas = {"imagen", "textoSuperior", "textoInferior"};
        int[] aEstasViews = {R.id.imageView, R.id.titulo, R.id.subtitulo};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.activity_main, cursor, desdeEstasColumnas, aEstasViews, 0);

        ListView listado = getListView();
        listado.setAdapter(adapter);*/


        String[] columnasBD = new String[] {"_id", "imagen", "textoSuperior", "textoInferior"};
        MatrixCursor cursor = new MatrixCursor(columnasBD);
        cursor.addRow(new Object[] {"0", R.drawable.esfera, "Esfera", "Esfera de dibujos animados."});
        cursor.addRow(new Object[] {"1", R.drawable.mercedes, "Auto", "El carro del año"});

        //A�adimos los datos al Adapter y le indicamos donde dibujar cada dato en la fila del Layout
        String[] desdeEstasColumnas = {"imagen", "textoSuperior", "textoInferior"};
        int[] aEstasViews = {R.id.imageView, R.id.titulo, R.id.subtitulo};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.activity_main, cursor, desdeEstasColumnas, aEstasViews, 0);

        ListView listado = getListView();
        listado.setAdapter(adapter);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
