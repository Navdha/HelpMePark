package com.example.purav.helpmepark;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.*;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    String serv1 = "";
    String serv2 = "";
    String serv3 = "";
    String serv4 = "";

    String lat1 ="40.1999571";
    String lat2 ="";
    String lat3 ="";
    String lat4 ="";

    String long1 = "-76.7671387";
    String long2 = "";
    String long3 = "";
    String long4 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ScrollView sv = (ScrollView) findViewById(R.id.sbx);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        sv.setVisibility(View.GONE);
        layout.setVisibility(View.GONE);
        Spinner s = (Spinner) findViewById(R.id.spinnerCity);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.cities,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        s.setAdapter(adapter);
        Button submit = (Button) findViewById(R.id.btnSubmit);
        assert submit != null;
        Button refresh1 = (Button) findViewById(R.id.btnRefresh1);
        assert refresh1 != null;
        refresh1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AsyncHttpClient client = new AsyncHttpClient();
                client.get("http://10.0.2.2:8080/ParkingService/rest/garage/" + serv1, null, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] bytes) {
                        try {
                            String resp = new String(bytes,"UTF-8");
                            JSONObject json = new JSONObject(resp);
                            TextView spot1 = (TextView) findViewById(R.id.spot1);
                            spot1.setText(json.getString("avail"));
                            TextView ts1 = (TextView) findViewById(R.id.lUpdated1);
                            String temp = json.getString("time");
                            temp = temp.substring(temp.length()-8);
                            temp = temp.replace('.',':');
                            ts1.setText(temp);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                    }
                });
            }
        });
        Button refresh2 = (Button) findViewById(R.id.btnRefresh2);
        assert refresh2 != null;
        refresh2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AsyncHttpClient client = new AsyncHttpClient();
                client.get("http://10.0.2.2:8080/ParkingService/rest/garage/" + serv2, null, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] bytes) {
                        try {
                            String resp = new String(bytes,"UTF-8");
                            JSONObject json = new JSONObject(resp);
                            TextView spot2 = (TextView) findViewById(R.id.spot2);
                            spot2.setText(json.getString("avail"));
                            TextView ts2 = (TextView) findViewById(R.id.lUpdated2);
                            String temp = json.getString("time");
                            temp = temp.substring(temp.length()-8);
                            temp = temp.replace('.',':');
                            ts2.setText(temp);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                    }
                });
            }
        });
        Button refresh3 = (Button) findViewById(R.id.btnRefresh3);
        assert refresh3 != null;
        refresh3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AsyncHttpClient client = new AsyncHttpClient();
                client.get("http://10.0.2.2:8080/ParkingService/rest/garage/" + serv3, null, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] bytes) {
                        try {
                            String resp = new String(bytes,"UTF-8");
                            JSONObject json = new JSONObject(resp);
                            TextView spot3 = (TextView) findViewById(R.id.spot3);
                            spot3.setText(json.getString("avail"));
                            TextView ts3 = (TextView) findViewById(R.id.lUpdated3);
                            String temp = json.getString("time");
                            temp = temp.substring(temp.length()-8);
                            temp = temp.replace('.',':');
                            ts3.setText(temp);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                    }
                });
            }
        });
        Button refresh4 = (Button) findViewById(R.id.btnRefresh4);
        assert refresh4 != null;
        refresh4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AsyncHttpClient client = new AsyncHttpClient();
                client.get("http://10.0.2.2:8080/ParkingService/rest/garage/" + serv4, null, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] bytes) {
                        try {
                            String resp = new String(bytes,"UTF-8");
                            JSONObject json = new JSONObject(resp);
                            TextView spot4 = (TextView) findViewById(R.id.spot4);
                            spot4.setText(json.getString("avail"));
                            TextView ts4 = (TextView) findViewById(R.id.lUpdated4);
                            String temp = json.getString("time");
                            temp = temp.substring(temp.length()-8);
                            temp = temp.replace('.',':');
                            ts4.setText(temp);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                    }
                });
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = ((Spinner) findViewById(R.id.spinnerCity)).getSelectedItem().toString();
                AsyncHttpClient client = new AsyncHttpClient();
                client.get("http://10.0.2.2:8080/DatabaseService/rest/database/" + location, null, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, cz.msebera.android.httpclient.Header[] headers, byte[] response) {
                        try {
                            String resp = new String(response, "UTF-8");
                            JSONObject json = new JSONObject(resp);
                            TextView add1 = (TextView) findViewById(R.id.add1);
                            add1.setText(json.getString("address1"));
                            TextView add2 = (TextView) findViewById(R.id.add2);
                            add2.setText(json.getString("address2"));
                            TextView add3 = (TextView) findViewById(R.id.add3);
                            add3.setText(json.getString("address3"));
                            TextView add4 = (TextView) findViewById(R.id.add4);
                            add4.setText(json.getString("address4"));
                            TextView spot1 = (TextView) findViewById(R.id.spot1);
                            spot1.setText(json.getString("availability1"));
                            TextView spot2 = (TextView) findViewById(R.id.spot2);
                            spot2.setText(json.getString("availability2"));
                            TextView spot3 = (TextView) findViewById(R.id.spot3);
                            spot3.setText(json.getString("availability3"));
                            TextView spot4 = (TextView) findViewById(R.id.spot4);
                            spot4.setText(json.getString("availability4"));
                            TextView ts1 = (TextView) findViewById(R.id.lUpdated1);
                            ts1.setText(json.getString("timestamp1"));
                            TextView ts2 = (TextView) findViewById(R.id.lUpdated2);
                            ts2.setText(json.getString("timestamp2"));
                            TextView ts3 = (TextView) findViewById(R.id.lUpdated3);
                            ts3.setText(json.getString("timestamp3"));
                            TextView ts4 = (TextView) findViewById(R.id.lUpdated4);
                            ts4.setText(json.getString("timestamp4"));
                            ScrollView sv = (ScrollView) findViewById(R.id.sbx);
                            LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
                            sv.setVisibility(View.VISIBLE);
                            layout.setVisibility(View.VISIBLE);
                            serv1 = json.getString("sName1");
                            serv2 = json.getString("sName2");
                            serv3 = json.getString("sName3");
                            serv4 = json.getString("sName4");
                            String temp1 = json.getString("cord1");
                            String temp2 = json.getString("cord2");
                            String temp3 = json.getString("cord3");
                            String temp4 = json.getString("cord4");
                            String[] arr1 = temp1.split(",");
                            String[] arr2 = temp1.split(",");
                            String[] arr3 = temp1.split(",");
                            String[] arr4 = temp1.split(",");

                            lat1 = arr1[0];
                            long1 = arr1[1];
                            lat2 = arr2[0];
                            long2 = arr2[1];
                            lat3 = arr3[0];
                            long3 = arr3[1];
                            lat4 = arr4[0];
                            long4 = arr4[1];

                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }

                    @Override
                    public void onFailure(int i, cz.msebera.android.httpclient.Header[] headers, byte[] response, Throwable throwable) {
                        TextView tv = (TextView) findViewById(R.id.add1);
                        tv.setText(response.toString());
                    }
                });
            }
        });
        TextView tv1 = (TextView) findViewById(R.id.add1);
        tv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + lat1 + "," + long1);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        TextView tv2 = (TextView) findViewById(R.id.add2);
        tv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri gmmIntentUri = Uri.parse("google.navigation:q="+lat2+","+long2);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        TextView tv3 = (TextView) findViewById(R.id.add3);
        tv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri gmmIntentUri = Uri.parse("google.navigation:q="+lat3+","+long3);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        TextView tv4 = (TextView) findViewById(R.id.add1);
        tv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri gmmIntentUri = Uri.parse("google.navigation:q="+lat4+","+long4);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}

