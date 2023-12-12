package com.jh.homeutils.policy;

import lombok.AllArgsConstructor;

/**
 * 가격이 특정 범위일 때 상한효율과 상한금액 가지는 클래스
 */
@AllArgsConstructor
public class BrokerageRule {

    private Double brokeragePercent;
    private Long limitAmount;

    public Long calcMaxBrokerage(Long price) {
        // 함수 정리 전
        /*
        if (limitAmount == null) {
            Double amount = Math.floor(brokeragePercent / 100 * price);
            return amount.longValue();
        }
        Double amount = Math.floor(brokeragePercent / 100 * price);
        return Math.min(amount.longValue(), limitAmount);
        */

        // 함수 정리 후
        // 중복 사용되는 부분 메서드로 분리
        // if절 들여쓰기 1단으로 정리
        if (limitAmount == null) {
            return multiplyPercent(price);
        }
        return Math.min(multiplyPercent(price), limitAmount);
    }

    private Long multiplyPercent(Long price) {
        // 코드 정리 전
        /*
        Double amount = Math.floor(brokeragePercent / 100 * price);
        return amount.longValue();
        */

        // 코드 정리 후
        return Double.valueOf(Math.floor(brokeragePercent / 100 * price)).longValue();
    }
}
