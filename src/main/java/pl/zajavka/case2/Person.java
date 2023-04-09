package pl.zajavka.case2;

import java.math.BigDecimal;

<<<<<<< Updated upstream
record Person(String name, Long age, BigDecimal salary) {

    public Boolean doYouHaveABike() {
        return true;
=======
record Person(String name, BigDecimal salary) {

    public BigDecimal howMuchDoYouEarn() {
        return salary;
>>>>>>> Stashed changes
    }

    public Boolean doYouLikePizza() {
        return true;
    }
}
