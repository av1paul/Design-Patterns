package org.avi.bridgePattern;

public class Dog extends LivingOrg{
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }
    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
