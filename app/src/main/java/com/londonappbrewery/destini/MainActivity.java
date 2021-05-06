package com.londonappbrewery.destini;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storey;
    Button red, green;
    int arryvalu;
    Model[] models = new Model[]{
            new Model(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new Model(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new Model(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new Model(R.string.T4_End),
            new Model(R.string.T5_End),
            new Model(R.string.T6_End)

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        casTing();
        story();
        rgbutton();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arryvalu == 0) {
                    storey.setText((models[arryvalu = 2].getStory()));
                    rgbutton();
                }
                else if (arryvalu==1){
                    storey.setText((models[arryvalu = 2].getStory()));
                    rgbutton();
                }
                else if (arryvalu==2){
                    storey.setText((models[arryvalu = 5].getStory()));
                    green.setVisibility(View.INVISIBLE);
                    red.setVisibility(View.GONE);
                }
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arryvalu == 0) {
                    storey.setText((models[arryvalu = 1].getStory()));
                    rgbutton();
                }
                else if (arryvalu == 2) {
                    storey.setText((models[arryvalu = 4].getStory()));
                    green.setVisibility(View.INVISIBLE);
                    red.setVisibility(View.GONE);
                }
                else if (arryvalu == 1) {
                    storey.setText((models[arryvalu = 3].getStory()));
                    green.setVisibility(View.INVISIBLE);
                    red.setVisibility(View.GONE);

                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }


    private void story() {
        storey.setText((models[arryvalu].getStory()));
    }

    private void rgbutton() {
        red.setText(models[arryvalu].getAnsone());
        green.setText(models[arryvalu].getAnstwo());

    }

    private void casTing() {
        storey = (TextView) findViewById(R.id.storyTextView);
        red = (Button) findViewById(R.id.buttonTop);
        green = (Button) findViewById(R.id.buttonBottom);

    }


}
