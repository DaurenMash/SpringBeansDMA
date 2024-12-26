package app.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animal;

    @Getter
    private final Timer timer;

    public AnimalsCage(@Qualifier("catBean") Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

}
