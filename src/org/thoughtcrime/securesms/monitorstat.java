package org.thoughtcrime.securesms;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.view.LayoutInflater;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import static org.webrtc.ContextUtils.getApplicationContext;
import static org.webrtc.MediaCodecVideoDecoder.printStackTrace;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.thoughtcrime.securesms.database.DatabaseFactory;
import org.thoughtcrime.securesms.database.SmsDatabase;
import org.thoughtcrime.securesms.database.loaders.MessageDetailsLoader;
import org.thoughtcrime.securesms.logging.Log;
import org.thoughtcrime.securesms.recipients.Recipient;
import org.thoughtcrime.securesms.sms.MessageSender;
import org.thoughtcrime.securesms.sms.OutgoingTextMessage;
import org.thoughtcrime.securesms.ApplicationContext;

//hide specific contact from user
//add identified number to xml file
// filter out the monitor from conversation screen
public class monitorstat{
    private static final monitorstat ourInstance = new monitorstat();
    private static final String TAG = monitorstat.class.getSimpleName();

    public static monitorstat getInstance() {
        return ourInstance;
    }

    MessageDetailsActivity messageDetailsActivity;
    public enum Event {
        SENDMESSAGE,
        RECEIVEMESSAGE;
    }

    public static void logfile(Event event, String s) {
//        Log.i(TAG, "this is log method");
        String filename = "myfile";
        try {
            File f = new File(filename);
            String path;
            path = f.getAbsolutePath();

//            Log.i(TAG, "filepath is" + path);
        }catch(Exception e){
            e.printStackTrace();
        }

        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        Log.i(TAG, "this is current time:"+ timestamp);
        String timestampstring = sdf.format(new Date());
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));

        String wholecontent = timestampstring + "," + event + "," + s;

        //String fileContents = "Hello world! ";
        FileOutputStream outputStream;

        try {
            outputStream = getApplicationContext().openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(wholecontent.getBytes());

            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Monitorreadfile monitorreadfile = new Monitorreadfile();
    }



}