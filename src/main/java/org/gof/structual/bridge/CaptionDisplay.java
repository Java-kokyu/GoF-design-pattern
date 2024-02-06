package org.gof.structual.bridge;

public class CaptionDisplay implements Display{
    @Override
    public void title(Draft draft) {
        System.out.println("TITLE: " + draft.getTitle());
    }

    @Override
    public void author(Draft draft) {
        System.out.println("AUTHOR: " + draft.getAuthor());
    }

    @Override
    public void contents(Draft draft) {
        System.out.println("CONTENTS: ");
        for (String content : draft.getContents()) {
            System.out.println("    " + content);
        }
    }
}
