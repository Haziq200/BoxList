package sg.edu.rp.dmsd.boxlist;

/**
 * Created by 17010603 on 24/7/2018.
 */

public class ImageColour {
    private String blank;
    private String blank2;
    private boolean isColourBlue;
    private boolean isColourBrown;
   private boolean isColourOrange;


    public ImageColour(String blank, String blank2, boolean isColourBlue, boolean isColourBrown, boolean isColourOrange) {
        this.blank = blank;
        this.blank2 = blank2;
        this.isColourBlue = isColourBlue;
        this.isColourBrown = isColourBrown;
        this.isColourOrange = isColourOrange;
    }

    public String getBlank() {
        return blank;
    }

    public void setBlank(String blank) {
        this.blank = blank;
    }

    public String getBlank2() {
        return blank2;
    }

    public void setBlank2(String blank2) {
        this.blank2 = blank2;
    }

    public boolean isColourBlue() {
        return isColourBlue;
    }

    public void setColourBlue(boolean colourBlue) {
        isColourBlue = colourBlue;
    }

    public boolean isColourBrown() {
        return isColourBrown;
    }

    public void setColourBrown(boolean colourBrown) {
        isColourBrown = colourBrown;
    }

    public boolean isColourOrange() {
        return isColourOrange;
    }

    public void setColourOrange(boolean colourOrange) {
        isColourOrange = colourOrange;
    }

    @Override
    public String toString() {
        return "ImageColour{" +
                "blank='" + blank + '\'' +
                ", blank2='" + blank2 + '\'' +
                ", isColourBlue=" + isColourBlue +
                ", isColourBrown=" + isColourBrown +
                ", isColourOrange=" + isColourOrange +
                '}';
    }
}
