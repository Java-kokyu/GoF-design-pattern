package org.gof.behavioral.template;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String title = "디자인 패턴: Template";
        String writer = "mindy";
        LocalDateTime createAt = LocalDateTime.now();
        LocalDateTime updateAt = LocalDateTime.now();
        ArrayList<String> contents = new ArrayList<>();
        contents.add("템플릿 패턴(Template Pattern)은 디자인 패턴의 한 종류로, 알고리즘의 구조를 메서드에 정의하고, 일부 단계를 서브클래스에서 구현할 수 있도록 하여 전체 구조를 변경하지 않고 특정 단계를 재정의할 수 있게 합니다. ");
        contents.add("이 패턴은 행동 패턴(Behavioral Pattern)에 속하며, 코드의 재사용성과 유연성을 높이는 데 도움을 줍니다.");
        contents.add("템플릿 패턴은 주로 두 부분으로 구성됩니다:");
        contents.add("1. 추상 기본 클래스(Abstract Base Class): ");
        contents.add("이 클래스에서는 알고리즘의 템플릿, 즉 알고리즘의 골격을 정의합니다. 이 골격은 여러 단계로 이루어진 일련의 메서드 호출로 구성되며, 이 중 일부는 추상 메서드로 선언되어 있어서 서브클래스에서 반드시 구현해야 합니다.");
        contents.add("2. 구체적인 클래스(Concrete Class):  ");
        contents.add("추상 기본 클래스를 상속받아 추상 메서드를 구현합니다. 이 구현을 통해 알고리즘의 특정 단계를 실제로 수행하는 방법을 정의합니다.");
        contents.add("템플릿 패턴의 핵심은 알고리즘의 구조를 변경하지 않으면서 알고리즘을 구성하는 특정 단계를 쉽게 변경하거나 확장할 수 있도록 하는 것입니다. ");
        String footer = "https://mindybughunter.com";

        Article article = new Article(title, writer, createAt, updateAt, contents, footer);

        System.out.println("[CASE1]");
        SimpleDisplayArticle simpleDisplayArticle = new SimpleDisplayArticle(article);
        simpleDisplayArticle.display();

        System.out.println("[CASE2]");
        CaptionDisplayArticle captionDisplayArticle = new CaptionDisplayArticle(article);
        captionDisplayArticle.display();
    }
}
