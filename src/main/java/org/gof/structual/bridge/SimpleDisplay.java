package org.gof.structual.bridge;

public class SimpleDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println(draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println(draft.getAuthor());
    }

    @Override
    public void contents(Draft draft) {
        for (String content : draft.getContents()) {
            System.out.println(content);
        }
    }
}
