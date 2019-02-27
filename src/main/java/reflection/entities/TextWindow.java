package reflection.entities;

import reflection.annotations.InvokedMethod;

public class TextWindow extends Window{
    private String text;
    private String textColor;

    public TextWindow(){

    }

    public TextWindow(int left, int right, int bottom, int top, String windowColor, String text, String textColor) {
        super(left, right, bottom, top, windowColor);
        this.text = text;
        this.textColor = textColor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    @InvokedMethod
    public static void displayStaticTextWindowAttributes(){
        System.out.println("STATIC WINDOW METHOD");
    }

    @InvokedMethod
    public void displayTextInstanceWindowAttributes(){
        System.out.println("Displaying text window attributes");
        System.out.println("\tCoordinates: ");
        System.out.println("\t\t-Top coordinate: " + super.getTop());
        System.out.println("\t\t-Left coordinate: " + super.getLeft());
        System.out.println("\t\t-Right coordinate: " + super.getRight());
        System.out.println("\t\t-Bottom coordinate: " + super.getBottom());
        System.out.println("\tWindow color: " + super.getWindowColor());
        System.out.println("\tText: " + text);
        System.out.println("\tText color: " + textColor);
    }

    public void displayTextWindow(){
        System.out.println("Text Window!!!!");
    }


    @Override
    public String toString() {
        return "TextWindow{" +
                "text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TextWindow that = (TextWindow) o;

        if (!text.equals(that.text)) return false;
        return textColor.equals(that.textColor);
    }

    @Override
    public int hashCode() {
        int result = text.hashCode();
        result = 31 * result + textColor.hashCode();
        return result;
    }
}
