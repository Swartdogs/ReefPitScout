package swart525.dw.md.scout.space.a525spacescout;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables
    public static String EndShallowHang = "False";
    public static String EndDeepHang = "False";
    public static String EndPlayerProcessor = "False";
    public static String EndPlayerStation = "False";
    public static String EndDefenceYes = "False";
    public static String EndDefenceNo = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements
        final RadioButton EndDefenceYesRB = (RadioButton) findViewById(R.id.endDefenceYes_RB);
        final RadioButton EndDefenceNoRB = (RadioButton) findViewById(R.id.endDefenseNo_RB);
        final CheckBox EndShallowHangCB = (CheckBox) findViewById(R.id.endHangShallow_CB);
        final CheckBox EndDeepHangCB = (CheckBox) findViewById(R.id.endHangDeep_CB);
        final CheckBox EndPlayerProcessorCB = (CheckBox) findViewById(R.id.endHumanPlayerProcessor_CB);
        final CheckBox EndPlayerStationCB = (CheckBox) findViewById(R.id.endHumanPlayerStation_CB);

        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {


                if (EndDefenceYesRB.isChecked()){
                    EndDefenceYes = "True";
                }
                if (EndDefenceNoRB.isChecked()){
                    EndDefenceNo = "True";
                }
                if (EndPlayerProcessorCB.isChecked()) {
                    EndPlayerProcessor = "True";
                }
                if (EndPlayerStationCB.isChecked()) {
                    EndPlayerStation = "True";
                }

                if (EndShallowHangCB.isChecked()) {
                    EndShallowHang = "True";
                }
                if (EndDeepHangCB.isChecked()) {
                    EndDeepHang = "True";
                }


                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                //if (NoHangCB.isChecked()) {
                //    NoHang = "True";
                //}

                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });


    }

}


