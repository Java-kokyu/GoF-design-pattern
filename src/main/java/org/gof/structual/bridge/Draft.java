package org.gof.structual.bridge;

public class Draft {
    private String title;
    private String author;
    private String[] contents;

    public Draft(String title, String author, String[] contents) {
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getContents() {
        return contents;
    }

    public void print(Display display) {
        display.title(this);
        display.author(this);
        display.contents(this);
    }
}
