package io.pivotal.pace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@EnableDiscoveryClient
@RestController
@RefreshScope
public class SBController {

    private static final Logger LOG = LoggerFactory.getLogger(SBController.class);

    private GreetingRepository greetingRepository;

    @Value("${greetingLanguage}")
    private String language;

    public SBController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @RequestMapping("/")
    public String greetingLanguage() {
        LOG.debug("CND root request");
        return "Greeting language is " + language;
    }

    @RequestMapping("/greeting")
    public String greeting() {
        LOG.debug("CND greeting request");
        List<Greeting> greeting = greetingRepository.findByLanguage(language);
        if (greeting.isEmpty())
            return "Greeting not found for " + language;
        else
            return greeting.get(0).getText();
    }

    @RequestMapping("/language")
    public String language() {
        return language;
    }
}
