package jamme.presnillo.com.presnillojammelab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);



        Button relativeButton = (Button) findViewById(R.id.relativeButton);
        relativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relativeActivity = new Intent(getApplicationContext(), relativeActivity.class);
                startActivity(relativeActivity);

            }
        });

        Button constraintButton = (Button) findViewById(R.id.constraintButton);
        constraintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent constraintActivity = new Intent(getApplicationContext(), constraintActivity.class);
                startActivity(constraintActivity);

            }
        });

        Button linearButton = (Button) findViewById(R.id.linearButton);
        linearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearActivity = new Intent(getApplicationContext(), linearActivity.class);
                startActivity(linearActivity);

            }
        });



    }
}
