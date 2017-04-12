package hellothings.wadael.org.gianathings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.androidthings.weatherstation.BoardDefaults;
import com.google.android.things.contrib.driver.ht16k33.AlphanumericDisplay;
import com.google.android.things.pio.PeripheralManagerService;
import com.google.android.things.pio.Pwm;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;


/**
 * Will display a message then play music.
 * <p>
 * This code is mostly a copy of the code shown during the AndroidThigs event
 */
public class LonelyActivity extends AppCompatActivity {

    private static final String TAG = LonelyActivity.class.getSimpleName();


    // Default LED brightness
    private static final int LEDSTRIP_BRIGHTNESS = 1;
    public static final int LED_BRIGHTNESS = 2;

    private AlphanumericDisplay mDisplay;

    // private Apa102 mLedStrip ;
    // private Bmx280SensorDriver mEnvSensor ;
    // private SensorManager mSensorManager ;
    // private ButtonInputDriver mButtonInputDriver;

    Pwm pwm = null;
    int MESSAGE_DISPLAY_COUNT = 1 ;
    String MESSAGE_TO_DISPLAY = "ITS A ME MARIO  "; // make length a multiple of 4
    char[] mMessage;

    private PeripheralManagerService service = new PeripheralManagerService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lonely);
        Log.d(TAG, "Music player started");

        mMessage = new char[MESSAGE_TO_DISPLAY.length()];
        for (int t = 0; t < MESSAGE_TO_DISPLAY.length(); t++) {
            mMessage[t] = MESSAGE_TO_DISPLAY.charAt(t);
        }

        try {
            mDisplay = new AlphanumericDisplay(BoardDefaults.getI2cBus());
            mDisplay.setEnabled(true);
            mDisplay.setBrightness(2);

            // looping to display the chars of the message 4 by 4
            // why not substring ? I dont know. Memory of 8-bits times maybe.

            for (int a = 0; a < MESSAGE_DISPLAY_COUNT; a++) {
                for (int z = 0; z < mMessage.length / 4; z++) {
                    int s = z * 4;
                    char[] tab = Arrays.copyOfRange(mMessage, s, s + 4);
                    mDisplay.display(new String(tab));
                    try {
                        Thread.sleep(700); // This is purely a personnal choice.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            mDisplay.display("    "); // clear display
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        try {
            pwm = service.openPwm( "PWM1" );
            pwm.setPwmDutyCycle(50.0);
            pwm.setEnabled(true);

            for(int cpt=0; cpt < 3 ; cpt++){
                mDisplay.display("T1");
                playMusic(pwm, Tunes.main_theme_melody, Tunes.main_theme_tempo);
                Thread.sleep(2000);

                // Song 2
                mDisplay.display("T2");
                playMusic(pwm, Tunes.underworld_melody, Tunes.underworld_tempo);
                Thread.sleep(2000);
            }
            pwm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            mDisplay.display("BYE");
            Thread.sleep(2000);
            mDisplay.display("    ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playMusic(Pwm pwm, int[] main_theme_melody, int[] main_theme_tempo) {
        try {
            for (int i = 0; i < main_theme_melody.length; i++) {

                if(main_theme_melody[i] >0) {
                Log.d(TAG,"playing note #"+i + " " + main_theme_melody[i] + " for " + main_theme_tempo[i] );

                    // Play a note
                    pwm.setEnabled(true);
                    pwm.setPwmFrequencyHz(main_theme_melody[i]);
                }
                else
                    Log.d(TAG,"NOT playing note #"+i + " " + main_theme_melody[i] + " for " + main_theme_tempo[i] );

                // Wait
                Thread.sleep(main_theme_tempo[i] * 10);

                // Stop playing the note
                pwm.setEnabled(false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        try {
            pwm.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            mDisplay.clear();
            mDisplay.setEnabled(false);
            mDisplay.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
