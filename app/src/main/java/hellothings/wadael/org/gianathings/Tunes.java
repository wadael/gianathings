package hellothings.wadael.org.gianathings;

/**
 * Created by jerome on 12/04/17.
 * Notes and tempos borrowed from  http://www.princetronics.com/supermariothemesong/
 */

public class Tunes {

    public static int NOTE_B0 = 31;
    public static int NOTE_C1 = 33;
    public static int NOTE_CS1 = 35;
    public static int NOTE_D1 = 37;
    public static int NOTE_DS1 = 39;
    public static int NOTE_E1 = 41;
    public static int NOTE_F1 = 44;
    public static int NOTE_FS1 = 46;
    public static int NOTE_G1 = 49;
    public static int NOTE_GS1 = 52;
    public static int NOTE_A1 = 55;
    public static int NOTE_AS1 = 58;
    public static int NOTE_B1 = 62;
    public static int NOTE_C2 = 65;
    public static int NOTE_CS2 = 69;
    public static int NOTE_D2 = 73;
    public static int NOTE_DS2 = 78;
    public static int NOTE_E2 = 82;
    public static int NOTE_F2 = 87;
    public static int NOTE_FS2 = 93;
    public static int NOTE_G2 = 98;
    public static int NOTE_GS2 = 104;
    public static int NOTE_A2 = 110;
    public static int NOTE_AS2 = 117;
    public static int NOTE_B2 = 123;
    public static int NOTE_C3 = 131;
    public static int NOTE_CS3 = 139;
    public static int NOTE_D3 = 147;
    public static int NOTE_DS3 = 156;
    public static int NOTE_E3 = 165;
    public static int NOTE_F3 = 175;
    public static int NOTE_FS3 = 185;
    public static int NOTE_G3 = 196;
    public static int NOTE_GS3 = 208;
    public static int NOTE_A3 = 220;
    public static int NOTE_AS3 = 233;
    public static int NOTE_B3 = 247;
    public static int NOTE_C4 = 262;
    public static int NOTE_CS4 = 277;
    public static int NOTE_D4 = 294;
    public static int NOTE_DS4 = 311;
    public static int NOTE_E4 = 330;
    public static int NOTE_F4 = 349;
    public static int NOTE_FS4 = 370;
    public static int NOTE_G4 = 392;
    public static int NOTE_GS4 = 415;
    public static int NOTE_A4 = 440;
    public static int NOTE_AS4 = 466;
    public static int NOTE_B4 = 494;
    public static int NOTE_C5 = 523;
    public static int NOTE_CS5 = 554;
    public static int NOTE_D5 = 587;
    public static int NOTE_DS5 = 622;
    public static int NOTE_E5 = 659;
    public static int NOTE_F5 = 698;
    public static int NOTE_FS5 = 740;
    public static int NOTE_G5 = 784;
    public static int NOTE_GS5 = 831;
    public static int NOTE_A5 = 880;
    public static int NOTE_AS5 = 932;
    public static int NOTE_B5 = 988;
    public static int NOTE_C6 = 1047;
    public static int NOTE_CS6 = 1109;
    public static int NOTE_D6 = 1175;
    public static int NOTE_DS6 = 1245;
    public static int NOTE_E6 = 1319;
    public static int NOTE_F6 = 1397;
    public static int NOTE_FS6 = 1480;
    public static int NOTE_G6 = 1568;
    public static int NOTE_GS6 = 1661;
    public static int NOTE_A6 = 1760;
    public static int NOTE_AS6 = 1865;
    public static int NOTE_B6 = 1976;
    public static int NOTE_C7 = 2093;
    public static int NOTE_CS7 = 2217;
    public static int NOTE_D7 = 2349;
    public static int NOTE_DS7 = 2489;
    public static int NOTE_E7 = 2637;
    public static int NOTE_F7 = 2794;
    public static int NOTE_FS7 = 2960;
    public static int NOTE_G7 = 3136;
    public static int NOTE_GS7 = 3322;
    public static int NOTE_A7 = 3520;
    public static int NOTE_AS7 = 3729;
    public static int NOTE_B7 = 3951;
    public static int NOTE_C8 = 4186;
    public static int NOTE_CS8 = 4435;
    public static int NOTE_D8 = 4699;
    public static int NOTE_DS8 = 4978;


    public static int main_theme_melody[] = {
            NOTE_E7, NOTE_E7, 0, NOTE_E7,
            0, NOTE_C7, NOTE_E7, 0,
            NOTE_G7, 0, 0, 0,
            NOTE_G6, 0, 0, 0,

            NOTE_C7, 0, 0, NOTE_G6,
            0, 0, NOTE_E6, 0,
            0, NOTE_A6, 0, NOTE_B6,
            0, NOTE_AS6, NOTE_A6, 0,

            NOTE_G6, NOTE_E7, NOTE_G7,
            NOTE_A7, 0, NOTE_F7, NOTE_G7,
            0, NOTE_E7, 0, NOTE_C7,
            NOTE_D7, NOTE_B6, 0, 0,

            NOTE_C7, 0, 0, NOTE_G6,
            0, 0, NOTE_E6, 0,
            0, NOTE_A6, 0, NOTE_B6,
            0, NOTE_AS6, NOTE_A6, 0,

            NOTE_G6, NOTE_E7, NOTE_G7,
            NOTE_A7, 0, NOTE_F7, NOTE_G7,
            0, NOTE_E7, 0, NOTE_C7,
            NOTE_D7, NOTE_B6, 0, 0
    };

    //Mario main theme main_theme_tempo
    public static int main_theme_tempo[] = {
            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,

            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,

            9, 9, 9,
            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,

            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,

            9, 9, 9,
            12, 12, 12, 12,
            12, 12, 12, 12,
            12, 12, 12, 12,
    };

    //Underworld main_theme_melody
    public static int underworld_melody[] = {
            NOTE_C4, NOTE_C5, NOTE_A3, NOTE_A4,
            NOTE_AS3, NOTE_AS4, 0,
            0,
            NOTE_C4, NOTE_C5, NOTE_A3, NOTE_A4,
            NOTE_AS3, NOTE_AS4, 0,
            0,
            NOTE_F3, NOTE_F4, NOTE_D3, NOTE_D4,
            NOTE_DS3, NOTE_DS4, 0,
            0,
            NOTE_F3, NOTE_F4, NOTE_D3, NOTE_D4,
            NOTE_DS3, NOTE_DS4, 0,
            0, NOTE_DS4, NOTE_CS4, NOTE_D4,
            NOTE_CS4, NOTE_DS4,
            NOTE_DS4, NOTE_GS3,
            NOTE_G3, NOTE_CS4,
            NOTE_C4, NOTE_FS4, NOTE_F4, NOTE_E3, NOTE_AS4, NOTE_A4,
            NOTE_GS4, NOTE_DS4, NOTE_B3,
            NOTE_AS3, NOTE_A3, NOTE_GS3,
            0, 0, 0
    };
    //Underwolrd main_theme_tempo
    public static int underworld_tempo[] = {
            12, 12, 12, 12,
            12, 12, 6,
            3,
            12, 12, 12, 12,
            12, 12, 6,
            3,
            12, 12, 12, 12,
            12, 12, 6,
            3,
            12, 12, 12, 12,
            12, 12, 6,
            6, 18, 18, 18,
            6, 6,
            6, 6,
            6, 6,
            18, 18, 18, 18, 18, 18,
            10, 10, 10,
            10, 10, 10,
            3, 3, 3
    };

}
