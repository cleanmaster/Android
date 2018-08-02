package ca.roumani.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

    public void calculateBmiButtonPressed (View view) {
        // Retrieve the widgets in the UI
        EditText weightTextBox = (EditText) findViewById(R.id.weightTextField);
        EditText heightTextBox = (EditText) findViewById(R.id.heightTextField);

        // Get the contents of the text fields
        String weight = weightTextBox.getText().toString();
        String height = heightTextBox.getText().toString();

        // Compute BMI using our model
        BMIModel model = new BMIModel(weight, height);

        // Update the text view widget to display the result
        ((TextView) findViewById(R.id.bmiTextView)).setText(String.format("Your weight in pound is %s and your BMI is %s", model.getWeightInPound(), model.getBMI()));
    }
}
