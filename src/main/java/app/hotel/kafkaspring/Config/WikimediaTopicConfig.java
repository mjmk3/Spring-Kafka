package app.hotel.kafkaspring.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.*;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author MJ Makki
 * @version 1.0
 * @license SkyLimits, LLC (<a href="https://www.skylimits.tech">SkyLimits, LLC</a>)
 * @email m.makki@skylimits.tech
 * @since long time ago
 */

@Configuration
public class WikimediaTopicConfig {

    @Bean
    public NewTopic wikimediaStreamTopic() {
        return TopicBuilder
                .name("wikimedia-stream")
                .build();
    }
}
