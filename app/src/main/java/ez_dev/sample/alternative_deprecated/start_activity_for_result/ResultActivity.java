package ez_dev.sample.alternative_deprecated.start_activity_for_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ez_dev.sample.alternative_deprecated.R;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intentData = getIntent();
        setResult(RESULT_OK,intentData);
        finish();
    }

}