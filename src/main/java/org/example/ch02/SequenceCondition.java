package org.example.ch02;

import javax.sound.midi.Sequence;
import java.time.Duration;

public class SequenceCondition extends DiscountCondition{

    boolean isSatisfied(Screening screening, int sequence ){
        if(screening.withinTheSequence(sequence)) return true;
        else return false;
    }
}
