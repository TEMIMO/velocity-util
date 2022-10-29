import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

public class VelocityConverter {
    public static void main(String[] args) {
        VelocityContext context = new VelocityContext();

        File file = new File("src/main/resources/ПФ_103ПП.xml");
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("payreg", Map.class);
        xStream.registerConverter(new MapEntryConverter());
        Map<String,Object> map = (Map<String,Object>) xStream.fromXML(file);

        context.put("data", map);

        StringWriter stringWriter = new StringWriter();
        Reader reader = new StringReader("src/main/resources/example");
        Velocity.evaluate(context, stringWriter, "VelocityService", reader);

        byte[] bytes = stringWriter.toString().getBytes(Charset.forName("windows-1251"));
        String result = Arrays.toString(bytes);

        System.out.println(result);
    }
}

