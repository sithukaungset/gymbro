package com.example.admin.gymbro;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;

import android.widget.RelativeLayout;
import android.widget.TextView;

public class WorkoutItemView extends RelativeLayout {
TextView textView;
ImageView imageView;
public WorkoutItemView(Context context){
    super(context);
    init(context);

}
public WorkoutItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.workout_item,this,true);

        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

        public void setName(String name){
        textView.setText(name);
        }
        public void setImage(int resId){
        imageView.setImageResource(resId);
        }

}



