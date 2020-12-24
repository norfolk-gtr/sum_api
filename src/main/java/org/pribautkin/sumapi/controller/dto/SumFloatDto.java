package org.pribautkin.sumapi.controller.dto;


import javax.validation.constraints.NotNull;

public class SumFloatDto {

    public SumFloatDto() {
    }

    public SumFloatDto(@NotNull Float firstNum, @NotNull Float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @NotNull
    private Float firstNum;

    @NotNull
    private Float secondNum;

    public Float getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Float firstNum) {
        this.firstNum = firstNum;
    }

    public Float getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Float secondNum) {
        this.secondNum = secondNum;
    }
}
