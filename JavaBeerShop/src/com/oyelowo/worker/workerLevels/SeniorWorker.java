package com.oyelowo.worker.workerLevels;

import com.oyelowo.worker.Worker;

public class SeniorWorker extends Worker {
    public SeniorWorker() {
    }

    public SeniorWorker(Double balance) {
        super(balance);
        System.out.println("I am Senior");
    }

    public SeniorWorker(String name, String team, Integer payLevel, Double balance) {
        super(name, team, payLevel, balance);
    }
}
