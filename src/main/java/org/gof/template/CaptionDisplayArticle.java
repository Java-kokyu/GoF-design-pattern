package org.gof.template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate{
    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("TITLE: " + article.getTitle());
    }

    @Override
    protected void writer() {
        System.out.println("WRITER: " + article.getWriter());
    }

    @Override
    protected void createAt() {
        System.out.println("CREATE AT: " + article.getCreateAt());
    }

    @Override
    protected void updateAt() {
        System.out.println("UPDATE AT: " + article.getUpdateAt());
    }

    @Override
    protected void contents() {
        ArrayList<String> contents = article.getContents();
        for (String content : contents) {
            System.out.println("    " + content);
        }
    }

    @Override
    protected void footer() {
        System.out.println("FOOTER: " + article.getFooter());
    }
}
