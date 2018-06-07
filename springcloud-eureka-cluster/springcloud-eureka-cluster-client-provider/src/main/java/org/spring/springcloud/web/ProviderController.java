package org.spring.springcloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provider HelloWorld 案例
 * <p>
 * Created by bysocket on 06/22/17.
 */
@RestController
public class ProviderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping("/provider")
    public String provider() {

        return "Hello,Provider!";
    }


}