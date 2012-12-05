package i3.moviledash;

import org.xml.sax.Parser;

import i3.moviledash.entidades.Historia;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class ABMHistoria extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_abmhistoria);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_abmhistoria, menu);
		return true;
	}

	public void aceptarOnclick(View button) {

		Historia h = new Historia();
		boolean error = false;

		if (((EditText) findViewById(R.id.text_tituloHistoria)).getText()
				.toString().equals("")) {
			error = true;
		} else {
			h.setNombre(((EditText) findViewById(R.id.text_tituloHistoria))
					.getText().toString());
		}

		if ((((EditText) findViewById(R.id.text_descripcion)).getText()
				.toString()).equals("")) {
			error = true;
		} else {
			h.setDetalle(((EditText) findViewById(R.id.text_descripcion))
					.getText().toString());
		}

		if ((((EditText) findViewById(R.id.int_costo)).getText().toString())
				.equals("")) {
			error = true;
		} else {
			h.setCosto(Double
					.parseDouble(((EditText) findViewById(R.id.int_costo))
							.getText().toString()));
		}

		switch (((Spinner) findViewById(R.id.spinner_riesgo))
				.getSelectedItemPosition()) {
		case 0:
			h.setRiesgo(1);
			break;
		case 1:
			h.setRiesgo(2);
			break;
		case 2:
			h.setRiesgo(3);
			break;
		}

		switch (((Spinner) findViewById(R.id.spinner_prioridad))
				.getSelectedItemPosition()) {
		case 0:
			h.setPrioridad(1);
			break;
		case 1:
			h.setPrioridad(2);
			break;
		case 2:
			h.setPrioridad(3);
			break;
		}

		if (error) {
			AlertDialog alertDialog = new AlertDialog.Builder(this).create();
			alertDialog.setTitle("Error");
			alertDialog.setMessage("Falta completar algun dato");
			alertDialog.show();

		} else {
			// guardar la historia
		}

	}

}
