import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class hashmapexample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insert key-value pairs
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        System.out.println("Initial map: " + map);

        // Update value for a key
        map.put("USA", 35);
        System.out.println("Updated map: " + map);

        //Contains key
        if(map.containsKey("India")){
            System.out.println("Map contains key India");
        }  
        else{
            System.out.println("Map does not contain key India");
        } 

        //get value
        int population = map.get("China");
        System.out.println("Population of China: " + population);
    //If not present , it returns null

    Integer pop = map.get("UK");
    if(pop == null){
        System.out.println("UK not found in map");
    }
    else{
        System.out.println("Population of UK: " + pop);
    }

int arr[] = {1,2,3,4,5};
       for(int i : arr){
           System.out.print(i + " ");
       }

         
         System.out.println();
    
       for(Map.Entry<String,Integer> entry : map.entrySet()){
           System.out.println(entry.getKey() + " " + entry.getValue());
    }   
//key set
Set<String> keys = map.keySet();
System.out.println("Keys: " + keys);

//Remove
map.remove("India");
System.out.println("After removing India: " + map);

}

}


/*
Output:

Initial map: {USA=30, China=150, India=120}
Updated map: {USA=35, China=150, India=120}
Map contains key India
Population of China: 150
UK not found in map
1 2 3 4 5 
USA 35
China 150
India 120
Keys: [USA, China, India]
After removing India: {USA=35, China=150}

*/