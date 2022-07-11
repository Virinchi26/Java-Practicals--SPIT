import java.util.*;
interface rankT{ String[] rank();}
interface suitT{ String[] suit();}
class cardT implements rankT,suitT{
     public String[] rank(){
         String[] r = {"A","2","3", "4", "5", "6", "7", "8", "9", "10", "J","Q","K"};
         return r;
     }
    public String[] suit(){
        String[] s = {"C","D","H","S"};
        return s;
    }
    String[][] newCard(String[] a ,String[] b ){
         String[][] c = new String[4][13];
        for(int i =0;i<4;i++){
            for(int j =0;j<13;j++){
             c[i][j]=a[j]+b[i];
            }
        }
     return c;
    }
}
class printCard extends cardT{
    void shuffle_card(String[][] d){
        List<String> list1 = new ArrayList<>();
        for(int i =0;i<4;i++){
            for(int j =0;j<13;j++){
                list1.add(d[i][j]);
            }
        }
        Collections.shuffle(list1);
        for(int i =0;i<52;i++){
                System.out.print(list1.get(i)+"\t");
                if(i>=12 && (i+1)%13==0 && i!=51){
                    System.out.print("\n");
                }
        }
    }
}
public class card {
    public static void main(String[] args) {
       printCard p = new printCard();
       p.shuffle_card(p.newCard(p.rank(),p.suit()));
    }
}