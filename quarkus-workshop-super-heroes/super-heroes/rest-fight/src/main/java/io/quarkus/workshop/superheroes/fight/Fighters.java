// tag::adocBean[]
package io.quarkus.workshop.superheroes.fight;

// end::adocBean[]
import io.quarkus.workshop.superheroes.fight.client.Hero;
import io.quarkus.workshop.superheroes.fight.client.Villain;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.validation.constraints.NotNull;

// tag::adocBean[]
@Schema(description="A fight between one hero and one villain")
public class Fighters {

    @NotNull
    public Hero hero;
    @NotNull
    public Villain villain;

    // Getters and setters

    // tag::adocSkip[]
    @Override
    public String toString() {
        return "Fighters{" +
            "hero=" + hero +
            ", villain=" + villain +
            '}';
    }
    // end::adocSkip[]
}
// end::adocBean[]
