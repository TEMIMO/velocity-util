import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import java.util.*;

public class MapEntryConverter implements Converter {

    public boolean canConvert(Class clazz) {
        return AbstractMap.class.isAssignableFrom(clazz);
    }

    public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {

        AbstractMap map = (AbstractMap) value;
        for (Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            writer.startNode(entry.getKey().toString());
            Object val = entry.getValue();
            if ( null != val ) {
                writer.setValue(val.toString());
            }
            writer.endNode();
        }

    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {

        Map<String, Object> map = new HashMap<String, Object>();
        Map <String, Integer> numbersMap = new HashMap<String, Integer>();


        while(reader.hasMoreChildren()) {

            reader.moveDown();

            String key = reader.getNodeName();
            String value = reader.getValue();

            if (!numbersMap.containsKey(key)) {
                numbersMap.put(key, 0);
            }

            if (map.containsKey(key)) {
                numbersMap.put(key, numbersMap.get(key) + 1);
                key += numbersMap.get(key);
            }

            map.put(key, value);
            Map<String, Object> map1 = new HashMap<>();

            while(reader.hasMoreChildren()) {

                reader.moveDown();

                String key1 = reader.getNodeName();
                String value1 = reader.getValue();

                if (!numbersMap.containsKey(key1)) {
                    numbersMap.put(key1, 0);
                }

                if (map1.containsKey(key1)) {
                    numbersMap.put(key1, numbersMap.get(key1) + 1);
                    key1 += numbersMap.get(key1);
                }

                map1.put(key1, value1);
                map.put(key, map1);
                Map<String, Object> map2 = new HashMap<>();

                while(reader.hasMoreChildren()) {

                    reader.moveDown();

                    String key2 = reader.getNodeName();
                    String value2 = reader.getValue();

                    if (!numbersMap.containsKey(key2)) {
                        numbersMap.put(key2, 0);
                    }

                    if (map2.containsKey(key2)) {
                        numbersMap.put(key2, numbersMap.get(key2) + 1);
                        key2 += numbersMap.get(key2);
                    }

                    map2.put(key2, value2);
                    map1.put(key1, map2);
                    Map<String, Object> map3 = new HashMap<>();

                    while(reader.hasMoreChildren()) {

                        reader.moveDown();

                        String key3 = reader.getNodeName();
                        String value3 = reader.getValue();

                        if (!numbersMap.containsKey(key3)) {
                            numbersMap.put(key3, 0);
                        }

                        if (map3.containsKey(key3)) {
                            numbersMap.put(key3, numbersMap.get(key3) + 1);
                            key3 += numbersMap.get(key3);
                        }

                        map3.put(key3, value3);
                        map2.put(key2, map3);
                        Map<String, Object> map4 = new HashMap<>();

                        while(reader.hasMoreChildren()) {

                            reader.moveDown();

                            String key4 = reader.getNodeName();
                            String value4 = reader.getValue();

                            if (!numbersMap.containsKey(key4)) {
                                numbersMap.put(key4, 0);
                            }

                            if (map4.containsKey(key4)) {
                                numbersMap.put(key4, numbersMap.get(key4) + 1);
                                key4 += numbersMap.get(key4);
                            }

                            map4.put(key4, value4);
                            map3.put(key3, map4);

                            reader.moveUp();
                        }

                        reader.moveUp();
                    }

                    reader.moveUp();
                }

                reader.moveUp();
            }

            reader.moveUp();
        }

        return map;
    }

}