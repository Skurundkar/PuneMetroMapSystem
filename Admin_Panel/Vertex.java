package dsa.Admin_Panel;

import java.util.ArrayList;
import java.util.HashMap;


public class Vertex {
    
   // Each vertex has a hashmap of its adjacent vertices and the edge weights.
    public HashMap<String,Integer> adjVertex = new HashMap<>();

    public int numberOfVertices()
    {
        return Functionalities.stations.size();
    }

   // to check if the entered station is present in graph or not
   public boolean containsVertex(String stationName)
   {
    return Functionalities.stations.containsKey(stationName);
    }      

   
   // create new vertex obj and add the vertex to vertices list
    public void addVertex(String stationName)
    {
        Vertex v = new Vertex();
        Functionalities.stations.put(stationName,v); //value of node is stationName
    }

    public void removeVertex(String stationName){
        //getting node to delete
        Vertex vertexToRemove = Functionalities.stations.get(stationName);

        //storing adjacent nodes of the current node in order to delete them from there adjacent nodes 
        //as well
        ArrayList<String> keys = new ArrayList<>(vertexToRemove.adjVertex.keySet());


        //iterating through the adjacent nodes and deleting the current node from there
        for(String key : keys){
            Vertex nbrVertex = Functionalities.stations.get(key);
            nbrVertex.adjVertex.remove(stationName);
        }

        //removing the actaul node 
        Functionalities.stations.remove(stationName);

    }
}
