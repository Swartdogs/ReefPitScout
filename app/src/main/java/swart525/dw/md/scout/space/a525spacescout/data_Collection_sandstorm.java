package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for data collection

    public static String CoralPickupGround = "False";
    public static String CoralPickupStation = "False";
    public static String AlgaePickupGround = "False";
    public static String AlgaePickupReef = "False";
    public static String AlgaePlaceProcessor = "False";
    public static String AlgaePlaceNet = "False";
    public static String AutoHangYes = "False";
    public static String AutoHangNo = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all CheckBoxes for reef


        //Defines all Buttons for Coral pickup

        final Button AlgaePickupGroundB = (Button) findViewById(R.id.algaeGround_B);
        AlgaePickupGroundB.setTag("#D7D7D7D5");
        final Button AlgaePickupReefB = (Button) findViewById(R.id.algaeReef_B);
        AlgaePickupReefB.setTag("D7D7D7D5");
        final Button AlgaePlaceProcessorB = (Button) findViewById(R.id.algaeProcessor_B);
        AlgaePlaceProcessorB.setTag("#D7D7D7D5");


        //Defines all RadioButtons for Hang
        final RadioButton AutoHangYesRBRB = (RadioButton) findViewById(R.id.autoHangYes_RB);
        final RadioButton AutoHangNoRB = (RadioButton) findViewById(R.id.autoHangNo_RB);



        //Changes color of buttons and sets variable to true if clicked
        //Resets to default if clicked again


        //Defines Button to next page
        final Button To_EndGame_B = (Button) findViewById(R.id.To_EndGame_B);

        //Creates OnClick Listener for next page button
        To_EndGame_B.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

//Sets variables to true if checked
           if (AutoHangYesRB.isChecked()) {
                    AlgaeKnockYes = "True";
                }
                if (AutoHangNoRB.isChecked()) {
                    AlgaeKnockNo = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                startActivity(startintent);
            }
        });

    }

};
