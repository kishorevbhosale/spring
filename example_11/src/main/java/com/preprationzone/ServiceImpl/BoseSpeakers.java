package com.preprationzone.ServiceImpl;

import com.preprationzone.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public String makeSound() {
        return "Playing music with Bose speakers";
    }

}