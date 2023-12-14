package com.jh.homeutils.policy;

import com.jh.homeutils.constants.ActionType;

/**
 * @author jaehy
 */
public class BrokeragePolicyFactory {
    public static BrokeragePolicy of(ActionType actionType){
        // switch문은 타입에 따른 다형객체를 만들때만 사용해라.!!
        switch (actionType) {
            case RENT:
                return new RentBrokeragePolicy();
            case PURCHASE:;
                return new PurchaseBrokeragePolicy();
            default:
                throw new IllegalArgumentException("타입이 존재하지 않습니다.");
        }
    }
}
