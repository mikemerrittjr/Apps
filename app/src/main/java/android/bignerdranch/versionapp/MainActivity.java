package android.bignerdranch.versionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button vrs_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vrs_page = (Button) findViewById(R.id.vrs_page);
        vrs_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Version();
            }
        });
    }

    public void Version() {
        Intent intent = new Intent(this, VersionPage.class);
        startActivity(intent);
    }

}

