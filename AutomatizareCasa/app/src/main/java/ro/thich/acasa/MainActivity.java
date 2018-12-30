package ro.thich.acasa;

import android.app.*;
import android.content.res.*;
import android.os.*;
import android.support.v4.widget.*;
import android.support.v7.app.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;


public class MainActivity extends Activity 
{
	
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
					Toast.makeText(MainActivity.this, "Baia Mare", Toast.LENGTH_SHORT).show();

				}
			});
		button2.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Dressing", Toast.LENGTH_SHORT).show();

				}
			});
		button3.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Dormitor Mare", Toast.LENGTH_SHORT).show();

				}
			});
		button4.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Hol Mare", Toast.LENGTH_SHORT).show();

				}
			});
		button5.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Hol Mic", Toast.LENGTH_SHORT).show();

				}
			});
		button6.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Living", Toast.LENGTH_SHORT).show();

				}
			});
		button7.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Bucatarie", Toast.LENGTH_SHORT).show();

				}
			});
		button8.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Camera Christina", Toast.LENGTH_SHORT).show();

				}
			});
		button9.setOnClickListener( new OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText(MainActivity.this, "Baie Christina", Toast.LENGTH_SHORT).show();

				}
			});
    }
	
	
	public boolean onCreateOptionsMenu(Menu menu) {

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {

		//respond to menu item selection
		
		switch (item.getItemId()) {
			case R.id.setari:
				//startActivity(new Intent(this, Setari.class));
				Toast.makeText(MainActivity.this, "Meniu setari inexistent", Toast.LENGTH_LONG).show();
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




