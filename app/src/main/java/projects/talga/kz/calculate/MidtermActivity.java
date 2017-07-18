package projects.talga.kz.calculate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MidtermActivity extends AppCompatActivity {

    Button resetButton, calculateButton;
    int sum = 0;

    EditText grade1EditText;

    List<Integer> gradeList = new ArrayList<Integer>();
    // List<String> subTotalList = new ArrayList<String>();

    TextView midterm1TextView, midterm2TextView, totalTextView, subTotalTextView;
    RadioButton midterm1RadioButton, midterm2RadioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterm);
    }


    public void displayResult(View view) {


    }

    public void subTotal(View view) {

        grade1EditText = (EditText) findViewById(R.id.grade1_edit_text);
        subTotalTextView = (TextView) findViewById(R.id.subtotal_text_view);
        midterm1TextView = (TextView) findViewById(R.id.midterm1_text_view);

    }

}

/*
        String number = grade1EditText.getText() + "";

            if (Integer.parseInt(number) <= 100) {
                int a = Integer.parseInt(number);
                grade1EditText.setText("");

                for (int i = 0; i < gradeList.size(); i++) {
                    gradeList.add(a);
               *//*     String str = gradeList + "";
                    str = str.replace("[", "");
                    str = str.replace("]", "");
                    subTotalTextView.setText(str);*//*
               sum+=gradeList.get(i);

                }
                for (int j = 1; j<gradeList.size(); j++){
                    sum+=gradeList.get(j);
                }

                midterm1TextView.setText(sum+"");
            } else {
                Toast.makeText(getApplicationContext(), "Something went wrong! Remember max number is 100", Toast.LENGTH_LONG).show();
                return;
            }*/