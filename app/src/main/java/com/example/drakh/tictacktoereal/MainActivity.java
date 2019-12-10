package com.example.drakh.tictacktoereal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int [] gameState={2,2,2,2,2,2,2,2,2};
    int [][] winChances={
            {0,3,6},
            {0,1,2},
            {3,4,5},
            {6,7,8},
            {1,4,7},
            {2,5,8},
            {0,4,8},
            {2,4,6}
    };
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
            for (int [] check :winChances)
     if     (gameState[check[0]]==gameState[check[1]]&&
            gameState[check[1]]==gameState[check[2]]&&
            gameState[check[0]]!=2)
           {
          //     Toast.makeText(this, "yoo", Toast.LENGTH_SHORT).show();
               if (player==1)
               {
                   Toast.makeText(this, "player 1 w0n", Toast.LENGTH_SHORT).show();
               }
               else
                   Toast.makeText(this, "player 2 w0n", Toast.LENGTH_SHORT).show();
           }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
