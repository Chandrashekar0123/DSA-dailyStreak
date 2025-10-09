import java.util.HashSet;
import java.util.Iterator;

class hastsetexample {
public static void main(String args[]){
HashSet<Integer> set=new HashSet<>();

set.add(1);
set.add(2);
set.add(3);
set.add(1);

//Search
if(set.contains(1)){
System.out.println("Set contains 1");
}

if(!set.contains(4)){
System.out.println("Set does not contain 4");
}

//Delete
set.remove(1);
if(!set.contains(1)){
System.out.println("Set does not contain 1");
}

//Size
System.out.println("Size of set is: "+set.size());

//Iterate
System.out.println("Elements in set are: ");
//System.out.println(set);
for(int i:set){
System.out.println(i);
}

//Iterator
Iterator it = set.iterator();
System.out.println("Using Iterator:");
while(it.hasNext()){
System.out.println(it.next());
}

}
}  

/*
Output:
Set contains 1
Set does not contain 4
Set does not contain 1
Size of set is: 2
Elements in set are: 
2
3
Using Iterator:
2
3
*/