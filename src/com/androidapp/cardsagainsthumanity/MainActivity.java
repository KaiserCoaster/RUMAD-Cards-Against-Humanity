package com.androidapp.cardsagainsthumanity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{

	
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        
        
        Button main1 = (Button) findViewById(R.id.button1);
        Button main2 = (Button) findViewById(R.id.button2);
        Button main3 = (Button) findViewById(R.id.button3);
        Button main4 = (Button) findViewById(R.id.button4);
        Button main5 = (Button) findViewById(R.id.button5);
    	
    	main1.setOnClickListener(new OnClickListener()
        { 
        //On Click function
        public void onClick(View v) 
        {    	
        	Intent it = new Intent(MainActivity.this,CreateTable.class);
            startActivity(it);     
              
        }
            
        });
    	
    	main2.setOnClickListener(new OnClickListener()
        { 
        //On Click function
        public void onClick(View v) 
        {    	
        	Intent it = new Intent(MainActivity.this,JoinTable.class);
            startActivity(it);     
              
        }
            
        });
        
    	
    	main3.setOnClickListener(new OnClickListener()
        { 
        //On Click function
        public void onClick(View v) 
        {    	
        	Intent it = new Intent(MainActivity.this,GamesInProgress.class);
            startActivity(it);     
              
        }
            
        });
        
    	
    	main4.setOnClickListener(new OnClickListener()
        { 
        //On Click function
        public void onClick(View v) 
        {    	
        	Intent it = new Intent(MainActivity.this,Rules.class);
            startActivity(it);     
              
        }
            
        });
        
    	
    	main5.setOnClickListener(new OnClickListener()
        { 
        //On Click function
        public void onClick(View v) 
        {    	
        	Intent it = new Intent(MainActivity.this,Settings.class);
            startActivity(it);     
              
        }
            
        });
        
        
        
    }
    

    
    
      
    
    
}




