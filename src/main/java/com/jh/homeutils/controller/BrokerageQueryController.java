package com.jh.homeutils.controller;

import com.jh.homeutils.constants.ActionType;
import com.jh.homeutils.policy.BrokeragePolicy;
import com.jh.homeutils.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType, @RequestParam Long price) {
        // 함수 정리 전
        /*
        if (actionType == ActionType.PURCHASE) {
            PurchaseBrokeragePolicy policy = new PurchaseBrokeragePolicy();
            return policy.calculate(price);
        }
        if (actionType == ActionType.RENT) {
            RentBrokeragePolicy policy = new RentBrokeragePolicy();
            return policy.calculate(price);
        }
        return null;
        */

        // 함수 정리 후
        BrokeragePolicy policy = BrokeragePolicyFactory.of(actionType);
        return policy.calculate(price);
    }
}
