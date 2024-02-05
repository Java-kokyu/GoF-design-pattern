package org.gof.template;

public abstract class DisplayArticleTemplate {
    protected Article article;

    public DisplayArticleTemplate(Article article) {
        this.article = article;
    }

    // 파생 클래스에서 메서드를 변경할 수 없도록 강제한다
    public final void display() {
        title();
        writer();
        createAt();
        updateAt();
        contents();
        footer();
    }

    protected abstract void title();
    protected abstract void writer();
    protected abstract void createAt();
    protected abstract void updateAt();
    protected abstract void contents();
    protected abstract void footer();
}
