import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

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

        Map<String, String> map = new HashMap<String, String>();
        Map <String, Integer> numbersMap = new HashMap<String, Integer>();


        while(reader.hasMoreChildren()) {

            reader.moveDown();

            String key = reader.getNodeName();
            String value = reader.getValue();

            while(reader.hasMoreChildren()) {

                reader.moveDown();

                String key1 = key + reader.getNodeName();
                String value1 = reader.getValue();

                while(reader.hasMoreChildren()) {

                    reader.moveDown();

                    String key2 = key1 + reader.getNodeName();
                    String value2 = reader.getValue();

                    while(reader.hasMoreChildren()) {

                        reader.moveDown();

                        String key3 = key2 + reader.getNodeName();
                        String value3 = reader.getValue();

                        while(reader.hasMoreChildren()) {

                            reader.moveDown();

                            String key4 = key3 + reader.getNodeName();
                            String value4 = reader.getValue();

                            if (!numbersMap.containsKey(key4)) {
                                numbersMap.put(key4, 1);
                                key4 += numbersMap.get(key4);
                            }

                            if (map.containsKey(key4)) {
                                numbersMap.put(key4, numbersMap.get(key4) + 1);
                                key4 += numbersMap.get(key4);
                            }

                            map.put(key4, value4);

                            reader.moveUp();
                        }

                        if (!numbersMap.containsKey(key3)) {
                            numbersMap.put(key3, 1);
                            key3 += numbersMap.get(key3);
                        }

                        if (map.containsKey(key3)) {
                            numbersMap.put(key3, numbersMap.get(key3) + 1);
                            key3 += numbersMap.get(key3);
                        }

                        map.put(key3, value3);

                        reader.moveUp();
                    }

                    if (!numbersMap.containsKey(key2)) {
                        numbersMap.put(key2, 1);
                        key2 += numbersMap.get(key2);
                    }

                    if (map.containsKey(key2)) {
                        numbersMap.put(key2, numbersMap.get(key2) + 1);
                        key2 += numbersMap.get(key2);
                    }

                    map.put(key2, value2);

                    reader.moveUp();
                }

                if (!numbersMap.containsKey(key1)) {
                    numbersMap.put(key1, 1);
                    key1 += numbersMap.get(key1);
                }

                if (map.containsKey(key1)) {
                    numbersMap.put(key1, numbersMap.get(key1) + 1);
                    key1 += numbersMap.get(key1);
                }

                map.put(key1, value1);

                reader.moveUp();
            }

            if (!numbersMap.containsKey(key)) {
                numbersMap.put(key, 1);
                key += numbersMap.get(key);
            }

            if (map.containsKey(key)) {
                numbersMap.put(key, numbersMap.get(key) + 1);
                key += numbersMap.get(key);
            }

            map.put(key, value);

            reader.moveUp();
        }

        return map;
    }

}