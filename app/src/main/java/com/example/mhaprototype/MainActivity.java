package com.example.mhaprototype;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    APIInterface apiInterface;
//private EditText email;
//private EditText password;
//private Button buttonGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        email = (EditText) findViewById(R.id.txtEmail);
//        password = (EditText) findViewById(R.id.txtPassword);
//        buttonGo = (Button) findViewById(R.id.btnGo);

        RecyclerView recyclerViiew = findViewById(R.id.recyclerview);
        apiInterface = RetrofitInstance.getRetrofit().create(APIInterface.class);
        apiInterface.getuserBookings().enqueue(new Callback<List<BookingModel>>() {
          @Override
        public void onResponse(Call<List<BookingModel>> call, Response<List<BookingModel>> response) {
            if(response.body().size() > 0){
                List<BookingModel> list = response.body();
                BookingAdapter adapter  = new BookingAdapter(list, MainActivity.this);
                LinearLayoutManager linear = new LinearLayoutManager(MainActivity.this);
                recyclerViiew.setLayoutManager(linear);
                recyclerViiew.setAdapter(adapter);

            }else{
                Toast.makeText(MainActivity.this, "It does not work", Toast.LENGTH_SHORT).show();
            }
        }

         @Override
           public void onFailure(Call<List<BookingModel>> call, Throwable t) {
             //if there is an error in code or API does not respond or there is internet issue than the following will run
             Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            }
              });



//    /**called when user clicks on go button*/
//    public void openRegisterActivity(View view){
//        String Email = email.getText().toString();
//        String Password = password.getText().toString();
//
//        Intent intent = new Intent(this, childRegister.class);
//
//        startActivity(intent);


//        if(Email.toString() == "" ||  Password == ""){
//            Toast.makeText(MainActivity.this,"Please enter your credentials",Toast.LENGTH_LONG).show();
//        }
//        else if(Email == "ubaid@gmail.com" && Password == "Hey"){
//            Intent intent = new Intent(this, registerActivity.class);
//
//            startActivity(intent);
//        }else{
//            Toast.makeText(MainActivity.this,"Email: " + Email + " And password: " + Password + " does not exist",Toast.LENGTH_LONG).show();
//        }
                //   }


    }}