package com.yu.atm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PokerCard extends ConstraintLayout {

    int value;
    private TextView left_point;
    private TextView right_point;
    private ImageView typeImage;

    public PokerCard(Context context) {
        super(context);
    }

    public PokerCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.card,this);
        left_point = findViewById(R.id.point_left_top);
        right_point = findViewById(R.id.point_right_bottom);
        typeImage = findViewById(R.id.type);
    }

    public int getValue(){return value;}

    public void setValue(int value){
        this.value=value;
        int point=(value%13)+1;
        int type=value/13;
        switch (type){
            case 0:
                typeImage.setImageResource(R.drawable.club);
                break;
            case 1:
                typeImage.setImageResource(R.drawable.diamond);
                break;
            case 2:
                typeImage.setImageResource(R.drawable.hearts);
                break;
            case 3:
                typeImage.setImageResource(R.drawable.spade);
                break;
        }
        if(point!=1&&point!=11&&point!=12&&point!=13) {
            left_point.setText(point + "");
            right_point.setText(point + "");
        }else {
            switch (point){
                case 1:
                    left_point.setText("A");
                    right_point.setText("A");
                    break;
                case 11:
                    left_point.setText("J");
                    right_point.setText("J");
                    break;
                case 12:
                    left_point.setText("Q");
                    right_point.setText("Q");
                    break;
                case 13:
                    left_point.setText("K");
                    right_point.setText("K");
                    break;

            }
        }


    }

}
