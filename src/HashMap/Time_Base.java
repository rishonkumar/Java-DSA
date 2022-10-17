package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/time-based-key-value-store/
public class Time_Base {

    class TimeMap {
        HashMap<String, List<Data>> map;
        public TimeMap() {
            map = new HashMap<>();
        }
        public void set(String key, String value, int timestamp) {
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(new Data(value,timestamp));
        }

        public String get(String key, int timestamp) {

            if(!map.containsKey(key)) return "";
            List<Data>data = map.get(key);
            return findClosestValue(data,timestamp);
        }
        //binary search
        private String findClosestValue(List<Data>data, int timeStamp) {
            int l = 0, r = data.size()-1;
            while(l < r) {
                int m = (l+r+1)/2;
                if(data.get(m).timeStamp <= timeStamp) l = m;
                else r = m - 1;
            }
            Data closestData = data.get(l);
            return closestData.timeStamp > timeStamp ? "" : closestData.value;
        }
    }

    class Data {
        String value;
        int timeStamp;
        public Data (String value, int timeStamp) {
            this.value = value;
            this.timeStamp = timeStamp;
        }
    }
}
