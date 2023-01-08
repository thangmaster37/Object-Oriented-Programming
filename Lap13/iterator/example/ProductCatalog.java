package iterator.example;

public class ProductCatalog implements Iterable
{
    private String[] products = {"Tomato", "Orange", "Apple", "JackFruit"};

    public Iterator getIterator(){
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator{
        private int position = 0;
        public boolean hasNext(){
            if (position >= products.length || products[position] == null){
                return false;
            }
            return true;
        }

        public Object next(){
            if (this.hasNext()){
                return products[position++];
            }
            return null;
        }
    }
}
