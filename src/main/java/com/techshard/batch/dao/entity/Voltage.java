package com.techshard.batch.dao.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Voltage {

    @Id
    @Column (name = "ID", nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column (name = "volt", precision = 10, scale = 4, nullable = false)
    private BigDecimal volt;

    @NotNull
    @Column (name = "time", nullable = false)
    private double time;

    public Voltage() {
    }

    public Voltage(final BigDecimal volt, final double time) {
        this.volt = volt;
        this.time = time;
    }

    public long getId(){
        return id;
    }

    public BigDecimal getVolt(){
        return volt;
    }

    public void setVolt(final BigDecimal volt){
        this.volt = volt;
    }

    public double getTime(){
        return time;
    }

    public void setTime(final double time){
        this.time = time;
    }
}
