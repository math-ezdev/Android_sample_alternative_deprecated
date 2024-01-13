package ez_dev.sample.alternative_deprecated.on_back_pressed;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import ez_dev.sample.alternative_deprecated.R;

public class OnBackPressedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_back_pressed);

        //FIXME
        //onBackPressed();

        //TODO
        getOnBackPressedDispatcher().addCallback(onBackPressedCallback);
        //getOnBackPressedDispatcher().onBackPressed();

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(OnBackPressedActivity.this, "onBackPressed deprecated", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }

    //
    /**
     *  enabled: 'Only when this callback is enabled will it receive callbacks to handleOnBackPressed.'
     * */
    OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(true) {
        @Override
        public void handleOnBackPressed() {
            Toast.makeText(OnBackPressedActivity.this, "OnBackPressedCallback alternative", Toast.LENGTH_SHORT).show();
        }
    };
}