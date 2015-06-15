package com.example.uidynamiccreation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		/**setContentView(R.layout.activity_main);**/
		/** I have Deleted the Layout Folder**/
		
		//Param(parameter) for Views(Button, Editext ...)
		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
		//Layout Creation
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		
		
		//View Creation(Button)
		Button b= new Button(MainActivity.this);
		b.setText("Click");
		b.setLayoutParams(params);
		b.setGravity(Gravity.CENTER_VERTICAL);
		
		
		//Adding the Created view(Button) to Layout
		layout.addView(b);
		
		//Param creation for the Layout
		LinearLayout.LayoutParams layoutParams= new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		
		//Adding the content to to Layout
		/**this.addContentView(view, layoutParams)**/
		
		this.addContentView(layout, layoutParams);
		
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "You have clicked a button", Toast.LENGTH_LONG).show();
				
			}
		});
	}

	

}
