package du.dusiyuan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import static du.dusiyuan.R.id.button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        Button btn= (Button)findViewById(button);   //  创建一个按钮，获取按钮的id为button


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Uri uri = Uri.parse("http://www.dusiyuan.cc");
                  Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                  startActivity(intent);
                  }
             });

    }
}
