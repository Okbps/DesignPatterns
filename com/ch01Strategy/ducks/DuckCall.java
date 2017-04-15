package com.ch01Strategy.ducks;

import com.ch01Strategy.behaviors.MuteQuack;
import com.ch01Strategy.behaviors.QuackBehavior;

/**
 * Created by Aspire on 15.04.2017.
 */
public class DuckCall {
    private QuackBehavior quackBehavior = new MuteQuack();
}
