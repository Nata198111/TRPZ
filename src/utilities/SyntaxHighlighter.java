package src.utilities;


public class SyntaxHighlighter {
    private String theme;

    public void highlight(String language, String content) {
        System.out.println("Highlighting content for language: " + language);
    }

    public void setTheme(String theme) {
        this.theme = theme;
        System.out.println("Theme set to: " + theme);
    }

    public String getTheme() {
        return theme;
    }
}
