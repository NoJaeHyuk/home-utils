package com.jh.homeutils.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jaehy
 *
 * 서비스 헬시 체크를 위한 컨트롤러
 */
@RestController
public class HealthCheckController {

    @GetMapping("/api/ping")
    public String ping() {
        return "ok";
    }

}
