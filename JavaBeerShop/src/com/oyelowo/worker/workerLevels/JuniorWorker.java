package com.oyelowo.worker.workerLevels;

import com.oyelowo.company.Company;
import com.oyelowo.worker.Worker;

public class JuniorWorker extends Worker {
    private String myFav = "Running";


    public JuniorWorker() {
    }

    public JuniorWorker(Double balance) {
        super(balance);
    }

    public JuniorWorker(String name, String team, Integer payLevel, Double balance) {
        super(name, team, payLevel, balance);
    }

    public String getMyFav() {
        return myFav;
    }

}
