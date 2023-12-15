package org.avi.bridgePattern;

public abstract class LivingOrg {
    BreatheImplementor breatheImplementor;

    public LivingOrg(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breathe();
}
