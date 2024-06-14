package com.co.datacenter.tasks.delayimplementstask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DelayimplementsTask implements Task {

    private final long milliseconds;

    public DelayimplementsTask(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static DelayimplementsTask ofMilliseconds(long milliseconds) {
        return instrumented(DelayimplementsTask.class, milliseconds);
    }
}