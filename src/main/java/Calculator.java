public class Calculator {
    int numOfPeople;
    private double sumOfPrice;
    Calculator (int numOfPeople){
        this.numOfPeople=numOfPeople;
    }
    public void addProduct(double price) {
        this.sumOfPrice +=price;
    }
    public double splitCheck(){
        return sumOfPrice/numOfPeople;
    }
    public double getSumOfPrice(){
        return this.sumOfPrice;
    }
}
