package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String CoralReefL1 = "False";
    public static String CoralReefL2 = "False";
    public static String CoralReefL3 = "False";
    public static String CoralReefL4 = "False";
    public static String CoralPickupGround = "False";
    public static String CoralPickupStation = "False";
    public static String CoralPickupTrough = "False";
    public static String AlgaePickupGround = "False";
    public static String AlgaePickupReef = "False";
    public static String AlgaePlaceProcessor = "False";
    public static String AlgaePlaceNet = "False";
    public static String AlgaeKnockYes = "False";
    public static String AlgaeKnockNo = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all checkboxes for reef
        final CheckBox CoralReefL1CB = (CheckBox) findViewById(R.id.teleopCoralReachL4_CB);
        final CheckBox CoralReefL2CB = (CheckBox) findViewById(R.id.teleopCoralReachL3_CB);
        final CheckBox CoralReefL3CB = (CheckBox) findViewById(R.id.teleopCoralReachL2_CB);
        final CheckBox CoralReefL4CB = (CheckBox) findViewById(R.id.teleopCoralReachL1_CB);

        //Defines all checkboxes for coral pickup
        final CheckBox CoralPickupGroundCB = (CheckBox) findViewById(R.id.teleopCoralGround_CB);
        final CheckBox CoralPickupStationCB = (CheckBox) findViewById(R.id.teleopCoralStation_CB);
        final CheckBox CoralPickupTroughCB = (CheckBox) findViewById(R.id.teleopCoralTrough_CB);

        //Defines all checkboxes for algae
        final CheckBox AlgaePickupGroundCB = (CheckBox) findViewById(R.id.teleopAlgaeGround_CB);
        final CheckBox AlgaePickupReefCB = (CheckBox) findViewById(R.id.teleopAlgaeReef_CB);
        final CheckBox AlgaePlaceProcessorCB = (CheckBox) findViewById(R.id.teleopAlgaeprocessor_CB);
        final CheckBox AlgaePlaceNetCB = (CheckBox) findViewById(R.id.teleopAlgaeNet_CB);


        //Defines all radio buttons for algae
        final RadioButton AlgaeKnockYesRB = (RadioButton) findViewById(R.id.teleopKnockOffYes_RB);
        final RadioButton AlgaeKnockNoRB = (RadioButton) findViewById(R.id.teleopKnockOffNo_RB);




        //Defines and implements Button to continue along with variable savings
        final Button To_EndGame_B = (Button) findViewById(R.id.To_EndGame_B);

        To_EndGame_B.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                /*add in data collection pieces from checkboxes*/
                if (CoralReefL1CB.isChecked()) {
                    CoralReefL1 = "True";
                }
                if (CoralReefL2CB.isChecked()) {
                    CoralReefL2 = "True";
                }
                if (CoralReefL3CB.isChecked()) {
                    CoralReefL3 = "True";
                }
                if (CoralReefL4CB.isChecked()) {
                    CoralReefL4 = "True";
                }
                //add in data collection pieces from radio buttons
                if (CoralPickupGroundCB.isChecked()) {
                    CoralPickupGround = "True";
                }
                if (CoralPickupStationCB.isChecked()) {
                    CoralPickupStation = "True";
                }
                if (CoralPickupTroughCB.isChecked()) {
                    CoralPickupTrough = "True";
                }
                if (AlgaePickupGroundCB.isChecked()) {
                    AlgaePickupGround = "True";
                }
                if (AlgaePickupReefCB.isChecked()) {
                    AlgaePickupReef = "True";
                }
                if (AlgaePlaceProcessorCB.isChecked()) {
                    AlgaePlaceProcessor = "True";
                }
                if (AlgaePlaceNetCB.isChecked()) {
                    AlgaePlaceNet = "True";
                }
                if (AlgaeKnockYesRB.isChecked()) {
                    AlgaeKnockYes = "True";
                }
                if (AlgaeKnockNoRB.isChecked()) {
                    AlgaeKnockNo = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                startActivity(startintent);
            }
        });

    }

};
