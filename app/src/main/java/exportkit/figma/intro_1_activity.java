
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		intro_1
	 *	@date 		Friday 22nd of December 2023 07:11:39 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

import com.example.spaceyangu.R;

	public class intro_1_activity extends Activity {

	private TextView _space_yangu;
	private ImageView _back;
	private View _logo;
	private TextView _intro_1_entry;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro_1);

		_space_yangu = (TextView) findViewById(R.id.space_yangu);
		_intro_1_entry= (TextView) findViewById(R.id.intro_1_entry);
		_back = (ImageView) findViewById(R.id.back);
		_logo = (View) findViewById(R.id.logo);
	
		
		_back.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), start_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	