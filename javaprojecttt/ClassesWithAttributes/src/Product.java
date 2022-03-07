public class Product {

    public Product() {  // paranteze aşağıdakilerden verirsek mainda get ve set edebilriz
        System.out.println("Yapıcı blok çalıştı");
    }
    // attribute || field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    //getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id = id;      // this.id=id; de yapabilirdik yukarda _ leri kaldırmak gerekir ama
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
