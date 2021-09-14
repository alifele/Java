package libs;

public class LinkedList{

  public Nodes firstnode;
  public Nodes lastnode;

  public LinkedList(Nodes firstnode){
    this.firstnode = firstnode;
    this.lastnode = this.firstnode;
  }

  public void listNodes(){
    Nodes currentnode = firstnode;
    while (currentnode.next != null){
      System.out.println(currentnode.data);
      currentnode = currentnode.next;
    }
    System.out.println(currentnode.data);
  }

  public void addNode(Nodes node){
    this.lastnode.next = node;
    this.lastnode = node;
    this.lastnode.next = null;

  }


}
