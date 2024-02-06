package org.gof.structual.bridge;

public class Publication extends Draft {
    private String publisher;
    private int price;


    public Publication(String title, String author, String[] contents, String publisher, int price) {
        super(title, author, contents);
        this.publisher = publisher;
        this.price = price;
    }

    private void printPublicationInfo() {
        System.out.println("#" + publisher + " $" + price);
    }

    public void print(Display display) {
        super.print(display);
        printPublicationInfo();
    }
}
