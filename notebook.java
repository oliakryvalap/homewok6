//Подумать над структурой класса Ноутбук для магазина техники -
 //выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий
 //(или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев -
 //сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести 
//проходящие по условиям.
import java.util.HashSet;
import java.util.Set;

public class notebook<Notebook> {
    private String brand;
    private double price;
    private int memory;
    private String processor;
    private String graphicsCard;
 public void Notebook (String brand, double price, int memory, String processor,String graphicsCard){
    this.brand = brand;
    this.price = price;
    this. memory = memory;
    this.processor = processor;
    this. graphicsCard = graphicsCard;
     }  
     public String getBrand(){
        return brand;
     } 
     public void setBrand(String brand){
        this.brand = brand;
     }
      public double getPrice(){
        return price;
      }
      public void setPrice(double price){
        this.price = price;
}
public int getMemory(){
        return memory;
      }
      public void setMemory(int memory){
        this.memory = memory;
      }
      public String getProcessor(){
        return processor;
      }
      public void setProcessor(String processor){
        this.processor = processor;
      }
      public String getGraphicsCard(){
        return graphicsCard;
      }
      public void setGraphicsCard(String graphicsCard){
        this.graphicsCard = graphicsCard;
      }
      public String toString(){
        return "notebook{"+"brand="+brand+", price="+price+", memory="+memory+", processor="+processor+", graphicsCard="+graphicsCard+""+"};";
      }
      public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;
        notebook notebook = (notebook)o;
        return Double.compare(notebook.price,price) == 0 && memory == notebook.memory && Object.equals(brand)&&
        Object.equals(processor)&& Object.equals(graphicsCard, notebook.graphicsCard);
      }
      public int hashcCode(){
        return Object.hash(brand, price, memory, processor, graphicsCard);
      }
      Set notebookSet = new HashSet();
      
      notebookSet.add(new Notebook("Asus", 35000.0,7, "Intel Core i5", "Invida GeForse MX130"));
      notebookSet.add(new Notebook("Sumsung", 75000.0,16, "Intel Pentium", "Intel HD Graphics 610"));
      notebookSet.add(new Notebook("Acer", 55000.0,6, "Intel Core i6", "Invida GeForse MX1650"));
      notebookSet.add(new Notebook("HP", 75000.0,32, "Intel Core i9", "AMD Radeon Pro 5500M"));

        for (notebook notebook: notebookSet){
        System.out.println(notebook);
      }
      Notebook notebook1 = new notebook("Asus", 35000.0,7, "Intel Core i5", "Invida GeForse MX130");
      Notebook notebook2 = new notebook("Asus", 35000.0,7, "Intel Core i5", "Invida GeForse MX130");
        System.out.println(notebook1.equals(notebook2));
       
    Notebook notebook3 = new Notebook("Asus", 55000.0,8, "Intel Core i5", "Invida GeForse MX130");
    if (notebookSet.contains(notebook3)){
        System.out.println("Notebook found: "+ notebook3);
    } else{
        System.out.println("Notebook not found");
    }
    }
    
    

