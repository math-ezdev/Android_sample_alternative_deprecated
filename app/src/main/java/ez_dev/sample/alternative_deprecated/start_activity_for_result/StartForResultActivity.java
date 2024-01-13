package ez_dev.sample.alternative_deprecated.start_activity_for_result;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ez_dev.sample.alternative_deprecated.R;

public class StartForResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result);

        Intent intent = new Intent(this,ResultActivity.class);

        //FIXME
        int REQUEST_CODE = 1;
        //startActivityForResult(intent, REQUEST_CODE);

        //TODO
        activityResultLauncher.launch(intent);
        //imageActivityResultLauncher.launch("image/*");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(this, "onActivityResult (startActivityForResult deprecated)", Toast.LENGTH_SHORT).show();
    }

    ActivityResultLauncher<Intent> activityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            activityResult -> {
                int resultCode = activityResult.getResultCode();
                Intent data = activityResult.getData();

                Toast.makeText(this, "ActivityResultLauncher alternative", Toast.LENGTH_SHORT).show();
            }
    );

    ActivityResultLauncher<String> imageActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            uri -> {
                Toast.makeText(this, "ActivityResultLauncher image", Toast.LENGTH_SHORT).show();
            }
    );
}