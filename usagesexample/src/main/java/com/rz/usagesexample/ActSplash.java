package com.rz.usagesexample;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rz.logger.LogWriter;

public class ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        new SwordAsyncTask<>().execute("rzrasel.net");
    }

    //AsyncTask<Void, Void, Void>
    public final class SwordAsyncTask<T> extends AsyncTask<T, Integer, T> {
        @Override
        protected void onPreExecute() {
            LogWriter.Log("onPreExecute");
        }

        @Override
        protected T doInBackground(T... argParams) {
            LogWriter.Log("PassedValue: " + argParams[0].toString());
            LogWriter.Log("doInBackground");
            return null;
        }

        @Override
        protected void onPostExecute(T argResult) {
            LogWriter.Log("onPostExecute");
        }

        @Override
        protected void onProgressUpdate(Integer... argProgress) {
            LogWriter.Log("ProgressValue" + argProgress.toString());
            LogWriter.Log("onProgressUpdate");
        }
    }
}
