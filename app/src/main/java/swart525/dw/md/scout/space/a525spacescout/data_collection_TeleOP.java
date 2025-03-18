package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection
    //EX: public static String TeleTopCubes = "False";
    public static String shallow = "False";
    public static String deep = "False";
    public static String YesFit = "False";
    public static String NoFit = "False";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        //Defines all checkboxes;
        //EX: final CheckBox TeleTopCubesCB = (CheckBox) findViewById(R.id.Tele_TopCubes_CB);
        final Button shallowB = (Button) findViewById(R.id.endHangShallow_B);
        shallowB.setTag("D7D7D7D5");
        final Button deepB = (Button) findViewById(R.id.endHangDeep_B);
        deepB.setTag("D7D7D7D5");

        //Defines all buttons
        //EX: final Button AutopitCommunityLocation1B = (Button) findViewById(R.id.Autopit_CommunityLocation1_B);

        final RadioButton YesFitRB = (RadioButton) findViewById(R.id.fitYes_RB);
        final RadioButton NoFitRB = (RadioButton) findViewById(R.id.fitNo_RB);
        //Defines all text boxes
        //EX: final EditText CargoStrategytxt = (EditText) findViewById(R.id.Cargo_Strategy_txt);

        shallowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) shallowB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    shallowB.setBackgroundColor(ContextCompat.getColor(shallowB.getContext(), R.color.colorPrimary));
                    shallowB.setTag("#FFE600");
                    shallow = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    shallowB.setBackgroundColor(ContextCompat.getColor(shallowB.getContext(), R.color.grey_button));
                    shallowB.setTag("D7D7D7D5");
                    shallow = "false";
                }


            }

        });

        deepB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) deepB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    deepB.setBackgroundColor(ContextCompat.getColor(deepB.getContext(), R.color.colorPrimary));
                    deepB.setTag("#FFE600");
                    deep = "true";


                }
                else if("#FFE600".equals(colorCode)){
                    deepB.setBackgroundColor(ContextCompat.getColor(deepB.getContext(), R.color.grey_button));
                    deepB.setTag("D7D7D7D5");
                    deep = "false";
                }


            }

        });


        //Below defines the button and commands for saving data and switching pages
        final Button To_EndGame = (Button) findViewById(R.id.To_Engame_B);
        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
           public void onClick(View v) {


                if (YesFitRB.isChecked()){
                    YesFit = "True";
                }
                if (NoFitRB.isChecked()){
                    NoFit = "True";
                }
                    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    startActivity(startintent);
                }

        });

    }
}
