import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.ArrayList;

class menu {
           String name;         
           int price;
           int itemNo;
           
public menu (String ItemName, int newPrice){
       name = ItemName;
       price = newPrice;

       }

}
class Order{
        int qty;
        menu product; 
        
        
 public Order(int Qty,menu Product){
         qty = Qty;
        product = Product;
        }
}
public class POSSystem {

    public static void main(String[] args) {
       Scanner items = new Scanner(System.in);
        
      
       System.out.println("***************Welcome to (coffe name)****************");
      
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("***************yyyy/MM/dd HH:mm:ss****************");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now)); 
   System.out.println();
   
       ArrayList<Order> orders = new ArrayList<Order>();
      
       
       menu product0  = new menu(" ",0);
       menu product1= new menu("choice1", 000 );
       menu product2= new menu("choice2",000);
       menu product3= new menu("choice3",000);
       menu product4= new menu("choice4",000);


      //MENU DESIGN
      System.out.println("**************M*A*I*N***M*E*N*U*******************");
      System.out.println("No#1: "+product1.name+" "+product1.price+"Php ");
      System.out.println("No#2: "+product2.name+" "+product2.price+"Php ");
      System.out.println("No#3: "+product3.name+" "+product3.price+"Php ");
      System.out.println("No#4: "+product4.name+" "+product4.price+"Php ");
       
    
       int itemNumber;
       boolean orderMore = true;
       while (orderMore == true){  
           
   System.out.println();    
   
   System.out.print("Please Enter your Order's number: ");
       itemNumber =  items.nextInt();
         
   if (itemNumber == 1){
   System.out.println(product1.name+" " +product1.price+"Php");
   }
   
   if (itemNumber == 2){
   System.out.println(product2.name+ " " + product2.price+"Php");
   }
   if (itemNumber == 3)  {
   System.out.println(product3.name+ " " + product3.price+"Php");
   } 
   if(itemNumber == 4){
   System.out.println(product4.name+" " + product4.price+"Php");
   }   
   else if (itemNumber >4){
   System.out.println("Invalid Item.");
   }
        //Total Computation
  
      
      
   System.out.println();
   System.out.print(" Qty: ");
  
     
   if (itemNumber == 1){
          orders.add(new Order(items.nextInt(),product1)); 
   }
   
   if (itemNumber == 2){
         orders.add(new Order(items.nextInt(),product2)) ;
   }
   if (itemNumber == 3)  {
        orders.add(new Order(items.nextInt(),product3)) ;
   } 
   if(itemNumber == 4){
        orders.add(new Order(items.nextInt(),product4)); 
   }
   
   System.out.println();
   System.out.print("Do you want order to more? Y/N: ");
      
   if (items.nextLine().equals("Y")){
   }
   else if(items.nextLine().equals("N")){
       orderMore = false; 
     }
     }
       
       //Receipt
       int total = 0;
     System.out.println("*****************************Receipt*********************************");
      System.out.println("Orders:"+"\t\t\t"+"Price: "+"\t\t\t"+"Qty: ");
     for (int i = 0; i<orders.size(); i++){
         Order order = orders.get(i);
         System.out.println(order.product.name +"\t\t\t"+ order.product.price +" Php"+"\t\t\t"+ order.qty );
         total = total+ (order.product.price*order.qty);
    
     }
      System.out.println("______________________________________________________________________");
     System.out.println("Total: "+total+" Php");
     
     System.out.println();
     System.out.println("***************Thank you for supporting our business!******************");
}
}