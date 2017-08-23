package android.com.thesis;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.*;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    public void testingGit()
    {

    }


    public void sendMessage(View view) {
        // Do something in response to button click
        //Toast.makeText(null,"test button",Toast.LENGTH_SHORT).show();

        final EditText edit =  (EditText) findViewById(R.id.editText);

        //myNum = Integer.parseInt(edit.getText().toString());
        try {
            int myNum;
            myNum = Integer.parseInt(edit.getText().toString());
            Toast toast = Toast.makeText(this, "Your number : " + myNum, Toast.LENGTH_SHORT);
            toast.show();
        }catch(NumberFormatException nfe) {
            Toast toast = Toast.makeText(this, nfe.getMessage(), Toast.LENGTH_SHORT);
            toast.show();
        }



    }

}
