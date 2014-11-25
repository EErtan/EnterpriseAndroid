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
  * registered as qthe manager of the dataset correstponding to a given URI, typically optained from the contract
  *
  * Content provider - what the content resolver forwards requests to, managing the dataset, and suplying clients with
  * a consistent view of the data and managing their access to it
  *
  * Content Observer - api supporting a URI based notifaction system which makes it possible for clients to discover
  * changes within the dataset
  *
  *
  * Three architectural approaches are
  * Service-centric with IntentService
  * ContentProvider-Centric with ContentProvider
  * SyncAdapter-Centric with androids sync adapter framework
  *
  *
  * Scalable, metadata describes what can be cached and for how long
  *
  * payload, is structured application data in xml or json and the content-type of application/json
  * or if other mime type will identify it accordingly audio/mp3
  * */

   @Override
   protected void onCreate(Bundle savedInstanceState){
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
   }

   // uris as names for virtual datasets with canonical scheme content://
   // scheme(http or https:// )-authority(dns name of origin server and or port number of accepting connections)-path-id/query(?,&,=)

   @Override
   public boolean onCreateOptionsMenu(Menu menu){
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.activity_main, menu);
	  return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item){
	  // Handle action bar item clicks here. The action bar will
	  // automatically handle clicks on the Home/Up button, so long
	  // as you specify a parent activity in AndroidManifest.xml.
	  int id = item.getItemId();

	  //noinspection SimplifiableIfStatement
	  if(id == R.id.action_settings){
		 return true;
	  }

	  return super.onOptionsItemSelected(item);
   }

   //
}

//   private int standardJavaDotNet(HttpMethod method, android.net.Uri uri, String payload, org.apache.http.client.ResponseHandler hdlr) throws java.io.IOException{
//	  {
//		 java.net.HttpURLConnection conn = (java.net.HttpURLConnection)new java.net.URL(uri.toString()).openConnection();
//		 int code = java.net.HttpURLConnection.HTTP_INTERNAL_ERROR;
//
//		 try{
//			conn.setReadTimeout(HTTP_READ_TIMEOUT);
//			conn.setConnectTimeout(HTTP_CONN_TIMEOUT);
//			conn.setRequestMethod(method.toString());
//			conn.setRequestProperty(HEADER_USER_AGENT, USER_AGENT);
//			conn.setRequestProperty(HEADER_ENCODING, ENCODING_NONE);
//			if(null != hdlr){
//			   conn.setRequestProperty(HEADER_ACCEPT, MIME_JSON);
//			   conn.setDoInput(true);
//			}
//			if(null != payload){
//			   conn.setRequestProperty(HEADER_CONTENT_TYPE, MIME_JSON);
//			   conn.setFixedLengthStreamingMode(payload.length());
//			   conn.setDoOutput(true);
//			   conn.connect();
//			   java.io.Writer out = new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(conn.getOutputStream()), "UTF-8");
//			   out.write(payload);
//			   out.flush();
//			}
//			code = conn.getResponseCode();
//			if(null != hdlr){
//			   hdlr.handleRepsonse(new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream())));
//			}
//		 }
//		 finally{
//			if(null != conn){
//			   try{ conn.disconnect(); } catch(Exception e){ }
//			}
//		 }
//		 return code;
//	  }
//   }
