package id.mahmud.gametebakgambar;

import android.app.Activity;
import android.text.InputFilter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CumaSinisActivity extends Activity {

	private EditText jawaban;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cuma_sinis);
		jawaban = (EditText)findViewById(R.id.editText1);
		jawaban.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
		
	}

	public void cekjawaban(View v){
		String jawabanBenar = "CUMASINIS";
		String jawabanUser = jawaban.getText().toString();
		if(jawabanUser.equals(jawabanBenar)){
			Toast.makeText(getApplicationContext(), "JAWABAN ANDA BENAR", Toast.LENGTH_LONG).show();
			Intent trans = new Intent(getApplicationContext(),EnergiGitarisActivity.class);
			startActivity(trans);
			jawaban.setText("");
			finish();
			
			
		}else{
			Toast.makeText(getApplicationContext(), "JAWABAN MASIH SALAH !", Toast.LENGTH_LONG).show();
			jawaban.setText("");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cuma_sinis, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
