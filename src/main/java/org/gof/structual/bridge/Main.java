package org.gof.structual.bridge;

public class Main {
    public static void main(String[] args) {
        String title = "리펙토링 2판";
        String author = "마틴 파울러";
        String[] contents = {
                "이해할 수 없는 코드는 알 수 없는 악취가 난다.",
                "악취의 제거의 시작은 코드를 리펙토링 하고",
                "테스트를 작성하는 것부터 시작한다."
        };
        Draft draft = new Draft(title, author, contents);

        Display display1 = new SimpleDisplay();
        draft.print(display1);

        System.out.println("--------------------------------------");

        Display display2 = new CaptionDisplay();
        draft.print(display2);

        System.out.println("--------------------------------------");

        String publisher = "MIN.D";
        int price = 35000;
        Publication publication = new Publication(title, author, contents, publisher, price);
        publication.print(display1);

        System.out.println("--------------------------------------");

        publication.print(display2);
    }
}
