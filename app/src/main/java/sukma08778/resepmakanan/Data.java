package sukma08778.resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sukma
 */

public class Data extends AppCompatActivity{
    ImageView picture;
    TextView make;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Intent in = getIntent();

        picture= (ImageView) findViewById(R.id.picture);
        picture.setImageResource(in.getIntExtra("Picture",0));

        make = (TextView) findViewById(R.id.make);
        make.setText(in.getStringExtra("HowToMake"));

        getSupportActionBar().setTitle(in.getStringExtra("Title"));


    }
}
