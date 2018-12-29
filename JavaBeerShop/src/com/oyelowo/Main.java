package com.oyelowo;

import com.oyelowo.company.Company;
import com.oyelowo.worker.Worker;
import com.oyelowo.worker.workerLevels.JuniorWorker;
import com.oyelowo.worker.workerLevels.MidLevelWorker;
import com.oyelowo.worker.workerLevels.SeniorWorker;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Company myCompany = new Company();
        System.out.println(myCompany.getName());
       Worker oyelowo = new JuniorWorker(989.9);
       Worker Dan = new JuniorWorker(987.8);
        Worker Shane = new MidLevelWorker(34.5);
        Worker Dolan = new SeniorWorker(4567.8);
        Worker Maria = new SeniorWorker(84.3);
        SeniorWorker Sam = new SeniorWorker();
        JuniorWorker jim = new JuniorWorker("Jim", "HJK", 1, 345.9);
        System.out.println(jim.getBalance());


        System.out.println(myCompany.getBalance() + " " +myCompany.getAuthorizationKey());



       myCompany.paySalary(1000.0, oyelowo);
       myCompany.paySalary(700.0, Dan);
        myCompany.paySalary(700.0, Dan);
        myCompany.paySalary(700.0, Dan);
        myCompany.paySalary(700.0, Dan);
        myCompany.paySalary(700.0, Dan);


        System.out.println();
       System.out.println(myCompany.getBalance());
        System.out.println(myCompany.getDebits());
       System.out.println(oyelowo.getBalance(myCompany));
       System.out.println(Dan.getBalance(myCompany));


    }
}
