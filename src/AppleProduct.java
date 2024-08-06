public class AppleProduct {

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return " AppleProduct - " +
                " Product - " + product;
    }
}
