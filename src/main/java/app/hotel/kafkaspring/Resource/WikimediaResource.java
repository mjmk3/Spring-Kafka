package app.hotel.kafkaspring.Resource;

import app.hotel.kafkaspring.Stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author MJ Makki
 * @version 1.0
 * @license SkyLimits, LLC (<a href="https://www.skylimits.tech">SkyLimits, LLC</a>)
 * @email m.makki@skylimits.tech
 * @since long time ago
 */

@RestController
@RequestMapping("/awikimedia")
@RequiredArgsConstructor
public class WikimediaResource {

    private final WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startPublishing() {
        streamConsumer.consumeStreamAndPublish();
    }
}
