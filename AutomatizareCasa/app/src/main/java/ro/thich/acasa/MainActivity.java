package ro.thich.acasa;

import android.app.*;
import android.content.*;
import android.os.*;
import android.support.v7.preference.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.io.*;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;


public class MainActivity extends Activity 
{
	//SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
	
	//String urlSet = SP.getString("address", "http://www.google.ro");
	
	String urlSet = "http://192.168.1.125:8080";
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		RelativeLayoutButton button1 = new RelativeLayoutButton(this,R.id.button1);
		button1.setText(R.id.test_button_text1, getString(R.string.apasa));
        button1.setText(R.id.test_button_text2, "Baie Mare");
        button1.setImageResource(R.id.test_button_image, R.drawable.iconfinder_bathtub);

		RelativeLayoutButton button2 = new RelativeLayoutButton(this,R.id.button2);
        button2.setText(R.id.test_button_text1, getString(R.string.apasa));
        button2.setText(R.id.test_button_text2, "Dressing");
		button2.setImageResource(R.id.test_button_image, R.drawable.iconfinder_furniture_living_room_home_house_offie);
		
		RelativeLayoutButton button3 = new RelativeLayoutButton(this,R.id.button3);
        button3.setText(R.id.test_button_text1, getString(R.string.apasa));
        button3.setText(R.id.test_button_text2, "Dormitor Mare");
		button3.setImageResource(R.id.test_button_image, R.drawable.iconfinder_bed);
		
		RelativeLayoutButton button4 = new RelativeLayoutButton(this,R.id.button4);
        button4.setText(R.id.test_button_text1, getString(R.string.apasa));
        button4.setText(R.id.test_button_text2, "Hol Mare");
		button4.setImageResource(R.id.test_button_image, R.drawable.iconfinder_couple);
		
		RelativeLayoutButton button5 = new RelativeLayoutButton(this,R.id.button5);
        button5.setText(R.id.test_button_text1, getString(R.string.apasa));
        button5.setText(R.id.test_button_text2, "Hol Mic");
		button5.setImageResource(R.id.test_button_image, R.drawable.iconfinder_couple);
		
		RelativeLayoutButton button6 = new RelativeLayoutButton(this,R.id.button6);
        button6.setText(R.id.test_button_text1, getString(R.string.apasa));
        button6.setText(R.id.test_button_text2, "Living");
		button6.setImageResource(R.id.test_button_image, R.drawable.iconfinder_triple_seat_sofa);

		RelativeLayoutButton button7 = new RelativeLayoutButton(this,R.id.button7);
        button7.setText(R.id.test_button_text1, getString(R.string.apasa));
        button7.setText(R.id.test_button_text2, "Bucatarie");
		button7.setImageResource(R.id.test_button_image, R.drawable.iconfinder_coffee_cup);
		
		RelativeLayoutButton button8 = new RelativeLayoutButton(this,R.id.button8);
        button8.setText(R.id.test_button_text1, getString(R.string.apasa));
        button8.setText(R.id.test_button_text2, "Dormitor Christina");
		button8.setImageResource(R.id.test_button_image, R.drawable.iconfinder_bed);

		RelativeLayoutButton button9 = new RelativeLayoutButton(this,R.id.button9);
        button9.setText(R.id.test_button_text1, getString(R.string.apasa));
        button9.setText(R.id.test_button_text2, "Baie Christina");
		button9.setImageResource(R.id.test_button_image, R.drawable.iconfinder_bathtub);
		
		button1.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led1";
					new RequestTask().execute(urlSet + urlAttr);
					Toast.makeText(MainActivity.this, "Baia Mare - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button2.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led2";
					new RequestTask().execute(urlSet + urlAttr);
					Toast.makeText(MainActivity.this, "Dressing - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button3.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led3";
					Toast.makeText(MainActivity.this, "Dormitor Mare - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button4.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led4";
					Toast.makeText(MainActivity.this, "Hol Mare - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button5.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led5";
					Toast.makeText(MainActivity.this, "Hol Mic - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button6.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led6";
					Toast.makeText(MainActivity.this, "Living - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button7.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led7";
					Toast.makeText(MainActivity.this, "Bucatarie - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button8.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led8";
					Toast.makeText(MainActivity.this, "Camera Christina - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

				}
			});
		button9.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					String urlAttr = "/?led9";
					Toast.makeText(MainActivity.this, "Baie Christina", Toast.LENGTH_SHORT).show();

				}
			});
    }
	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		//respond to menu item selection
		
		switch (item.getItemId()) {
			case R.id.setari:
				startActivity(new Intent(MainActivity.this, MyPreferencesActivity.class));
				//Toast.makeText(MainActivity.this, "Meniu setari inexistent", Toast.LENGTH_LONG).show();
				return true;
			case R.id.about:
				//startActivity(new Intent(this, About.class));
				Toast.makeText(MainActivity.this, "Meniu 'despre' inexistent", Toast.LENGTH_LONG).show();
				return true;
			case R.id.help:
				//startActivity(new Intent(this, Help.class));
				Toast.makeText(MainActivity.this, "Meniu 'ajutor' inexistent", Toast.LENGTH_LONG).show();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
}

class RequestTask extends AsyncTask<String, String, String>{

    @Override
    protected String doInBackground(String... uri) {
        HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response;
        String responseString = null;
        try {
            response = httpclient.execute(new HttpGet(uri[0]));
            StatusLine statusLine = response.getStatusLine();
            if(statusLine.getStatusCode() == HttpStatus.SC_OK){
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                response.getEntity().writeTo(out);
                responseString = out.toString();
                out.close();
            } else{
                //Closes the connection.
				response.getEntity().getContent().close();
                throw new IOException(statusLine.getReasonPhrase());
            }
        } catch (ClientProtocolException e) {
            //TODO Handle problems..
        } catch (IOException e) {
            //TODO Handle problems..
        }
        return responseString;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        //Do anything with response..
    }
}




