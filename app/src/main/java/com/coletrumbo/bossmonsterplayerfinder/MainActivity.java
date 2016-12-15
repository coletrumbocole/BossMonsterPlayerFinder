package com.coletrumbo.bossmonsterplayerfinder;

//import android.app.Activity;
//import android.os.Bundle;
//import android.text.Html;
//import android.text.method.LinkMovementMethod;
//import android.widget.TextView;
//
//public class MainActivity extends Activity {
//    @Override public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        TextView tv = (TextView) findViewById(R.id.question_textView);
//        tv.setText( Html.fromHtml("<b>This is a textView with a link </b>"
//            +" <br /> <a href='http://www.coderzheaven.com'>Coderzheaven</a> "
//            +"created in the Java source code using HTML."));
//        tv.setMovementMethod(LinkMovementMethod.getInstance());
//    }
//}



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mYesButton;
    private TextView mSlackMeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSlackMeTextView = (TextView) findViewById(R.id.slack_me_textView);

        this.mYesButton = (Button) findViewById(R.id.yes_button);
        this.mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSlackMeTextView.setVisibility(View.VISIBLE);
                mSlackMeTextView.setVisibility(View.VISIBLE);
                String text = "Talk to me on <a href='https://superinternetempire.slack.com/'>Slack</a>";
                mSlackMeTextView.setText(Html.fromHtml(text));
                mSlackMeTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });

    }
}
