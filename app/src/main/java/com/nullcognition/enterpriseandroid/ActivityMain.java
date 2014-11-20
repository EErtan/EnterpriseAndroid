package com.nullcognition.enterpriseandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ActivityMain extends Activity {

  /* Parts in content provider framework:
  * Four key parts of Content provider: the contract, crud methods and database management, content observers, registration/permission
  *
  * Contract - source file that publishes symbols and costants that external processes need to access the provider,
  * incuded with the external source.
  *
  * Content resolver - android lib part using system level services to identify the signle content provider currently
  * registered as the manager of the dataset correstponding to a given URI, typically optained from the contract
  *
  * Content provider - what the content resolver forwards requests to, managing the dataset, and suplying clients with
  * a consistent view of the data and managing their access to it
  *
  * Content Observer - api supporting a URI based notifaction system which makes it possible for clients to discover
  * changes within the dataset
  *
  *
  * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  // uris as names for virtual datasets with canonical scheme content://
  // scheme-authority-path-id


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
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
