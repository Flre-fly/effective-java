package org.example.ch02;

import javax.sound.midi.Sequence;
import java.time.Duration;

public class SequenceCondition extends DiscountCondition{

    private int sequence; // 순번
    boolean isSatisfied(Screening screening){
        return screening.isSequence(sequence);
    }
}
