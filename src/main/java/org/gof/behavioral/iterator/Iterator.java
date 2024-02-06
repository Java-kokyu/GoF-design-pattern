package org.gof.behavioral.iterator;

public interface Iterator {
    // Aggregator의 다음 구성 메서드를 가져온다
    boolean next();
    // 구성 데이터를 반환한다
    Object current();
}
