package com.jh.homeutils.policy;

public interface BrokeragePolicy {
    // 타입마다 구현부가 달라지는 부분은 인터페이스 추상메서드로 선언
    BrokerageRule createBrokerageRule(Long price);

    // 공통으로 사용되는 메서드를 인터페이스 default 메서드 기능으로 공통화처리
    // 추상클래스 대신 인터페이스 활용(권장방법)
    default Long calculate(Long price) {
        BrokerageRule rule = createBrokerageRule(price);
        return rule.calcMaxBrokerage(price);
    }
}
