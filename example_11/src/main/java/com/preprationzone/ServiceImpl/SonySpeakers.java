package com.preprationzone.ServiceImpl;

import com.preprationzone.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {

    public String makeSound() {
        return "Playing music with Sony speakers";
    }

}
