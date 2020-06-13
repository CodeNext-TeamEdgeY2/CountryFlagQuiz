package com.example.countryflagquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class QuestionsActivity extends AppCompatActivity {
    CountryCodes myCountryCodes = new CountryCodes();
    ImageView countryImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        countryImage = findViewById(R.id.countryFlag);
    }

    public void fetchData(View view) {
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String countryCode = myCountryCodes.getRandomCountryCode();
        String flagUrl = "https://www.countryflags.io/" + countryCode + "/flat/64.png";

        Picasso.get().load(flagUrl).into(countryImage);
    }
}

