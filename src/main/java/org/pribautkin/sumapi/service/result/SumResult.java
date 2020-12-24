package org.pribautkin.sumapi.service.result;

public class SumResult  {

    public SumResult() {

    }

    public SumResult(Float result) {
        this.result = result;
    }

    private Float result;

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }
}
