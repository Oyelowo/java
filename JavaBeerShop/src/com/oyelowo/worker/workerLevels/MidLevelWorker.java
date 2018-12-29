package com.oyelowo.worker.workerLevels;

import com.oyelowo.worker.Worker;

public class MidLevelWorker extends Worker {
    public MidLevelWorker() {
    }

    public MidLevelWorker(Double balance) {
        super(balance);
    }

    public MidLevelWorker(String name, String team, Integer payLevel, Double balance) {
        super(name, team, payLevel, balance);
    }
}
