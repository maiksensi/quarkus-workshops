// tag::adocApplicationLifeCycle[]
package io.quarkus.workshop.superheroes.villain;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class VillainApplicationLifeCycle {

    private static final Logger LOGGER = Logger.getLogger(VillainApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
