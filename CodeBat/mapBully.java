//Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
// and set the key "a" to have the value "". Basically "b" is a bully,
// taking the value and replacing it with the empty string.
//
//        mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//        mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

public Map<String, String> mapBully(Map<String, String> map) {
    if (map.containsKey("a")){            //checking to see if the key 'a' is in the map
        map.put("b", map.get("a"));     //the key 'b' gets the same value as a using the put method
        map.put("a", "");               //didnt use remove a since we wanted to keep the key
    }

    return map;
}