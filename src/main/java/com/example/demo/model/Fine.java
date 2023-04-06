package com.example.demo.model;

import java.util.Objects;

public class Fine {
    private double fineBalance;
    private String reason;
    private int daysLate;
    private boolean blackListed;

    public Fine() {
    }

    public Fine(double fineBalance, String reason, int daysLate, boolean blackListed) {
        this.fineBalance = fineBalance;
        this.reason = reason;
        this.daysLate = daysLate;
        this.blackListed = blackListed;
    }

    public double getFineBalance() {
        return fineBalance;
    }

    public void setFineBalance(double fineBalance) {
        this.fineBalance = fineBalance;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }

    public boolean isBlackListed() {
        return blackListed;
    }

    public void setBlackListed(boolean blackListed) {
        this.blackListed = blackListed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fine fine = (Fine) o;
        return Double.compare(fine.fineBalance, fineBalance) == 0 && daysLate == fine.daysLate && blackListed == fine.blackListed && Objects.equals(reason, fine.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fineBalance, reason, daysLate, blackListed);
    }

    @Override
    public String toString() {
        return "Fine{" +
                "fineBalance=" + fineBalance +
                ", reason='" + reason + '\'' +
                ", daysLate=" + daysLate +
                ", blackListed=" + blackListed +
                '}';
    }

    public double calculateFine(double fineBalance) {
        fineBalance += daysLate * 0.25;
        return fineBalance;
    }
}

