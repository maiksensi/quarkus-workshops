// tag::adocBean[]
package io.quarkus.workshop.superheroes.fight.client;

// end::adocBean[]
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.validation.constraints.NotNull;

// tag::adocBean[]
@Schema(description="The villain fighting against the hero")
public class Villain {

    @NotNull
    public String name;
    @NotNull
    public int level;
    @NotNull
    public String picture;
    public String powers;

    // Getters and setters

    // tag::adocSkip[]
    @Override
    public String toString() {
        return "Villain{" +
            "name='" + name + '\'' +
            ", level=" + level +
            ", picture='" + picture + '\'' +
            ", powers='" + powers + '\'' +
            '}';
    }
    // end::adocSkip[]
}
// end::adocBean[]
