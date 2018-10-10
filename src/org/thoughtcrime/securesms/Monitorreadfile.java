package org.thoughtcrime.securesms;

import android.content.Context;

import org.thoughtcrime.securesms.logging.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import static org.webrtc.ContextUtils.getApplicationContext;

public class Monitorreadfile {
    Context context = getApplicationContext();
    String filename="myfile";
    String str = read_file(context, filename);
    private static final String TAG = Monitorreadfile.class.getSimpleName();

    private String read_file(Context context, String filename) {
        try {
            FileInputStream fis = context.openFileInput(filename);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            Log.i(TAG, "file content is " + sb.toString());
            return sb.toString();
        } catch (FileNotFoundException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        } catch (IOException e) {
            return "";
        }

    }
}
