package dsa.Admin_Panel;

public class DijkstrasPair implements Comparable<DijkstrasPair>{
        String stationName;
        String psf; //psf : path so far
        int cost;
    
        @Override
        public int compareTo(DijkstrasPair dp){
            return dp.cost - this.cost;
        }
    }
    

    

