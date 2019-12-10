package com.example.drakh.tictacktoereal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int [] gameState={2,2,2,2,2,2,2,2,2};
    int player=0;
    public  void  btn(View view)
    {ImageView img=(ImageView)view;
        int curTag=Integer.parseInt(   img.getTag().toString());
      //  img.setY(-1500);
        if (player==0)

        {
            img.setImageResource(R.drawable.black);
          //  img.animate().translationYBy(1500).setDuration(300);

            gameState[curTag] = player;
            player = 1;
        }
        else
            if(player==1)
            {
                img.setImageResource(R.drawable.blue);
           //     img.animate().translationYBy(1500).setDuration(300);
                gameState[curTag]=player;
                player=0;
            }
    

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
