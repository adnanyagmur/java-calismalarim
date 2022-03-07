public class Main {

    public static void main(String[] args) {
	ProductManager manager = new ProductManager();
    Product product = new Product();
    //product.price = 600;
    //product.id = 26;
    product.name = "Kulaklık";
    manager.add(product);

    //DatabaseHelper.Connettion.createConnettion();  önerilmiyor pek
    }
}
