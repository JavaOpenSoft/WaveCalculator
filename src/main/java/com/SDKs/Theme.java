package com.SDKs;

public class Theme {
    public static String THEME_NAME;
    public static String ICON_THEME_DIRECTORY;
    public static String ICON_THEME_NAME;
    public static String WALLPAPER_DIRECTORY;
    public static String WALLPAPER_NAME;
    public static String FONT;
    public static String getThemeName() {
        String themeName = null;
        if(THEME_NAME.equals(""))
            themeName = "Default";
        else{
            themeName = THEME_NAME;
        }
        return themeName;
    }
    public static String getIconDirectory(){
        return ICON_THEME_DIRECTORY;
    }
    public static String getWallpaperDirectory(){
        String WallpaperDirectory = null;
        if(WALLPAPER_DIRECTORY.equals(""))WallpaperDirectory = "Default";
        else WallpaperDirectory = WALLPAPER_NAME;
        return WallpaperDirectory;
    }
    public static String getIconThemeName(){
        return ICON_THEME_NAME;
    }
    public static String getIconThemeDirectory() {
        return ICON_THEME_NAME;
    }
    public static String getFont(){
        String font;
        if (FONT.equals("")){font = "Default";}
        else font = FONT;
        return font;
    }
}
