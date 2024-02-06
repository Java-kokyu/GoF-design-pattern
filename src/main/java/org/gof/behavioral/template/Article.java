package org.gof.behavioral.template;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Article {
    private String title;
    private String writer;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private ArrayList<String> contents;
    private String footer;

    public Article(String title, String writer, LocalDateTime createAt, LocalDateTime updateAt, ArrayList<String> contents, String footer) {
        this.title = title;
        this.writer = writer;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.contents = contents;
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public String getFooter() {
        return footer;
    }
}
