package i3.moviledash;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tablero extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablero);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tablero, menu);
        return true;
    }
}
