package main.com.salestax.tax;

public enum Taxtype {
	LOCAL(.10f),

	IMPORTED(.05f);

    private float rate;

    private Taxtype(float rate) {
        this.rate = rate;
    }

    public float getRate() {
        return rate;
    }

}
