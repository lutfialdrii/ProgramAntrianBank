package PriorityQueueLinkedList;
import java.util.Scanner;

public class bank{
    int id;
    String nama,perlu;
    bank next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);

    public void input(){
        System.out.print("Masukkan nama      : ");
        nama=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println(nama);
    }
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=4){
            System.out.println("1.Antri\n2.Antrian Selesai\n3.Lihat Antrian\n4.Prioritas \n5.Keluar Program ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else if(menu==4)que.priority();
            else if(menu==5)System.out.println("- keluar -");
            else System.out.println("- Salah -");
            System.out.println("");
        }
    }
}

class linked{
    bank head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        bank baru=new bank();
        baru.input();
        if(head==null){
            head=baru;
        }
        else {
            tail.next=baru;
        }
        tail=baru;
    }
    public void deque(){
        if(head==null){
            System.out.println("- Kosong -");
        }
        else{
            head=head.next;
        }
    }
    public void view(){
        if(head==null){
            System.out.println("- Kosong -");
        }
        else{
            for(bank a=head; a!=null; a=a.next) a.read();
        }
    }
    public void priority(){
        bank baru=new bank();
        baru.input();
        if(head==null){
            head=baru;
        }
        else {
            head=baru;
        }
        head.next = tail;
    }
}
