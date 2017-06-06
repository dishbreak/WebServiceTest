package com.dishbreak.background;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by vishal on 6/6/17.
 */
public class BackgroundTask {
    private final Map<String, Integer> data = new HashMap<>();
    private final TimerTask task = new TimerTask() {

        @Override
        public void run() {
            System.out.println("Running task.");
            for (String key : data.keySet()) {
                data.put(key, data.get(key) + 1);
            }
        }
    };

    private final Timer timer = new Timer();

    public BackgroundTask() {
        data.put("David", 20);
        data.put("Jordan", 17);
        data.put("Vishal", 12);

    }

    public Map<String, Integer> getData() {
        return data;
    }

    public void start() {
        System.out.println("Stopping task.");
        timer.schedule(task, 0, 1500);
    }

    public void stop() {
        timer.cancel();
    }


}
