package com.archcloudlabs;

public enum SuperResults {

    WINNER(10, 3.12),
    LOSER(-50, 4.21);

    int money;
    double percentage;

    private SuperResults(int money, double percentage) {
        this.money = money;
        this.percentage = percentage;
    }

    
}
