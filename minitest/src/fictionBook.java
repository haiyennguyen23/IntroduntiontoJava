public class fictionBook extends Book{

    private String category;

    fictionBook(){
    }

   fictionBook(int bookCode, String name, int price, String author, String category){
        super(bookCode, name, price,author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}