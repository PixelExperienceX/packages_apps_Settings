
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getPixelExperienceXVersion(){
        return SystemProperties.get("org.pixelexperiencex.version.display","");
    }
}
