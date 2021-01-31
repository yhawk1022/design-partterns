package org.yan.practice.patterns.behavioral.mymonitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author pangyan
 * @date 2021/1/31 21:21
 * @description
 */
public class EventManager implements Monitor{
    private Map<String, List<Consumer>> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
        this.listeners.put("count", new ArrayList<>());
        this.listeners.put("say", new ArrayList<>());
    }


    public void addListener(String behavior, Consumer consumer){
        List<Consumer> consumers = this.listeners.get(behavior);
        if (consumer!=null){
            consumers.add(consumer);
        }
    }

    public void deleteListener(String behavior, Consumer consumer){
        List<Consumer> consumers = this.listeners.get(behavior);
        if (consumer!=null){
            consumers.remove(consumer);
        }
    }

    private void notify(String behavior, Object obj){
        List<Consumer> consumers = this.listeners.get(behavior);
        if (consumers!=null){
            consumers.forEach(consumer -> consumer.accept(obj));
        }
    }

    @Override
    public void count(int count) {
        notify("count", count);
    }

    @Override
    public void say(String sentence) {
        notify("say", sentence);
    }
}
