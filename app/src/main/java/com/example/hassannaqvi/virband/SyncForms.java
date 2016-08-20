package com.example.hassannaqvi.virband;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

/**
 * Created by hassan.naqvi on 7/26/2016.
 */
public class SyncForms extends AsyncTask<Void, Void, String> {

    private static final String TAG = "SyncForms";
    private Context mContext;
    private ProgressDialog pd;


    public SyncForms(Context context) {
        mContext = context;
    }

    public static void longInfo(String str) {
        if (str.length() > 4000) {
            Log.i("TAG: ", str.substring(0, 4000));
            longInfo(str.substring(4000));
        } else
            Log.i("TAG: ", str);
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Please wait... Processing Forms");
        pd.show();

    }


    @Override
    protected String doInBackground(Void... params) {

        String line = "No Response";

        HttpURLConnection connection = null;
        try {
            //String request = "http://192.168.1.10/appdata/syncdb.php";
            String request = "http://10.1.42.30:3000/forms";

            URL url = new URL(request);
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.setUseCaches(false);
            connection.connect();


            JSONArray jsonSync = new JSONArray();

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            FormsDBHelper db = new FormsDBHelper(mContext);
            Collection<FormsContract> forms = db.getAllForms();
            Log.d(TAG, String.valueOf(forms.size()));
//            pd.setMessage("Total Forms: " );
            for (FormsContract fc : forms) {

                JSONObject jsonParam = new JSONObject();

                jsonParam.put("tab_id", fc.getID());
                jsonParam.put("tab_form_no", fc.getFormNo());
                jsonParam.put("tab_101", fc.getVA101());
                jsonParam.put("tab_101time", fc.getVA101time());
                jsonParam.put("tab_102", fc.getVA102());
                jsonParam.put("tab_01", fc.getVA01());
                jsonParam.put("tab_02", fc.getVA02());
                jsonParam.put("tab_03", fc.getVA03());
                jsonParam.put("tab_04", fc.getVA04());
                jsonParam.put("tab_sec_b", fc.getVB());
                jsonParam.put("tab_sec_c", fc.getVC());
                jsonParam.put("tab_sec_d", fc.getVD());
                jsonParam.put("tab_sec_e", fc.getVE());
                jsonParam.put("tab_index_child", fc.getIChild1());
                jsonParam.put("tab_index_child", fc.getIChild2());
                jsonParam.put("tab_index_child", fc.getIChild3());
                jsonParam.put("tab_index_child", fc.getIChild4());
                jsonParam.put("tab_index_child", fc.getIChild5());
                jsonParam.put("tab_index_child", fc.getIChild6());
                jsonParam.put("tab_109", fc.getVA109());
                jsonParam.put("tab_gps_lat", fc.getGPSLat());
                jsonParam.put("tab_gps_lng", fc.getGPSLng());
                jsonParam.put("tab_gps_acc", fc.getGPSAcc());
                jsonParam.put("tab_gps_time", fc.getGPSTime());
                jsonParam.put("tab_device_id", fc.getDeviceID());

                jsonSync.put(jsonParam);
                //wr.writeBytes(jsonParam.toString().replace("\uFEFF", "") + "\n");

            }
            wr.writeBytes(jsonSync.toString().replace("\uFEFF", "") + "\n");
            longInfo(jsonSync.toString().replace("\uFEFF", "") + "\n");
            wr.flush();
            int HttpResult = connection.getResponseCode();
            if (HttpResult == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        connection.getInputStream(), "utf-8"));
                StringBuffer sb = new StringBuffer();

                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();

                System.out.println("" + sb.toString());
                return sb.toString();
            } else {
                System.out.println(connection.getResponseMessage());
                return connection.getResponseMessage();
            }
        } catch (MalformedURLException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (connection != null)
                connection.disconnect();
        }
        return line;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        pd.setMessage("Server Response: " + result);
        pd.setTitle("Please wait... Done Forms");
        pd.show();
    }
}