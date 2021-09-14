import libs.*;

public class Main{
  public static void main(String args[]){
    System.out.println("hello there how are you");


    LinkedList linkedList = new LinkedList(new Nodes(0));

    linkedList.addNode(new Nodes(1));
    linkedList.addNode(new Nodes(2));
    linkedList.addNode(new Nodes(3));
    linkedList.addNode(new Nodes(4));


    linkedList.listNodes();



  }
}
