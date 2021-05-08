package com.example.admin.gymbro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {

    ListView workouttypes;
    WorkoutAdapter adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises);

        workouttypes = (ListView) findViewById(R.id.workouttypes);
        adapter = new WorkoutAdapter();

        adapter.addItem(new WorkoutItem("Chest", R.drawable.chest));
        adapter.addItem(new WorkoutItem("Shoulder", R.drawable.shoulder));
        adapter.addItem(new WorkoutItem("Bicep and Tricep", R.drawable.biceps));
        adapter.addItem(new WorkoutItem("Back", R.drawable.back));
        adapter.addItem(new WorkoutItem("Legs", R.drawable.legs));
        adapter.addItem(new WorkoutItem("Abs", R.drawable.abs));


        workouttypes.setAdapter(adapter);

        workouttypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                WorkoutItem item = (WorkoutItem) adapter.getItem(position);
                if (position == 0)
             startActivity(new Intent(MainActivity1.this, Chest.class));
                if (position == 1)
                    startActivity(new Intent(MainActivity1.this, Shoulder.class));
                    if (position == 2)
                        startActivity(new Intent(MainActivity1.this, Biceps.class));
                        if (position == 3)
                            startActivity(new Intent(MainActivity1.this, Back.class));
                            if (position == 4)
                                startActivity(new Intent(MainActivity1.this, Legs.class));
                                if (position == 5)
                                    startActivity(new Intent(MainActivity1.this, Abs.class));
                Toast.makeText(getApplicationContext(),"Chosen " +  item.getName(),Toast.LENGTH_LONG).show();


            }
        });
    }


    class WorkoutAdapter extends BaseAdapter {
        ArrayList<WorkoutItem> items = new ArrayList<WorkoutItem>();

        public int getCount() {
            return items.size();
        }

        public void addItem(WorkoutItem item) {
            items.add(item);
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            WorkoutItemView view = new WorkoutItemView(getApplicationContext());
            WorkoutItem item = items.get(position);
            view.setName(item.getName());
            view.setImage(item.getResId());

            return view;
        }
    }
}