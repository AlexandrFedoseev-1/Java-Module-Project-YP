public class Product {
    String listOfProduct="Добавленные товары:\n";

    public void addProduct(String listOfProduct, double price){
        Formatter formatter = new Formatter();
        this.listOfProduct+=String.format("%s %.2f %s\n",listOfProduct,price,formatter.formatterRub(price));
    }
    public void showList(){
        System.out.println(listOfProduct);
    }
}
